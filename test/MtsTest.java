import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        acceptCookieConsent();
    }

    private void acceptCookieConsent() {
        WebElement acceptButton = driver.findElement(By.id("cookie-agree"));
        if (acceptButton.isDisplayed() && acceptButton.isEnabled()) {
            acceptButton.click();
        }
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", blockTitle.getText());
    }

    @Test
    public void testPaymentSystemLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//div[@class='pay__partners']//img"));
        assertEquals(5, logos.size());

        String[] expectedLogos = {
                "Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"
        };

        for (int i = 0; i < logos.size(); i++) {
            assertEquals(expectedLogos[i], logos.get(i).getAttribute("alt"));
        }
    }

    @Test
    public void testMoreInfoLink() {
        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreInfoLink.click();

        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(expectedUrl, driver.getCurrentUrl());

        driver.navigate().back();
    }

    @Test
    public void testFormSubmission() {
        WebElement phoneInput = driver.findElement(By.id("connection-phone"));
        WebElement sumInput = driver.findElement(By.id("connection-sum"));
        WebElement emailInput = driver.findElement(By.id("connection-email"));
        WebElement submitButton = driver.findElement(By.xpath("//form[@id='pay-connection']//button[@type='submit']"));

        phoneInput.sendKeys("297777777");
        sumInput.sendKeys("10");
        emailInput.sendKeys("test@example.com");

        submitButton.click();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

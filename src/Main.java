import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Гном", "Дворф", "Гном", "Орк", "Дворф", "Тролль", "Гном", "Тролль", "Человек", "Отрекшийся", "Отрекшийся", "Человек", "Гном", "Эльф", "Орк"};
        UniqueWords uniqueWords = new UniqueWords(words);

        Set<String> uniqueWordsSet = uniqueWords.getUniqueWords();
        System.out.println("Список уникальных слов: " + uniqueWordsSet);

        Map<String, Integer> wordCountMap = uniqueWords.getWordCount();
        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Karpacheva", "89653779051");
        phoneBook.add("Stepankov", "89771676485");
        phoneBook.add("Karpacheva", "89653779071");
        phoneBook.add("Baranova", "89031335377");

        System.out.println("Номера для Karpacheva: " + phoneBook.get("Karpacheva"));
        System.out.println("Номера для Baranova: " + phoneBook.get("Baranova"));
        System.out.println("Номера для Stepankov: " + phoneBook.get("Stepankov"));
        System.out.println("Номера для Fordring: " + phoneBook.get("Fordring"));
    }
}


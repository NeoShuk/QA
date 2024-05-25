public class Main {
    public static void main(String[] args) {
        Employee employeeTest = new Employee("Ivan Ivanov", "AQA", "ivanov@yandex.ru", "89585347064", 50000, 24);
        employeeTest.printInfo();
        System.out.println();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Sergey", "Engineer", "ivivan123@mail.com", "89509404929", 30000, 31);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrovvvvv@gmail.com", "89014765294", 40000, 45);
        employees[2] = new Employee("Sidorov Ivan", "Director", "sidorov_ivanchela@yahoo.com", "89945578995", 50000, 52);
        employees[3] = new Employee("Smirnov Ivan", "Developer", "smirnov234@mail.com", "89580393053", 35000, 28);
        employees[4] = new Employee("Kuznetsov Alexey", "Analyst", "kuznetsov9057@yandex.com", "89018769581", 45000, 35);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        Park park = new Park();
        Park.Attraction[] attractions = new Park.Attraction[3];
        attractions[0] = park.new Attraction("Roller Coaster", "10:00 - 18:00", 5.0);
        attractions[1] = park.new Attraction("Ferris Wheel", "09:00 - 20:00", 3.0);
        attractions[2] = park.new Attraction("Haunted House", "11:00 - 22:00", 6.0);

        for (Park.Attraction attraction : attractions) {
            attraction.printInfo();
            System.out.println();
        }
    }
}

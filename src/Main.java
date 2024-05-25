public class Main {
    public static void main(String[] args) {
        Employee employeeTest = new Employee("Ivan Ivanov", "Engineer", "ivanov@example.com", "123-456-7890", 50000, 30);
        employeeTest.printInfo();
        System.out.println();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Sergey", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 40000, 40);
        employees[2] = new Employee("Sidorov Ivan", "Director", "sidorov@mailbox.com", "892312314", 50000, 50);
        employees[3] = new Employee("Smirnov Ivan", "Developer", "smirnov@mailbox.com", "892312315", 35000, 28);
        employees[4] = new Employee("Kuznetsov Alexey", "Analyst", "kuznetsov@mailbox.com", "892312316", 45000, 35);

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

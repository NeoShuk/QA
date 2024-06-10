public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Дарик");
        Cat peanut = new Cat("Орешек");

        dog.run(150);
        dog.swim(15);

        peanut.run(150);
        peanut.swim(5);

        Cat[] cats = {new Cat("Элвис"), new Cat("Сати"), new Cat("Бина")};
        Bowl bowl = new Bowl(10);

        for (Cat cat : cats) {
            cat.eat(bowl, 5);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость: " + cat.isSatiety());
        }

        bowl.addFood(10);

        for (Cat cat : cats) {
            if (!cat.isSatiety()) {
                cat.eat(bowl, 10);
                System.out.println(cat.name + " сытость: " + cat.isSatiety());
            }
        }
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        System.out.println();

        Shape circle = new Circle(5, "Красный", "Синий");
        Shape rectangle = new Rectangle(4, 6, "Зеленый", "Желтый");
        Shape triangle = new Triangle(3, 4, 5, "Фиолетовый", "Белый");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}



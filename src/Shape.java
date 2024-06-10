public interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();
    String getName();
    default void printInfo() {
        System.out.println("Название фигуры: " + getName());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}

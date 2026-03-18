public class Shape {
    public static void main(String[] args) {
        Circle circle1 = new Circle (15.3, "белый", "черный");
        circle1.circleInfo();
        Rectangle rectangle1 = new Rectangle(2, 4.5, "зеленый", "черный");
        rectangle1.rectangleInfo();
        Triangle triangle1 = new Triangle(6, 8, 10, "Розовый", "Белый");
        triangle1.triangleInfo();
    }
}

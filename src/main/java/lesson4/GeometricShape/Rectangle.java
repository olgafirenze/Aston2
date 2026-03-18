public class Rectangle implements Calculations {
    private double width;
    private double height;
    private String rectangleInnerColor;
    private String rectangleLineColor;

    public Rectangle (double width, double height, String rectangleInnerColor, String rectangleLineColor) {
        this.width = width;
        this.height = height;
        this.rectangleInnerColor = rectangleInnerColor;
        this.rectangleLineColor = rectangleLineColor;
    }

    @Override
    public double getArea () {
        return width * height;
    }

    @Override
    public double getPerimeter () {
        return width + height;
    }

    public void rectangleInfo () {
        System.out.printf("\nПрямоугольник\nширина %.2f\nвысота %.2f\nплощадь %.2f\nпериметр %.2f\nцвет заливки %s\nцвет границы %s\n", width, height, getArea(), getPerimeter(), rectangleInnerColor, rectangleLineColor);
    }
}

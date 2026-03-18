public class Circle implements Calculations {
    private double radius;
    private String circleInnerColor;
    private String circleLineColor;

    public Circle (double radius, String circleInnerColor, String circleLineColor) {
        this.radius = radius;
        this.circleInnerColor = circleInnerColor;
        this.circleLineColor = circleLineColor;
    }

    @Override
    public double getArea () {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }

    public void circleInfo () {
        System.out.printf("\nКруг\nрадиус %.2f\nплощадь %.2f\nпериметр %.2f\nцвет заливки %s\nцвет границы %s\n", radius, getArea(), getPerimeter(), circleInnerColor, circleLineColor);

    }
}

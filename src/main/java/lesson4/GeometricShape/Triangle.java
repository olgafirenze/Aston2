public class Triangle implements Calculations {
    private double sideA;
    private double sideB;
    private double sideC;
    private double p;
    private String triangleInnerColor;
    private String triangleLineColor;

    public Triangle (double sideA, double sideB, double sideC, String triangleInnerColor, String triangleLineColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.triangleInnerColor = triangleInnerColor;
        this.triangleLineColor = triangleLineColor;
    }

    @Override
    public double getPerimeter () {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea () {
        p = getPerimeter()/2;
        return Math.sqrt(p * ( p - sideA ) * ( p - sideB ) * ( p - sideC ));
    }

    public void triangleInfo () {
        System.out.printf("\nТреугольник\nсторона A %.2f\nсторона B %.2f\nсторона C %.2f\nплощадь %.2f\nпериметр %.2f\nцвет заливки %s\nцвет границы %s\n", sideA, sideB, sideC, getArea(), getPerimeter(), triangleInnerColor, triangleLineColor);

    }
}

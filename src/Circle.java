public class Circle implements Measurable {

    private double cx = 0; // centre x
    private double cy = 0; // centre y
    private double r = 1; // radius

    //Constructor
    public Circle(double cx, double cy, double r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return Math.PI*this.r*2;
    }

    @Override
    public void scale(double scaleValue) {
        r = r * scaleValue;
    }
}
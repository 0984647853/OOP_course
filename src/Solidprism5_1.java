public class Solidprism5_1 extends Prism {

    public Solidprism5_1(double height, double width, double depth, double density) {
        super(height, width, depth);
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    private double density;

    public double mass() {
        return volume()*density;
    }
}

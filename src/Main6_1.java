import java.util.ArrayList;

public class Main6_1 {
    public static void main(String[] args) {
        ArrayList<Measurable> measurables = new ArrayList<>();
        RectangleV2 rectangleV2_1 = new RectangleV2(1.0, 1.0, 2.0, 4.0);
        Circle circle_1 = new Circle(5.0, 5.0, 2.0);
        measurables.add(rectangleV2_1);
        measurables.add(circle_1);
        rectangleV2_1.scale(10.0);
        circle_1.scale(5.0);
        System.out.println("Rectangle: ");
        System.out.println("Perimeter: " + rectangleV2_1.perimeter());
        System.out.println("Area: " + rectangleV2_1.area());
        System.out.println("Circle: ");
        System.out.println("Perimeter: "+circle_1.perimeter());
        System.out.println("Area: "+circle_1.area());

    }

}

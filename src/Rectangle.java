public class Rectangle {
    private double lower_left_x;
    private double lower_left_y;
    private double upper_right_x;
    private double upper_right_y;

    public Rectangle() {
        this.lower_left_x=0;
        this.lower_left_y=0;
        this.upper_right_x=1;
        this.upper_right_y=1;
    }

    public Rectangle(double upper_right_x, double upper_right_y) {
        this.upper_right_x = upper_right_x;
        this.upper_right_y = upper_right_y;
        this.lower_left_x=0;
        this.lower_left_y=0;
    }

    public Rectangle(double lower_left_x, double lower_left_y, double upper_right_x, double upper_right_y) {
        this.lower_left_x = lower_left_x;
        this.lower_left_y = lower_left_y;
        this.upper_right_x = upper_right_x;
        this.upper_right_y = upper_right_y;
    }

    public double width() {
        return upper_right_x-lower_left_x;
    }

    public double height() {
        return upper_right_y-lower_left_y;
    }

    public double area() {
        return width()*height();
    }
}


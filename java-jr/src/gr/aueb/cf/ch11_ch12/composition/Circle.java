package gr.aueb.cf.ch11_ch12.composition;

public class Circle {

    private Point center;
    private Point radius;

    public Circle() {}

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

    public String convertToString() {
        return "Center" + center.pointToString() + ", " + radius;
    }
}

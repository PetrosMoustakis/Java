package gr.aueb.cf.ch11_ch12.composition;

/**
 * Immutable circle with mutable Point
 */

public final class ImmutableCircle {

    private final Point center;
    private final int radius;

    public ImmutableCircle() {
        center = new Point();
        radius = 0;
    }

    public ImmutableCircle(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    public int getRadius() {
        return radius;
    }

    public String convertToString() {
        return "Center" + center.pointToString() + ", " + radius;
    }

}

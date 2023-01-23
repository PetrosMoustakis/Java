package gr.aueb.cf.ch14.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory {
    private static final List<ImmutablePoint> points = new ArrayList<>();

    private static final List<ImmutableCircle> circles = new ArrayList<>();

    private FlyweightFactory() {}

    public static ImmutablePoint getPoint(int x, int y) {
        ImmutablePoint point = null;

        if (!pointExists(x, y, point)) {
            point = new ImmutablePoint(x, y);
            points.add(point);
        }

        return point;
    }

    public static boolean pointExists(int x, int y, ImmutablePoint point) {
        boolean found = false;
        point = null;

        for (ImmutablePoint p : points) {
            if ((p.getX() == x) && (p.getY() == y)) {
                point = p;
                found = true;
                break;
            }
        }
        return found;
    }

    private static boolean circleExists(ImmutablePoint point, int radius, ImmutableCircle circle) {
        boolean found = false;
        circle = null;

        for (ImmutableCircle c: circles) {
            if ((c.getCenter() == point) && (c.getRadius() == radius)) {
                circle = c;
                found = true;
                break;
            }
        }
         return found;
    }

    public static ImmutableCircle getCircle (ImmutablePoint center, int radius) {
        ImmutableCircle circle = null;

        if (!circleExists(center,radius,circle)) {
            circle = new ImmutableCircle(center,radius);
            circles.add(circle);
        }
        return circle;
    }

 }


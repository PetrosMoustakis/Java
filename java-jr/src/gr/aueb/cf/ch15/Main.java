package gr.aueb.cf.ch15;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point2D p2 = new Point2D();
        Point3D p3 = new Point3D();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

}

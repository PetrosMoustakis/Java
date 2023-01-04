package gr.aueb.cf.ch9;

import gr.aueb.cf.ch12.PointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {

        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(20, 10, 5);

        p1.setX(10);
        p1.setY(20);
        p1.setZ(5);

        System.out.println(p1.pointToString());
        System.out.println(p2.pointToString());

    }

}

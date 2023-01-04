package gr.aueb.cf.ch11_ch12.pointproject.app;

import gr.aueb.cf.ch11_ch12.pointproject.model.Point;
//import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {
        Point point = new Point();

        point.setX(10);
        point.setY(20);

        System.out.println(point.pointToString());
    }
}

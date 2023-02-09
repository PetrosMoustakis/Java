package gr.aueb.cf.ch16;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle,Cloneable, Serializable {

    private double radius;
    private static final long serialVersionUID = 1L;

    Circle () {}

    public Circle(double radius) {
        this.radius = radius;
    }

    //copy constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI / (radius * 2);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getRadius());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

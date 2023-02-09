package gr.aueb.cf.ch16;

import java.io.Serializable;

public class Line extends AbstractShape implements ILine,Cloneable, Serializable {

    private double length;
    private static final long serialVersionUID = 1L;

    Line() {}

    public Line(double length) {
        this.length = length;
    }

    //Copy constructor
    public Line (Line line) {
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Line line = (Line) o;

        return Double.compare(line.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}

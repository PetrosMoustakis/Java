package gr.aueb.cf.ch15;

public class Point3D extends Point2D {

    private double z;

    public Point3D() {
        super();
        z = 9;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String convertToString() {
        return "(" + getX() + "," + getY() + ", " + z + ")";
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(super.getDistanceFromOrigin(),2.0) + Math.pow((z),2.0));
    }
}

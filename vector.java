public class vector {
    public double wx; // W is for world
    public double wy;
    public double wz;
    public double cx; // C is for camera
    public double cy;
    public vector(double x, double y) {
        cx = x;
        cy = y;
    }
    public double getCX() {
        return cx;
    }
    public double getCY() {
        return cy;
    }
    public double getWX() {
        return wx;
    }
    public double getWY() {
        return wy;
    }
    public double getWZ() {
        return wz;
    }
    public void setCX(double a) {
        cx = a;
    }
    public void setCY(double a) {
        cy = a;
    }
    public void setWX(double a) {
        wx = a;
    }
    public void setWY(double a) {
        wy = a;
    }
    public void setWZ(double a) {
        wz = a;
    }
}
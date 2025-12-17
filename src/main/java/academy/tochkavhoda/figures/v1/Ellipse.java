package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Ellipse {
    private int xCenter;
    private int yCenter;
    private int xAxis;
    private int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis) {
        this.xCenter = center.getX();
        this.yCenter = center.getY();
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xAxis, int yAxis) {
        this.xCenter = 0;
        this.yCenter = 0;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse() {
        this(1, 1);
    }

    public Point getCenter() {
        return new Point(xCenter, yCenter);
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public void setCenter(Point center) {
        xCenter = center.getX();
        yCenter = center.getY();
    }

    public void moveTo(int x, int y) {
        xCenter = x;
        yCenter = y;
    }

    public void moveTo(Point point) {
        xCenter = point.getX();
        yCenter = point.getY();
    }

    public void moveRel(int dx, int dy) {
        xCenter += dx;
        yCenter += dy;
    }

    public void resize(double ratio) {
        xAxis = (int) (getXAxis() * ratio);
        yAxis = (int) (getYAxis() * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        xAxis = (int) (getXAxis() * xRatio);
        yAxis = (int) (getYAxis() * yRatio);
    }

    public double getArea() {
        return Math.PI * ((double) xAxis * yAxis) / 4.0;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * Math.sqrt(
                ((double) xAxis * xAxis + (double) yAxis * yAxis) / 8.0);
    }

    public boolean isInside(int x, int y) {
        double xSemiaxis = xAxis / 2.0;
        double ySemiaxis = yAxis / 2.0;
        double dx = x - getCenter().getX();
        double dy = y - getCenter().getY();
        double val = (dx * dx) / (xSemiaxis * xSemiaxis) + (dy * dy) / (ySemiaxis * ySemiaxis);
        return val <= 1.0 + 1e-12;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return xCenter == ellipse.xCenter && yCenter == ellipse.yCenter && xAxis == ellipse.xAxis && yAxis == ellipse.yAxis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCenter, yCenter, xAxis, yAxis);
    }
}

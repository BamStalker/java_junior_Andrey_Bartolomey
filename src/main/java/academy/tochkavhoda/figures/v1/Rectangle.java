package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Rectangle {
    private int xLeft;
    private int yTop;
    private int xRight;
    private int yBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.xLeft = leftTop.getX();
        this.yTop = leftTop.getY();
        this.xRight = rightBottom.getX();
        this.yBottom = rightBottom.getY();
    }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.xRight = xRight;
        this.yBottom = yBottom;
    }

    public Rectangle(int length, int width) {
        this.xLeft = 0;
        this.yBottom = 0;
        this.xRight = length;
        this.yTop = -width;
    }

    public Rectangle() {
        this(1,1);
    }

    public Point getTopLeft() {
        return new Point(xLeft, yTop);
    }

    public Point getBottomRight(){
        return new Point(xRight, yBottom);
    }

    public void setTopLeft(Point topLeft){
        xLeft = topLeft.getX();
        yTop = topLeft.getY();
    }

    public void setBottomRight(Point bottomRight){
        xRight = bottomRight.getX();
        yBottom = bottomRight.getY();
    }

    public int getLength(){
        return xRight - xLeft;
    }

    public int getWidth(){
        return yBottom - yTop;
    }

    public void moveTo(int x, int y) {
        int length = getLength();
        int width = getWidth();
        this.xLeft = x;
        this.yTop = y;
        this.xRight = x + length;
        this.yBottom = y + width;
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy){
        this.xLeft += dx;
        this.yTop += dy;
        this.xRight += dx;
        this.yBottom += dy;
    }

    public void resize(double ratio){
        int newLength = (int) (getLength() * ratio);
        int newWidth = (int) (getWidth() * ratio);
        xRight = xLeft + newLength;
        yBottom = yTop + newWidth;
    }

    public void stretch(double xRatio, double yRatio){
        int newLength = (int) (getLength() * xRatio);
        int newWidth = (int) (getWidth() * yRatio);
        this.xRight = this.xLeft + newLength;
        this.yBottom = this.yTop + newWidth;
    }

    public double getArea(){
        return (double) getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2.0 * (getLength() + getWidth());
    }

    public boolean isInside(int x, int y){
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public boolean isInside(Point point){
        return  isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle rectangle){
        return !(rectangle.xRight < this.xLeft || rectangle.xLeft > this.xRight ||
                rectangle.yBottom < this.yTop || rectangle.yTop > this.yBottom);
    }

    public boolean isInside(Rectangle rectangle){
        return rectangle.xLeft >= this.xLeft && rectangle.xRight <= this.xRight &&
                rectangle.yTop >= this.yTop && rectangle.yBottom <= this.yBottom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return xLeft == rectangle.xLeft && yTop == rectangle.yTop &&
                xRight == rectangle.xRight && yBottom == rectangle.yBottom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLeft, yTop, xRight, yBottom);
    }
}

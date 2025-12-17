package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Square {
    private int xLeft;
    private int yTop;
    private int xRight;
    private int yBottom;

    public Square(Point leftTop, int size) {
        this.xLeft = leftTop.getX();
        this.yTop = leftTop.getY();
        this.xRight = leftTop.getX() + size;
        this.yBottom = leftTop.getY() + size;
    }

    public Square(int xLeft, int yTop, int size) {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.xRight = xLeft + size;
        this.yBottom = yTop + size;
    }

    public Square(int size) {
        this.xLeft = 0;
        this.yBottom = 0;
        this.xRight = size;
        this.yTop = -size;
    }

    public Square() {
        this(1);
    }

    public Point getTopLeft() {
        return new Point(xLeft, yTop);
    }

    public Point getBottomRight() {
        return new Point(xRight, yBottom);
    }

    public void setTopLeft(Point topLeft) {
        int lenght = getLength();
        xLeft = topLeft.getX();
        yTop = topLeft.getY();
        xRight = xLeft + lenght;
        yBottom = yTop + lenght;
    }

    public int getLength() {
        return xRight - xLeft;
    }

    public void moveTo(int x, int y) {
        int length = getLength();
        this.xLeft = x;
        this.yTop = y;
        this.xRight = x + length;
        this.yBottom = y + length;
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        this.xLeft += dx;
        this.yTop += dy;
        this.xRight += dx;
        this.yBottom += dy;
    }

    public void resize(double ratio) {
        int newLength = (int) (getLength() * ratio);
        xRight = xLeft + newLength;
        yBottom = yTop + newLength;
    }

    public double getArea() {
        return (double) getLength() * getLength();
    }

    public double getPerimeter() {
        return 4.0 * getLength();
    }

    public boolean isInside(int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Square square) {
        return !(square.xRight < this.xLeft || square.xLeft > this.xRight ||
                square.yBottom < this.yTop || square.yTop > this.yBottom);
    }

    public boolean isInside(Square square) {
        return square.xLeft >= this.xLeft && square.xRight <= this.xRight &&
                square.yTop >= this.yTop && square.yBottom <= this.yBottom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return xLeft == square.xLeft && yTop == square.yTop &&
                xRight == square.xRight && yBottom == square.yBottom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLeft, yTop, xRight, yBottom);
    }
}

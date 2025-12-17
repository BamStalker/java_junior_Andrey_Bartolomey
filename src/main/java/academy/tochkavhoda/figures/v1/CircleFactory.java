package academy.tochkavhoda.figures.v1;

public class CircleFactory {
    private static int circleCounter = 0;

    public static Circle createCircle(Point center, int radius) {
        circleCounter++;
        return new Circle(center, radius);
    }

    public static int getCircleCount() {
        return circleCounter;
    }

    public static void reset() {
        circleCounter = 0;
    }
}


public class Cylinder {
    private static final double Volume = 10;

    public static double getVolume(int radius, int height) {
        Math.floor(getPerimeter(radius) * height + 2 * getBaseArea(radius) /10 );
        return Volume;
    }

    public static double getPerimeter(int radius) {
        return Math.floor((radius * 2 * Math.PI) /10);
    }

    public static double getBaseArea(int radius) {
        return Math.floor((Math.PI * radius * radius) /10);
    }
}
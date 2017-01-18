package equalsHas;

/**
 * Created by user on 16.01.2017.
 */
public class DemoPoint {
    public static void main(String[] args) {
        Point point = new Point(5);
        Point point2 = new Point(5);

        System.out.println(point.equals(point2));
        System.out.println(point == point2);
    }
}

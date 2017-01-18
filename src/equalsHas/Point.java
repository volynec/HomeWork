package equalsHas;

import java.util.Objects;


/**
 * Created by user on 16.01.2017.
 */
public class Point {
    private int x;
    private int y;
    private int z;
    private int a;
    private int b;
    private int c;

    public Point(int i) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        if (y != point.y) return false;
        if (z != point.z) return false;
        if (a != point.a) return false;
        if (b != point.b) return false;
        return c == point.c;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        result = 31 * result + a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }
}

package equalsHas;

/**
 * Created by user on 16.01.2017.
 */
public class Run {

    static Integer x= 12;
    static Integer y= 12;
    static Integer x1= 212;
    static Integer y1= 212;
    static String x2= "abc";
    static String y2= "abc";


    public static void main(String[] args) {

        System.out.println(Long.valueOf(12) == Long.valueOf(12));
        System.out.println(Long.valueOf(212) == Long.valueOf(212));
        System.out.println(x == y);
        System.out.println(x1 == y1);
        System.out.println(x2 == y2);
        System.out.println(new String("abc") == new String("abc"));
        System.out.println(new String("abc").intern() == new String("abc").intern());

    }
}

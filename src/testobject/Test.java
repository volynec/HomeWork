package testobject;

/**
 * Created by user on 09.01.2017.
 */
public class Test {
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    public static void main(String[] args) {
//        boolean b = true;
//        int x = 0;
//        do {
//            if (x++ > 5)
//                b = false;
//            System.out.println(x);
//        } while (b);
//        System.out.println(6^2);

        Integer a = new Integer(6);
        Integer b = new Integer(6);
        System.out.println(a == b); // false т.к. это разные объекты с разными ссылками
        System.out.println(a.equals(b)); // true, здесь уже задействована логика сравнения


    }


}

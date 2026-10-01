import java.util.ArrayList;

public class Demo2 {
    static void main() {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        for (Object o : l)
         System.out.println(o);

    }
}

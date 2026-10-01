import java.util.ArrayList;
import java.util.List;

public class Demo {
    static void main() {
        List l =  new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        List l1 = new ArrayList();
        l1.add(60);
        l1.add(70);
        l1.addAll(l);
        l1.removeAll(l);
        l1.remove(new Integer(40));
        System.out.println(l1.containsAll(l));
        l1.retainAll(l);
        System.out.println(l1.containsAll(l));
        System.out.println(l1);
    }
}

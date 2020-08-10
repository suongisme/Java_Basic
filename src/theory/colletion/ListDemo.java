package theory.colletion;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lstD = new ArrayList<>();
        lstD.add(1);
        lstD.add(2);
        lstD.add(3);
        lstD.add(4);
        lstD.add(5);

        // using listIterator to access element of lstD
        ListIterator<Integer> a = lstD.listIterator();
        a.next();
        System.out.println(a.next());
        System.out.println(a.previous());
    }
}

package theory.colletion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> st = new HashSet();
        st.add("1suong");
        st.add("2suong");
        st.add("3suong");
        st.add("4suong");

        // using Iterator to access element of Set
        Iterator<String> it = st.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

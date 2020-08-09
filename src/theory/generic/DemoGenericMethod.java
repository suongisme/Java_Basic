package theory.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoGenericMethod {

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        GenericClass<String, Integer> gc = new GenericClass<String, Integer>("SuongNguyen",19);
        String key = gm.getThing(gc);
        int value = gm.getV(gc);
        System.out.println(key+" "+value);

        ArrayList<String> listString = new ArrayList<>();
        listString.add("1.Suong");
        listString.add("2.Suong");
        listString.add("3.Suong");
        listString.add("4.Suong");
        listString.add("5.Suong");

        String firstElement = gm.getList(listString);
        System.out.println(firstElement);

        try {
            User a = User.class.newInstance();
            a.setName("suong");
            System.out.println(a.getName());
        }catch (Exception x){
            System.out.println(x);
        }
        ArrayList<String> lst = new ArrayList<>();
        lst.add("1suong");
        lst.add("2suong");
        lst.add("3suong");
        lst.add("4suong");
        ArrayList<? extends Object> get = lst;
    }
}

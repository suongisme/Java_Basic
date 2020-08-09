package theory.generic;

import java.util.ArrayList;

public class GenericMethod {

    public <K, V> K getThing(GenericClass<K,V> x){
        return x.getKey();
    }
    public <K,V> V getV(GenericClass<K,V> x) {
        return x.getValue();
    }


    public <K> K getList(ArrayList<K> x) {
        if (x == null || x.size() == 0){
            return null;
        }
        return x.get(0);
    }

}

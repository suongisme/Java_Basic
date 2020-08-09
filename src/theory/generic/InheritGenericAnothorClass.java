package theory.generic;

public class InheritGenericAnothorClass<K, V, N> extends GenericClass<K,V>{
    private N something;

    public InheritGenericAnothorClass(K key, V value, N something) {
        super(key, value);
        this.something = something;
    }

    public N getSomething() {
        return something;
    }

    public void setSomething(N something) {
        this.something = something;
    }
}

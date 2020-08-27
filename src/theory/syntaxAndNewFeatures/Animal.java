package theory.syntaxAndNewFeatures;

public interface Animal extends WildLife{
    // this is abstract method of Animal interface
    public void speak();
    public void eat();
    public void sleep();


    // 'default' keyword mean this method is non-abstract method
    // this is non-abstract method of Animal interface
    default void run() {
        System.out.println("Running");
    }
}

package theory.syntaxAndNewFeatures;

@FunctionalInterface
public interface WildLife {
    // this is FunctionInterface
    // FunctionInterface just has a abstract method
    // Using @FunctionInterface annotation to notify when add other abstract method
    public void hunt();

    // can add default method
    default void play() {
        System.out.println("Playing");
    }


}

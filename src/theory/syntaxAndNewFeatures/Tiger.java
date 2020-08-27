package theory.syntaxAndNewFeatures;

public class Tiger implements Animal, WildLife{
    @Override
    public void eat() {
        System.out.println("This tiger is eating");
    }

    @Override
    public void sleep() {
        System.out.println("This tiger is sleeping");
    }

    @Override
    public void speak() {
        System.out.println("This tiger is speaking");
    }

    @Override
    public void hunt() {
        System.out.println("This tiger have hunted");
    }
}

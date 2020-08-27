package theory.syntaxAndNewFeatures;

public  class Dog implements Animal{

    // Dog class implements Animal interface
    // just override abstract method
    // don't need override non-abstract method(run)
    @Override
    public void speak() {
        System.out.println("The dog is speaking");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }

    @Override
    public void hunt() {
        System.out.println("The dog doesn't know hunt");
    }
}

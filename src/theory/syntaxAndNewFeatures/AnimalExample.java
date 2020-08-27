package theory.syntaxAndNewFeatures;

public class AnimalExample {
    public static void main(String[] args) {
        Animal sobidoo = new Dog();
        sobidoo.eat();
        sobidoo.sleep();
        sobidoo.speak();
        sobidoo.run();

        Animal tiger = new Tiger();
        tiger.eat();
        tiger.speak();
        tiger.sleep();
        tiger.hunt();
    }
}

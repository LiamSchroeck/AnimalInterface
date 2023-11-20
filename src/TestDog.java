public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println("Dog says: " + dog.makeSound());
        System.out.println("Dog moves: " + dog.move());

        String mischief = dog.misbehave("shoes");
        System.out.println("Dog misbehaved: " + mischief);
    }
}

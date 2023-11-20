class Driver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog says: " + dog.makeSound());
        System.out.println("Dog moves: " + dog.move());

        System.out.println("Bird says: " + bird.makeSound());
        System.out.println("Bird moves: " + bird.move());

        Dog mischievousDog = new Dog();
        String homework = mischievousDog.misbehave("homework");

        System.out.println("Dog misbehaved: " + homework);
    }
}

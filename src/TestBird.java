public class TestBird {
    public static void main(String[] args) {
        Animal bird = new Bird();

        System.out.println("Bird says: " + bird.makeSound());
        System.out.println("Bird moves: " + bird.move());
    }
}
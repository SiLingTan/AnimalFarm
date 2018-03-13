public class AnimalTest {

    public static void main(String[] args) {

        Animal lion = new Lion("lion", "roars", "zebras");
        Animal dog = new Dog("puppy", "purrs");
        GoldenRetriever bobby = new GoldenRetriever("Bobby", "woofs", "fetching the ball game");


        System.out.println(dog.makeSound());
        System.out.println(lion.makeSound());
        System.out.println(bobby.playsGames());

    }

}

public class AnimalTest {

    public static void main(String[] args) {

        Animal lion = new Lion("lion", "roars", "zebras");
        Animal dog = new Dog("puppy", "purrs");
        GoldenRetriever bobby = new GoldenRetriever("Bobby", "woofs", "fetching the ball game");

        animalFarm(lion);
        animalFarm(dog);
        animalFarm(bobby);
        System.out.println(bobby.playsGames());
    }

    private static void animalFarm(Animal myAnimal){
        System.out.println(myAnimal.makeSound());
        System.out.println(myAnimal.washesUp());
        System.out.println(myAnimal.driesUp());
        System.out.println(myAnimal.feedsTheYoung());
        System.out.println(myAnimal.eatsFood());
    }

}

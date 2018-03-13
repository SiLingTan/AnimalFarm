public abstract class Animal implements Feeding, Grooming{

    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String makeSound(){
        return name + " " + sound;
    }

    public String eatsFood(){
        return name + " eats meat";
    }

    public String feedsTheYoung(){
        return name + " feeds the young";
    }

    public String washesUp(){
        return name + " washes up";
    }
}

public class Dog extends Animal{

    public Dog(String name, String sound){
        super(name, sound);
    }

    public String driesUp(){
        return super.getName() + " dries itself";
    }

    @Override
    public String feedsTheYoung() {
        return super.feedsTheYoung() + " until they are 3 months old";
    }

    @Override
    public String eatsFood() {
        return super.getName() + " eats bones";
    }
}

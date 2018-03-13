public class Lion extends Animal{

    private String huntsFor;

    public Lion(String name, String sound, String huntsFor){
        super(name, sound);
        this.huntsFor = huntsFor;
    }

    @Override
    public String makeSound() {
        return String.format("%s when it hunts for %s", super.makeSound(), huntsFor);
    }

    @Override
    public String driesUp() {
        return super.getName() + " does not dry up itself";
    }

    @Override
    public String feedsTheYoung() {
        return super.feedsTheYoung() + " for about 2 months";
    }
}

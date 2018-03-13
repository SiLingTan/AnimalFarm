public class GoldenRetriever extends Dog {

    private String games;

    public GoldenRetriever(String name, String sound, String games){
        super(name, sound);
        this.games = games;
    }

    public String playsGames(){
        return String.format("%s enjoys playing %s", super.getName(), games);
    }
}

package project1411;

public class Textbook extends Book implements Illustrated{
    private String subject;

    public Textbook(SellSeason sellSeason) {
        super(sellSeason);
    }

    @Override
    public void illustrate() {

    }
}
package project1411;

public class NonFiction extends Book implements Limited {

    private String scienceField;

    public NonFiction(SellSeason sellSeason) {
        super(sellSeason);
    }

    @Override
    public void limit() {

    }
}

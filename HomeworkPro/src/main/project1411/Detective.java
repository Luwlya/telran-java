package project1411;

public class Detective extends Book implements Limited{
    private String killerName;

    public Detective(SellSeason sellSeason) {
        super(sellSeason);
    }

    @Override
    public void limit() {

    }
}
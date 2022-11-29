package project1411;

public class ChildrenBook extends Book implements Illustrated{

    private int ageLimit;

    public ChildrenBook(SellSeason sellSeason) {
        super(sellSeason);
    }

    @Override
    public void illustrate() {

    }
}

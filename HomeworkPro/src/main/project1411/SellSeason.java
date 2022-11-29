package project1411;

public enum SellSeason {
    WINTER("To warm you up"),
    SPRING("To refresh you"),
    SUMMER("To cool you"),
    AUTUMN("To bring you joy");


    public String getName;
    private String mood;

    SellSeason(String mood) {

        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

}

package project1411;

public class Date {
    private static SellSeason sellSeason;

    static void getName(String season) {
        System.out.println(season + "Bestseller");
    }

    public static void main(String[] args) {
        SellSeason sellSeason1 = SellSeason.WINTER;
        SellSeason sellSeason2 = SellSeason.SPRING;
        SellSeason sellSeason3 = SellSeason.SUMMER;
        SellSeason sellSeason4 = SellSeason.AUTUMN;
        System.out.println(sellSeason4.getMood());
    }
}

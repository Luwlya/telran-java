package project1411;

import java.util.ArrayList;

public class Book {
    private String name;
    private int numberOfPages;
    private int releaseDate;
    private String publisherName;
    private SellSeason sellSeason;

    public Book(SellSeason sellSeason) {

        this.sellSeason = sellSeason;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setReleaseDate(int releaseDate) {

        this.releaseDate = releaseDate;
    }

    public void setPublisherName(String publisherName) {

        this.publisherName = publisherName;
    }

    public static void main(String[] args) {
        ArrayList<String> bestsellerList = new ArrayList<>();
        bestsellerList.add(0, "NonFiction");
        bestsellerList.add(1, "ChildrenBook");
        System.out.println(bestsellerList);
    }
}




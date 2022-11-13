package homework7;

public class Wardrobe {
    private String color;
    private int shelfCount;
    private Size size;

    public Wardrobe(String color, int shelfCount, Size size) {
        this.color = color;
        this.shelfCount = shelfCount;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getShelfCount() {
        return shelfCount;
    }

    public Size getSize() {
        return size;
    }
}

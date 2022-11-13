package homework7;

public class Main {
    public static void main(String[] args) {
        Size size1 = new Size(150,180,50);
        Wardrobe wardrobe1 = new Wardrobe("Red",5, size1);
        Wardrobe wardrobe2 = new Wardrobe("White", 7, new Size(120, 150, 35));
        System.out.println(wardrobe1.getColor());
    }
}

package homework7;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        int d = 89;
        do {
            d = d + 3;
        } while (d < 100);
        System.out.println(d);

        String name = "Apple";
        while (name.length() > 2) {
            name = name.substring(0,name.length() -1);
            System.out.println(name);
        }
    }
}

package homework1;

public class Homework1 {
    static int klo;
    static double glo;

    static void getMin() {
        System.out.println(klo - glo);
    }

    static double getSub() {
        return (klo / glo);
    }

    static void getPlus() {
        System.out.println(klo + glo);
    }

    static double getMult() {
        return (klo * glo) + glo;
    }

    public static void main(String[] args) {
        klo = 78;
        glo = 6.6;
        double a = getMult();
        System.out.println(a);
        getPlus();
        getMin();
        System.out.println(getSub());
    }
}

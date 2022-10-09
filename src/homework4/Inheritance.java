package homework4;

public class Inheritance {
    public static void main(String[] args) {
       Device device;
       Computer computer;
       Laptop laptop;
       Macbook macbook = new Macbook();
       device = macbook;
       computer = (Laptop) device;
       laptop = (Laptop) computer;
        System.out.println(macbook);
    }
}

class Device {
}

class Computer extends Device {
}

class Laptop extends Computer {
}

class Macbook extends Laptop {
}

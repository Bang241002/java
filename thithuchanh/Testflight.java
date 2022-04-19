package java.thithuchanh;

public class Testflight {
    public static void main(String[] args) {
        Flight f1 = new Flight();
        f1.display();
        System.out.println(f1.getNumber());
        System.out.println(f1.getDestination());

        Flight f2 = new Flight(789,"T22109M");
        f2.display();
        System.out.println(f2.getNumber());
        System.out.println(f2.getDestination());
    }
}

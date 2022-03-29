public class vidu5 {
    public static void main (string[] args){

        Circle c1 = new Cricle(2.0, "blue ");
        System.out.println("the radius is:" + c1.getRadius());
        System.out.println("the color is:" + c1.getcolor());
        System.out.printf("the area is: %.2f%n" + c1.getArea());

        Circle c2 = new circle(2.0);
        System.out.println("the radius is:" + c1.getRadius());
        System.out.println("the color is:" + c1.getcolor());
        System.out.printf("the area is: %2.0%n" + c1.getArea());

        Circle c3 = new Cricle();
        System.out.println("the radius is:" + c1.getRadius());
        System.out.println("the color is:" + c1.getcolor());
        System.out.printf("the area is: %2.0%n" + c1.getArea());
    }
}
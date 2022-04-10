package thuake;

public class testcylinder {
    public static void main(String [] args){
        cylinder cy1 = new cylinder();

        System.out.println("radius is " + cy1.getRadius
        + ", Height is" + cy1.getHeight()
        + ", color is" + cy1.getcolor()
        + ", Base area is " cy1.getArea()
        + ", volume is " + cy1.getvolume());

        cylinder cy2 = new cylinder(5.0, 2.0);

        System.out.println("radius is" + cy2.getRadius
        +", height is " + cy2.getHeight()
        + ",color is " + cy2.getColor()
        + ", base area is" + cy2.getArea()
        + ", colume is" + cy2.getvolume();
        );

    }
}

package thuake;

public class cylinder {
    private double height;

    public cylinder(){
        super();
        this.height = 1.0;
        System.out.println("Constructed a cylinder with cylinder(");

    }

    public cylinder(double height){
        super();
        this.height = height;
        System.out.println("Constructed a cylinder with cylinder (height)");
    }

    public cylinder(double height, double radius){
        super();
        this.height = height;
        System.out.println("Constructed a cylinder with cylinder (height, radius , color)");
    }

    public cylinder(double height, double radius , String color){
        super(radius, color);
        this.height = height;
        System.out.println("constructed a cylinder with cylinder (height, radius, color)");

    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String toString(){
        return "this is a cylinder";
    }


}

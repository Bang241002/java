package dahinh;

public class circle {
    private double radius;

    public circle (double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "Circle[radius ="+ radius + "]";
    }
}

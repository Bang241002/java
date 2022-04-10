package thuake;

public class circle {
    private double radius;
    private String color;

    public circle(){
        this.radius = 1.0;
        this.color = "red";
        System.out.println("construced a circle with circle()");

    }

    public circle(double radius){
        this.radius = radius;
        this.color = "red";
        System.out.println("construced a circle with circle (radius)");

    }

    public circle(double radius, String color){
        this.radius = radius;
        this.color = color;
        System.out.println("construced a circle with corcle (radius, color)");
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return "circle [radius = " + radius + ",color= "+ color+"]";
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}

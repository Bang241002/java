
public class circle1 {
    private double radius;
    private string color;


    public circle1 {
        radius = 1.0;
        color = "red";
    }

    public circle1(double r){
        radius = r;
        color = "red";
    }

    public double getRadius(){
        return  radius ;
    }

    public double getArea (){
        return radius*radius*Math.PI;
    }
}

package dahinh;

public class Shape {

    private String color;

    public Shape (String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Shape[color =" + color + "]";
    }

    public double getArea(){
        System.out.println("Shape unknown ! connot compute area");
        return 0;
    }
}

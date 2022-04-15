package superclass;

abstract public class shape {

    private String color;

    public shape (String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return  "shape[color = " +color + "]";
    }

    abstract public double getArea();

}

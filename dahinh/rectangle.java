package dahinh;

public class rectangle extends Shape {

    private int length, width;

    public rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return "rectangle[length=" + length +", width =" + width + "," + super.toString()+"]";
    }

    @Override
    public double getArea(){
        return length*width;
    }

}

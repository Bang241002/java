package superclass;

public class recctangle implements shape {
    private int length, width;

    public recctangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return String toString (){
            return "rectangle [length = " + length + ", width " + width +"]";
        }

    @Override
    public double getArea(){
            return length * width;
        }
    }
}

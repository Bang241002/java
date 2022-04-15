package superclass;

public class triangle implements shape{

    private int base, height;

    public triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString(){
        return "triangle[base =" + base + ",height=" + height + "]";
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }
}

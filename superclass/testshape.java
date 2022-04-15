package superclass;

public class testshape {
    public static void main(String[] args){
        shape s1 = new rectangle("red", 4 ,5);
        System.out.println(s1);
        System.out.println("Area is" + s1.getArea());

        shape s2 = new triangle("blue", 4 , 5);
        System.out.println(s2);
        System.out.println("Area is" + s2.getArea());

    }
}

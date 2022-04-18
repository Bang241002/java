package thuake;

//public class cat extends mamal{
//    public cat(String name){
//        super(name);
//    }
//
//    public void greets(){
//        System.out.println("meo");
//    }
//
//    @Override
//    public String toString() {
//        return "cat[" +super.toString() + "]";
//    }
//}

//public class cat extends  mamal{
//    public cat(String name){
//        super(name);
//    }
//
//    public void greets(){
//        System.out.println("meo");
//    }
//
//    @Override
//    public String toString(){
//        return "cat[" + super.toString() + "]";
//    }
//}

public class cat extends mamal{
    public cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("meo");
    }

    @Override
    public String toString(){
        return "cat[" + super.toString() +"]";
    }
}
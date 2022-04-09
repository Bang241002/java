package ss6;

public class vidu7 {
    public class StaticMembers {

        public static int staticCounter = 0;

        int instanceCounter = 0;

        static {
            System.out.println("I am a static block");
        }

        public static void staticMetthod() {
            System.out.println("i am a static metthod");
        }

        public void displaCount() {
            staticCounter++;
            instanceCounter++;
            System.out.println("Static counter is:" + staticCounter);
            System.out.println(" instance counter is:" + instanceCounter);

        }

        public static void main(String[] args) {
            System.out.println("I am the main method");

            StaticMembers.staticMethod();

            StaticMembers objStatic1 = new StaticMembers();
            objStatic1.displaCount();

            StaticMembers objStatic2 = new StaticMembers();
            objStatic2.displaCount();
    }

        StaticMembers objStatic3 = new StaticMembers();
        objStatic3.displayCount();

    }
}

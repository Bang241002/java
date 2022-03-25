public class vidu7 {
        public static void main(string[]arge){
            int lowerboud = 1;
            int upperbound = 1000;
            int sum = 0;

            int number = lowerboud;
            while ( number <= upperbound){
                sum = sum +number;
                ++number;
            }
            sysem.out.println("the sum from " + lowerboud + " to " + upperbound + "is" +sum );
        }
}
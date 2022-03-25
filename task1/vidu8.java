public class vidu8 {
    public static void main (string[] arge){
        int lowerbound = 1, upperbound = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int number = lowerbound;
        while (number <= upperbound){

            if (number % 2 == 0){
                sumEven += number;
            }
            else{
                sumOdd += number;
            }
            ++number;
        }
        system.out.println("the sum of odd numbers from" + lowerbound + "to " + upperbound+ "is"+sumOdd);
        system.out.println("the sum of even numbers from" + lowerbound + "to " + upperbound+ "is"+sumEven);
        system.out.println("the difference between the two sums is " + (sumOdd - sumEven));
    }
}
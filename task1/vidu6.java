public class vidu6 {
    public static void main(string[] args){
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2 ;
        quotient = number1 / number2;
        remainder =number1 % number2;

        system.out.print(the sum, difference, product, quotient and remainder of );
        system.out.print(number1);
        system.out.print(" and");
        system.out.print(number2);
        system.out.print("are");
        system.out.print(sum);
        system.out.print(",");
        system.out.print(difference);
        system.out.print(",");
        system.out.print(product);
        system.out.print(",");
        system.out.print(quotient);
        system.out.print("and");
        system.out.println(remainder);

        ++number1 ;

        --number2;

        system.out.println("number1 after increment is " +number1);
        system.out.println(" number2 after decrement is " +number2);
        quotient = number1/number2;
        system.out.println("the new quotient of  " +number1 " and " + number2 + " is " +quotient);
    }
}
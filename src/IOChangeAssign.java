import java.util.Scanner;

/*
 * This application takes 2 double values and
 * finds the average of two values.
 */
public class IOChangeAssign {
    public static void main (String[] arg) {
        // initialize variables
        double valOne = 0.0, valTwo = 0.0, avgVal = 0.0;

        // specify where the input is coming from
        Scanner readFrom = new Scanner(System.in);

        // give instructions - it does NOT do any error checking!
        System.out.println("Type in the first number: ");
        valOne = readFrom.nextDouble();

        System.out.println("Type in the second number: ");
        valTwo = readFrom.nextDouble();

        // compute the average of two values
        avgVal = (valOne + valTwo) / 2;

        // print out
        System.out.println("Average of " + valOne + " and " + valTwo + " is " + avgVal);
    }
}

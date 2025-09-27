
package celsiustofahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {


    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Inter the celsius degree: ");
        double c = theScanner.nextDouble();
        double f = (c*9.0/5.0) + 32.0;
        System.out.println("It is " + f + " degree in fahrenheit.");
        theScanner.close();
        

    }
    
}

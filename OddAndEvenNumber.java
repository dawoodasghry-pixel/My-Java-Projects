
package oddandevennumber;

import java.util.Scanner;

public class OddAndEvenNumber {

    
    public static void main(String[] args) {
        
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Please inter the integer number: ");
        int number = theScanner.nextInt();
        if(number%2==0){
            if(number == 0){
                    System.out.println("The number is zero.");
                    }else 
                System.out.println(" It is even number.");
        }else
            System.out.println("It is Odd number.");
        theScanner.close();
        

    }
    
}

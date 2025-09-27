
package maxoftwonumber;

import java.util.Scanner;


public class MaxOfTwoNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please inter the first number \n a =  ");
        float a = sc.nextFloat();
        System.out.print("Please inter the second number \n b =  ");
        float b = sc.nextFloat();
        if(a>b){
            System.out.println("a > b");
        }else if(b>a){
            System.out.println("b > a");
        }else
            System.out.println("a = b");
        
        sc.close();
        

    }
    
}

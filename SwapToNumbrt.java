
package swaptonumbrt;

import java.util.Scanner;

public class SwapToNumbrt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inter the a number \n a = ");
        int a = sc.nextInt();
        System.out.print("Inter the b number \n b = ");
        int b = sc.nextInt();
        a = b+a;
        b = a-b;
        a = a-b;
        System.out.println("a =" + a +"\nb=" +b);
        
        
        
    }
    
}

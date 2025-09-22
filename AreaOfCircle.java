
package areaofcircle;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please inter the radius of circle : ");
        double r = sc.nextDouble();
        System.out.print("Inter unit of measurement (cm, m, km, ft, in ) : ");
        String unit = sc.next();
                
        if(r<0){
            System.out.println("The radius can not be negitive.");
        }else{
            double A = Math.PI*r*r;
            System.out.printf("The area of circle = " + String.format("%.3f",A) + unit + "\u00B2"  );
        }
        
        
    }
    
}

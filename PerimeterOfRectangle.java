
package perimeterofrectangle;
import java.util.Scanner;

public class PerimeterOfRectangle {


    public static void main(String[] args) {
        
        Scanner thescanner = new Scanner(System.in);
        
        System.out.print("Please inter the length of rectangle: ");
        double length = thescanner.nextDouble();
        System.out.print("Please inter ther= width of rectangle: ");
        double width = thescanner.nextDouble();
        
        if(length<0 || width<0){
            System.out.println("the length or width is not negitive");
        }else{
            double perimeter = 2*(length + width);
            System.out.println("Perimeter is : "+ perimeter);
        }
        
        thescanner.close();
        

    }
    
}

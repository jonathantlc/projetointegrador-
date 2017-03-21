
import java.util.Scanner;


public class Baskaraavesas {
    public static void main(String[] args) {
        Scanner js = new Scanner(System.in);
        // entradas 
        System.out.print(" digite X1 ");
        double x1 = Double.parseDouble(js.nextLine());
        System.out.print(" digite X2 ");
        double x2 = Double.parseDouble(js.nextLine());
        System.out.print(" digite c ");
        double c = Double.parseDouble(js.nextLine());;
        // processamentos 
        double s = x1 + x2;
        double p = x1 + x2;
        double a = c / p;
        double b = -(a * s);
        //saida 
        System.out.println(a + "0 x² + " + b + "x" + c + " =0") ;
        
    }
    
}


package function; 
import java.util.*;

public class basicCode {
   public static void sum(int a, int b){
    int sum = a + b;
    System.out.println("The sum is: " + sum);
   } 

   public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    sum(a,b);

   }
}

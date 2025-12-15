package function;

public class sumofdigit {
    public static int sum(int num)
{
    int sum = 0;
    while(num > 0){
       int rim= num %10;
        sum += rim;
        num = num /10;
    }
    return sum;
}
public static void main(String arg[]){
    int n = 1234;
    int result = sum(n);
    System.out.println("The sum of digits in " + n + " is: " + result);

}
}

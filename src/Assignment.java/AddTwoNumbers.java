import java.util.*;
public class AddTwoNumbers
{
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        num1 = sc.nextInt();
        System.out.println("enter the num2");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 + num2;

        System.out.println("enter the sum"   +sum);


    }
}
    

import java.util.Scanner;

public class func {
    public static int calculator(int a , int b){
        int sum = a - b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Subtraction = calculator(a, b);
        System.out.println("Your Subtraction is : "+Subtraction);
    }
}

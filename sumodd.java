import java.util.Scanner;

public class sumodd{
    public static void main(String[]args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd(n);
    }
    
    public static void odd(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers in the list of 1 to "+n+ " is:" +sum);
    }
}
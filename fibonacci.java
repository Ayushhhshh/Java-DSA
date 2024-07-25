import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        int a = 0;
        int b = 1;
        System.out.println("Enter a term:");
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();

        for (int i = a; i <= term; i++) {
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}

import java.util.Scanner;

public class funfact {

    public static void facto(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        facto(n);

    }
}

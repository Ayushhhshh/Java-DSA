
import java.util.Scanner;

public class funfact {

    public static int facto(int n , int fact){
        for (int i = 0; i <= n; i++) {
            System.out.println(fact);
            fact = fact * i;
            return fact;
        }
    }
    public static void main(String []args) {
        int fact = 1;
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
    }
}

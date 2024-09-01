
import java.util.Scanner;

public class sumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting integer: ");
        int start = sc.nextInt();
        System.out.println("Enter the Ending integer: ");
        int stop = sc.nextInt();
        int sum = 0;

        for (int i = start; i <= stop; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}

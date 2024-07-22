
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("Enter a number you want to print table of:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(+num+"*"+i+"="+(num*i));
        }
        }
}

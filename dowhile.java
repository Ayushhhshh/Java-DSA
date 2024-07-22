import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        do { 
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
        } while (i<=10);
    }
}

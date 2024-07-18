import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter 1st number:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the opeartor:");

        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid Expression");
        }
    }
}

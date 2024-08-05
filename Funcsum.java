import java.util.Scanner;

public class Funcsum {
    public static int sum(int a , int b){
        int sum = a + b;
        return sum;         
    }
    public static void main(String[] args) {
        System.out.println("Enter two number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

         int plus = sum(a, b);
         System.out.println("Your sum is:"+plus);
    }
}

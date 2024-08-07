import java.util.Scanner;

public class smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        smaller(a, b);
    }
    public static void smaller(int a ,int b){
        if(a<b){
            System.out.println(a+" is smaller than "+b);
        }else{
            System.out.println(b+" is smaller than "+a);
        }
    }
}

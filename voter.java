
import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        System.out.println("Enter your Age:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        vote(a);
    }
    
    public static void vote(int a){
        if (a>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}

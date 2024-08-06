import java.util.Scanner;

public class funavg{
    public static int avg(int a , int b , int c , int n){
        int avg = (a+b+c)/n;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[]args){
        System.out.println("Enter total numbers you want:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter "+n+" numbers:");
        Scanner sb = new Scanner(System.in);
        int a = sb.nextInt();
        int c = sb.nextInt();
        int b = sb.nextInt();

        int aa = avg(a, b, c, n);
        System.out.println("Your avg is:"+aa);
    }
}
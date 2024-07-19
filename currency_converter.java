
import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
        System.out.println("Enter the value in INR:");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println("Enter the currency:");
        String curr = sc.next();

        switch (curr) {
            case "Dollar" :
                System.out.println(val*0.012);
                break;
            case "Euro" :
                System.out.println(val*0.011);
                break;
            case "Dirham" :
                System.out.println(val*0.044);
                break;
            case "Ruble" :
                System.out.println(val*1.05);
                break;
            case "Yuan" :
                System.out.println(val*0.087);
                break;
            default:
            System.out.println("Invalid Currency");
        }
    }
}

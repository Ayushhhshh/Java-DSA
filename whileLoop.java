import java.util.Scanner;

class whileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num+"*"+i+"="+(num*i));
            i = i + 1;
        }
        System.out.println("");
    }
}
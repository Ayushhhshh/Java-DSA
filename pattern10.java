public class pattern10{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // num
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");   
            }

        }
    }
}
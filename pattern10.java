public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i<=n ; i++){
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
        System.out.println();
        }
    }
}

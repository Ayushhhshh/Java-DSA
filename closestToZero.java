import java.util.Scanner;

public class closestToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int closestToZero = arr[0];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }



        for(int i = 1; i < n; i++){
            if (Math.abs(arr[i]) < Math.abs(closestToZero) || 
                (Math.abs(arr[i]) == Math.abs(closestToZero) && arr[i] > closestToZero)) {
                closestToZero = arr[i];
            }
        }
        System.out.println(closestToZero);
    }
}
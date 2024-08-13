import java.util.Scanner;

public class searchElementInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int [size];

        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " +i+ " element of the array");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == x){
            // System.out.println("This Element is at "+i+" index");
           }
        }
    }
}

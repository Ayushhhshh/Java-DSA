import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int arr2[] = {2, 2, 3, 4, 5};
        
        // Use a HashSet to store the union elements
        HashSet<Integer> unionSet = new HashSet<>();
        
        // Add all elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            unionSet.add(arr1[i]);
        }
        
        // Add all elements from the second array
        for (int i = 0; i < arr2.length; i++) {
            unionSet.add(arr2[i]);
        }
        
        // Print the union of two arrays
        System.out.println("Union of the two arrays:");
        for (Integer element : unionSet) {
            System.out.print(element + " ");
        }
    }
}

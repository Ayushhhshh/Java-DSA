public class rotateElementFromD {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int temp[] = new int [3];
        int d = 3;
        int j = 0;


        //transfering
        for (int i = 0; i < d; i++) {
            temp[j] = arr[i];
            j++;
        }
        
        //shifting 
        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
        }
        
        //putting temp back
        for (int i = 0; i < temp.length; i++) {
            arr[arr.length-d] = temp[i];
            d--;
        }

        // printing
        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }
    }
}

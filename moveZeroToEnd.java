public class moveZeroToEnd {
    public static void main(String[] args) {
         int arr[] = {1,0,2,3,0,6,0,4,6};
         int temp[] = new int[arr.length];
         int j = 0;

         for (int i = 0; i < arr.length; i++) {
             if(arr[i]!=0){
                temp[j] = arr[i]; 
                j++;
             }
         }

         for (int i = 0; i < arr.length; i++) {
             System.out.println(temp[i]);
         }
    }
}

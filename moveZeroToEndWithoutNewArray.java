public class moveZeroToEndWithoutNewArray {
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,4,5,0,6};
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j = i;
                break;
            }
            
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr[i],arr[j]);
                j++;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
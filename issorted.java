public class issorted {
    public static void main(String[] args) {
        // int arr [] = {1,2,4,6,5};
        int arr [] = {1,2,4,4,3};
        boolean isSorted = true ;

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1]){
                isSorted = true;
            }else{
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }   
}

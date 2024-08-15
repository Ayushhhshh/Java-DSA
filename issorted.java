public class isSorted {
    public static void main(String[] args) {
        int arr [] = {1,2,4,4,3};
        boolean isSorted = true ;

        for (int i = 1; i < arr.length; i++) {
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
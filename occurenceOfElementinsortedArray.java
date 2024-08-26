public class occurenceOfElementinsortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,5,5};
        int sec = 0;
        int ind = 0;

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]!=arr[i-1]){
                sec = ind;
                ind = i;
            }
        }
        System.out.println("Element is "+arr[sec]+" at index  "+sec);
    }
}

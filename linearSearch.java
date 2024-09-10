public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,5,3,7,6,7,5,9};
        int num = 9;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println("The index of num is "+i);
                break;
            }
        }
    }
}

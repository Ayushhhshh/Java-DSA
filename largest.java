public class largest {
    public static void main(String[] args) {
        int arr[]={10,98,99,97,1,2,11,25};
        int largest = arr[0];
        for(int i = 0; i<=arr.length-1;i++){
           if(arr[i]>largest){
               largest = arr[i];
           }
        }
        System.out.println(largest);
     }
}

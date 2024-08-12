public class secondLargest {
    public static void main(String[] args) {
       int arr[]={10,9,99,97,1,2,11,25,98};
       int largest = arr[0];
       int sec = -1;
       for(int i = 0; i< arr.length;i++){
          if(arr[i]>largest ){
              largest = arr[i];
          }
        }
        for (int i = 0; i < arr.length; i++) {
         if(arr[i]!=largest && sec<arr[i])
         sec = arr[i];
     }
       System.out.println(sec);
    }
}
public class  rotateNegative{
    public static void main(String[] args) {
        int arr [] = {1,2,3,-5,-4};
        int j = 0;
        int a = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                a = arr[0];
                arr[0]=arr[i];
            }
        }

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
   }
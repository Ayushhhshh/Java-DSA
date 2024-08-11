public class uniquearr {
    public static void main(String []args){
        int arr[]= {1,1,2,2,3,3,4,4};
        int temp[] = {};
        for (int i = 0; i < arr.length-1; i++) {
            if(i!=i+1){
                arr[i] = temp[0];
                i++;
            }
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]);
                }
        }
    }
}

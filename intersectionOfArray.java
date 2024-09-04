public class intersectionOfArray {
    public static void main(String[] args) {
        
    int arr [] = {1,2,2,3,3,4,5,6};
    int arr2[] = {2,3,3,5,6,7};
    int ins[] = new int[arr.length];

    for(int i=0; i<arr.length;i++){
        for (int j = 0; j < arr2.length; j++) {
            if(arr[i]==arr2[j]){
                ins[i]=arr[i];
            }
            
        }
    }

        for (int i = 0; i < ins.length; i++) {
            System.out.println(ins[i]);
        }
    }
}

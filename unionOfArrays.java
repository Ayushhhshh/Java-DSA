public class unionOfArrays{
    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4,5};
        int arr2[] = {2,2,3,4,5};
        int union[] = new int [arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr2.length; j++) {
                if(arr[i]<=arr2[j] && union[i]!=arr[i]){
                    union[i]=arr[i];
                } else if(arr2[j]<arr[i] && union[i]!=arr2[j]){
                    union[i]=arr2[j];
                }
            }
        }
        for (int i = 1; i < union.length; i++) {
            System.out.println(union[i]);
        }
    }
}

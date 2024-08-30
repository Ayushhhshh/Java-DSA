public class unionOfArrays{
    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,5};
        int temp[] = new int [arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=temp[j]){
                temp[j]=arr[i];
                j++;
            }else if(temp[j]==arr[i]){
                continue;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}

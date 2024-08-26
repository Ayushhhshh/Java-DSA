class occurenceOfElementinsortedArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,9,4};
        int l = 0;
        int sec = -1;
        int index = 0;
        int count = 0;
        
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>l){
                l = arr[i];
            }
        
        }
        
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=l && sec<arr[i]){
                sec = arr[i];
                index = i;
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==sec){
                count++;
            }
        }
        System.out.println("Element is "+sec+" at index "+index+" and occurane is "+count);
    }
}
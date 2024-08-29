class occurenceOfElementinsortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,5,5};
        int l = 0;
        int sec = -1;
        int index = 0;
        int count = 0;
        
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                sec = arr[i];
                index = i;
                break;
            }
        
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==sec){
                count++;
            }
        }
        System.out.println("Element is "+sec+" at the index "+index+" and occurance is "+count);
    }
}
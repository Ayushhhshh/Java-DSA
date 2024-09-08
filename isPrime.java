class isPrime {
    public static void main(String[] args) {
        int n = 31;
        boolean code = true;
        
        for(int i = 2 ; i < n; i++){
            if(n % i == 0){
                code = false;
                break;
            }
        }
        System.out.println("Is "+n+" a prime number : "+code);
    }
}
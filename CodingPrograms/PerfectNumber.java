class PerfectNumber{
    
    public static void main(String[] args) {
        
        int n= 7;
        
        int sum =0;
        
        for(int i=1;i<n;i++){
            
            if(n % i == 0){
                sum += i;
            }
        }
        if( sum == n){
            
            System.out.println("is perfect Number");
            
        }
        else{
            System.out.println("is not perfect Number");
        }
    }
}

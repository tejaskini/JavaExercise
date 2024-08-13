class FindLCM{
    
public static void main(String[] args){
    
    // LCM of two numbers
    // 1. caluculate the hcf of number
    // 2. to find LCM just multiply both numbers and divide by hcf
    
    // finding hcf of numbers
    int num1 = 12; 
    int num2 = 14;
    int hcf= 0; // initialize hcf
    
    for(int i=1; i<= num1 || i<= num2 ; i++)
    {
        if(num1 % i == 0 && num2 % i == 0){
            
            hcf = i;
        }
    }
    // System.out.println(hcf);
    // calculate LCM
    int lcm = ( num1 * num2 )/hcf;
    System.out.println("LCM of " + num1 + " and " + num2 + " is "+ lcm);
}
}
//Output : LCM of 12 and 14 is 84

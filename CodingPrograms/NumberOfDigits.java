class NumberOfDigits{
    
public static void main(String[] args){
    
//   calc number of digits in integer
// num = 12345 | noOfDigit = 5
    int num = 4646468;
    
    int count = 0;
    while(num !=0)
    {
        int getDigit = num % 10;
        count ++;
        num = num/10;
    }
     System.out.print(count);
}
}

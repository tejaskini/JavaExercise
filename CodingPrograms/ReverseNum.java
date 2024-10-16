class ReverseNum{
    public static void main(String[] args) {
    
        int num = 1234;
        //op 4321
    //   System.out.print( num % 10);
    
    int rev = 0;
    while(num != 0)
    {
        int remainder = num % 10;// reaminder
        rev = rev * 10 + remainder;
        /*
        rev = 0 * 10 + 4; = 4
            4 * 10 + 3 = 43
            43 * 10 + 2 = 432
            432 * 10 + 1 = 4321
        */
       num = num/10;
    }
      System.out.print(rev);
      
  }
}

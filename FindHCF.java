
class FindHCF {
    public static void main(String[] args) {
      // Java program to find GCD(Greatest Common Divisor) or HCF(Highest Common Factor)  of two numbers
      
      // HCF or GCD means highest factor that ca divide the two numbers.
      /*
      eg. HCF of 18 and 27 
      here first we find the factors of 18 - 1 2 3 6 9 18
                             factors of 27 - 1 3 9 27
            among both the factors Highest one is '9' that is HCF of 18 and 27
      */
      int num1 = 18;
      int num2 = 27;
      //initialize hcf
      int hcf = 0;
      
      //iterate over the numbers
      for(int i=1; i<=num1 || i<= num2; i++)
      {
          // here we are checking common factors of both numbers
           if(num1 % i == 0 && num2 % i == 0)
              {
                  hcf = i;
              }
      }
      
      System.out.println("HCF of "+ num1 + " & " + num2 + " is " + hcf);
    }
}

//output : HCF of 18 & 27 is 9

import java.util.Scanner;
class Fibonacci {
        // print the Fibonacci series upto 10
    // Series is like : 0 1 1 2 3 5 8 13 .....
    
    public static void main(String[] args) {

        // You can also take i/p for specific range
        /*
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        
        */
        
// Here I hardcoded the range as 10
        int range = 10; // specify the range
        int first = 0;    // first number
        int second = 1;    // Second number
        int nextTerm;    // Variable for storing next number
        System.out.print(first + " "+ second); 
        for(int i=2;i<=range;i++)
        {
            nextTerm = first + second;
            first = second;
            second = nextTerm;
  System.out.print(" " + nextTerm);
        }
      
        
    }
}

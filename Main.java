import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of elemnets to Store ");
       
       int m = sc.nextInt();
       
       int[] arr = new int[m]; // declaring arr of size m
       
       for(int i=0; i<m; i++)
       {
           arr[i] =sc.nextInt();// reading input upto m
       }
       
       for(int i=0; i<arr.length; i++)
       {
           System.out.print(arr[i] + " "); //printing elemnet of arr
       }
    
    }
}

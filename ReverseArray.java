class ReverseArray{

  public static void main(String[] args) {
    // creating array
        int[] arr = {50,22,33,8,1,2};
        
        System.out.print("Original Array : ");
         for(int i=0; i< arr.length; i++)
        {
           System.out.print( " "  + arr[i] ); // printing original array
        }
          System.out.println("");// for just next line
    
        System.out.print("Reverse Array : ");
          for(int i=arr.length-1; i >=0; i--)
          {
              System.out.print(" " + arr[i]); // it prints reverse array
          }
        
       
    }
}

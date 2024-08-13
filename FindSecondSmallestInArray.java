
class FindSecondSmallestInArray{
    
public static void main(String[] args){
 
 // find the second smallest number in java
 
 // crate and array
 int[] arr = {5,8,6,7,18,22};
 
 int smallest = Integer.MAX_VALUE; // for first smallest
 
 for(int i = 0; i< arr.length-1; i++)
 {
     if(smallest > arr[i]){
         
         smallest = arr[i]; // we get smallest element in array
     }
 }
  System.out.println("1 Smallest number is : " + smallest);
 
 // for second smallest element
 int sec_smallest = Integer.MAX_VALUE;
 
 for(int i =0; i<arr.length; i++)
 {
     if(arr[i] != smallest && arr[i] < sec_smallest ){
         sec_smallest = arr[i];
     }
 }
 System.out.println("Second Smallest number is : " + sec_smallest);
 
}
}

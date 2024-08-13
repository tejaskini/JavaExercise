class FindLargestSmallestNoInArray{
    
public static void main(String[] args){
 
 // find the largest and smallest  element in array   
 
 int[] arr = new int[]{5,8,9,11,18};
 
 int max = Integer.MIN_VALUE; //set to max as possible minimum
 int min = Integer.MAX_VALUE; // set to min as possible minimum
 for(int i=0; i< arr.length; i++){
     
     if(max < arr[i]){
         max = arr[i];
     }
 }
 System.out.println("Larget element is : "+ max);


for(int i=0 ;i <arr.length; i++){
    
    if(min > arr[i])
    {
        min = arr[i];
    }
}
 System.out.println("Smallest element is : "+ min);

}
}

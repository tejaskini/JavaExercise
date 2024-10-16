// Sorting elements in Array 

class SortArray {
    public static void main(String[] args) {
		
        int[] arr = new int[]{50,22,33,8,1,2}; // Array of some elements
        
        for(int i=0; i < arr.length; i++)	// outer Loop
        {
            for(int j=i + 1; j<arr.length; j++)	// inner loop
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            //priniting array
            System.out.print(" " + arr[i]);
        }
    }
}
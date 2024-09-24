 import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class Reduce {
    public static void main(String[] args) {
    // Reducing
   List<Integer> numList = List.of(1,3,4,5,96,7,9,2,55);
      
    //print sum of list of element using FP
    int sum = numList.stream().reduce(0, (n1,n2) -> (n1 + n2));
    System.out.println( sum);


      // basic method
    int sum1 =0;
    for(int i=0; i< numList.size(); i++)
    {
        sum1 += numList.get(i);
    }
    System.out.println(sum1);
      
    }
}

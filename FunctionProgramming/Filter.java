import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class Filter {
    public static void main(String[] args) {
       List<String> list = new LinkedList<>();
       list.add("Basic Operation using Functional Programming");

    //filtering
    list.stream().filter(
        e->e.endsWith("on")
        ).forEach(
            e-> System.out.println(e)
            );
            
    // print even number using FP
    List<Integer> numList = List.of(1,3,4,5,96,7,9,2,55);
    
    System.out.print(numList);
    numList.stream().filter(
        element -> element%2 == 0 
        ).forEach(
            element -> System.out.println( element)
            );

  // Basic method to print even numbers
  for(int i=0 i<numList.size(); i++){
    if(i %2 ==0)
    {
      System.out.print(i);
    }
  }

    }
}

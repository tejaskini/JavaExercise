import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class PrintFP {
    public static void main(String[] args) {
       List<String> list = new LinkedList<>();
     
       list.add("Basic Operation using Functional Programming");

      // Basic Method
      for(String str: list)
        {
          System.out.println(str);
        }
    
       //Function programming (FP)
      list.stream().forEach(
          e -> System.out.println(e)
          );

    }
}

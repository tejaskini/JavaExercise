// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Add {
    public static void main(String[] args) {
        System.out.println("Collection Interface");
        
        // Basic Operations
        
        //Add Elements
        
        Collection<Integer> list1 = new ArrayList<Integer>(5);
        
        // add method to add elements
        list1.add(12);
         list1.add(30);
          list1.add(60);
          
          //prints all elements in list
          for(Integer num:list1)
          {
              System.out.println(num);
          }
          
          //create empty Arraylist
          Collection<Integer> list2 = new ArrayList<>();
          
          //Appending the collection to the list
          list2.add(45);
          list2.add(88);
          list2.addAll(list1);
          
          //dispay the modified ArrayList
          System.out.println("The new Arraylist is : " + list2);
         
        
    }
}

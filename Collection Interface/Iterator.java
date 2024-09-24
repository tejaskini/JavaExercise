import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
class Main {
    public static void main(String[] args) {
        System.out.println("Collection Interface");
        
        // Basic Operations
        
        //To iterate over the elements of Collection we can use iterator() method.
        
       Collection<String> list = new LinkedList<>();
       
       list.add("Yor");
       list.add("Are");
       list.add("So");
       list.add("Beautiful");
       list.add("Thank");
       list.add("You");
       //display the list
       System.out.println("The list is "+ list);
       
       //create iterator for list using iterator() method
       Iterator<String> iter = list.iterator();
       
         System.out.println(" The iterator values of list is : ");
         while(iter.hasNext())
         {
             System.out.print(iter.next() + " ");
         }
        
    }
}

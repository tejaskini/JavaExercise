import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Collection Interface");
        
        // Basic Operations
        
        //Remove Elements
        
        Collection<Integer> set1 = new HashSet<Integer>();
        
        // add method to add elements
          set1.add(12);
          set1.add(30);
          set1.add(60);
          set1.add(45);
          set1.add(88);
          
        //prints all elements in set1
           System.out.println("Set1 is : " + set1);
           
        // set1 remove spec element
        set1.remove(60);
        System.out.println("Set1 is after removing 60 : " + set1);
          
          //creating another set2
          Collection<Integer> set2 = new HashSet<>();
          set2.add(12);
          set2.add(30);
          set2.add(45);
          
          //prints all elements in set2
           System.out.println("Set2 is : " + set2);
           
           //removing elements from set1 specified in set2 using removeAll() method
           set1.removeAll(set2);
        
           System.out.println("After using removeAll() Set1 is : " + set1);
          
        
    }
}

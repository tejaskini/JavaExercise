import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class Distinct {
    public static void main(String[] args) {
        
        //Intermedite Operations
        
        //sort
    List<Integer> numList = List.of(1,3,4,5,5,96,7,7,9,2,2,55);
    
    numList.stream().distinct().sorted().forEach(
        e -> System.out.print(e + " ")
        );
    
    }
}

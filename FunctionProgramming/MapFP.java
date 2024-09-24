import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

class MapFP {
    public static void main(String[] args) {
        
        //Intermedite Operations
        
        //map
    List<Integer> numList = List.of(1,3,3,4,,96,5,96,7,9,2,55);
    //find the square of the distinct element using FP
    numList.stream().sorted().map(e -> e * e ).forEach(
        e -> System.out.print(e + " ")
        );
    
    }
}

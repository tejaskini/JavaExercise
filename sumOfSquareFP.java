import java.util.List;

public class sumOfSquareFP {

    public static long sumOfSquares(List<Integer> numbers) {
        
        // Check if the list is null. If so, return 0.

            if(numbers == null)
            {
                return 0;
            }
        // Stream over the list of numbers, find squares and sum them up
        
        long sum = numbers.stream().map( e-> e * e).reduce(0, (n1, n2) -> n1 + n2);
        return sum;
    }

}

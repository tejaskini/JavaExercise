import java.util.Scanner;
class FindPrimeNumber{
    
public static void main(String[] args){
    
//   Find prime number from 1 - 100
    
        int range = 100;
        for(int i=1; i<= range;i++)
        {
             int count = 0;
            for(int j = 1; j <= range; j++)
            {
                if(i % j == 0)
                {
                    count ++;
                }
            }
            if(count == 2)
            {
                System.out.println(i);
            }
        }
}
}

//OutPut : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

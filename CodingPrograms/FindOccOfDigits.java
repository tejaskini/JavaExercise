import java.util.Scanner;
class FindOccOfDigits{
    
public static void main(String[] args){
    

// finding the occurence of digit in integer number
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number which have repeated numbers : ");
int number = sc.nextInt();

System.out.println("Enter the number which You have to find Occurence in above number :  ");
    int findDuplicate = sc.nextInt();
    int count = 0;
    
    while(number > 0){

     int rem = number % 10;

        if(rem == findDuplicate){
            count ++;
         
     }
      number = number/10;

    }
    System.out.println(findDuplicate + " is repeated " + count + " times.");

}
}

/*
Output: Enter the number which have repeated numbers : 
885558
Enter the number which You have to find Occurence in above number :  
5
5 is repeated 3 times.

*/

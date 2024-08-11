class ReverseNum{
    public static void main(String[] args) {
        int number = 4321;
        String s = "";
        while(number!=0){
int last= number%10;
s= s+Integer.toString(last);
number =number /10;
        }
        
        System.out.print(s);
        
    }
}
//Inheritance in java parent - child class
//Parent class 
class Father{
    
    public void House(){
        System.out.println("House");
    }
    
    public void car(){
        System.out.println("family car");
    }
}
// Child class
class child extends Father {
  void printStat()
  {
    System.out.println("Child class inherit the Father class");
  }
}
// Main method 
class Inheritance{
 public static void main(String[] args) {
       child c = new child();
       c.House();
       c.car();
       c.printStat();
    }
}

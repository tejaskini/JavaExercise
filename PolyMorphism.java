
class PolyMorphism{
    /*
    // Polymorphism 
    // Compile time - static - Method overloading
    Runtime polymorphism - Dynamic - Method Overriding
    
    M. overloading - same name, same clas ,diff args
    M.Overriding - same name, diff class , same args
    
    */
    public static void main(String[] args)
    {
        Test t = new Test();
        // Method overloading
        t.pen();
        t.pen(2);
        //t.Address(33, "Virar");
        
        //----Method overriding
        Test2 t2 = new Test2();
        t2.Address(283, "Mumbai");
        
    }
    
}
class Test{
    // Method overloading
    // same name - pen() , same class - Test, Diff args 
    
    void pen(){ 
    
        System.out.println("Single Pen");
    }
     
    void pen(int... num) 
    {
        System.out.println("Multiple pens");
    }
    
    // Another method
    void Address(int H_no, String City){
        System.out.println("Method in Test class");
    }
}

class Test2 extends Test {
    // method overriding
    /*
    same name - 
    Diff class - 
    same args -
    */
// overriding the method from Test class 
  void Address(int H_no, String City){
        System.out.println("Method in Test 2 class");
    }
    
}
/*
output: 
Single Pen
Multiple pens

Method in Test class
Method in Test 2 class

*/


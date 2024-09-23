// make different file for Car.java

// if method is abstract method then Class should be the abstract class
public abstract class Car{
    public abstract void stop(); // this is called abstract method , abstract method is with abstract keyword with no body.
    public abstract void run();

  // abstract class can allowed non abstract methods with body
  public void sell(){
    System.out.println("This is the Concreate method");
  }
  
}

// make different file for Tata.java

// If regular class extends abstract class then , should be declare all the abstract methods or that class be the abstract itself
public class Tata extends Car{
    public void stop()
    {
        System.out.println("Stop mechanism for TATA");

    }
    public void run(){
        System.out.println("run mechanism TATA");
    }
}

// make different file for Mahindra.java
public class Mahindra extends Car{
    //override
     public void stop()
    {
        System.out.println("Stop mechanism for Mahindra");

    }
    public void run(){
        System.out.println("run mechanism Mahindra");
    }
}

// make different file for CarRunner.java and Run this file to see output
class CarRunner {
    public static void main(String[] args) {
        
    //   Abstraction in java
    Tata t = new Tata();
    Mahindra m = new Mahindra();
    m.run();
    m.stop();
    t.run();
    t.stop();
    
   
    }
}

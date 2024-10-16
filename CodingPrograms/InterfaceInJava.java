 /*
      -It is the abstract type used to specify beahavior of class.
      -BluePrint of behaviour
      -Mechanism to achieve the Abstraction.
      -Support multi. inheritance
      -achieve loose coupling
      
      Relation b/w class and interface
      class --extends --> class
      class --implements--> interface
      interface --extends-->interface
      */
// this is Main class
class InterfaceInJava
{
    public static void main(String[] args) {
      System.out.println("interface in java.....");
     //NOTE: WE CANNOT CREATE OBJECT OF INTERFACE (like abstract class) 
     // JungleRun jr = new JungleRun();
     GamingConsole jr = new JungleRun();
      Remote remote = new JungleRun();
      jr.left();
      jr.right();
      remote.isOn();
      remote.isOff();
    }

}

 interface GamingConsole{
    // all the abstract methods are public(by default).
    // fields/var automatically be the 'public static final'
    
    public abstract void left();
    void right();
    
    //concrete method
    public default void show(){
        System.out.println("Concrete Method");
    }
}

interface Remote{
    public abstract void isOn();
    public abstract void isOff();
}
//class can implements multiple interface called multiple polymorphism
class JungleRun implements GamingConsole, Remote{
    
    // all the abstract methods have the body in class
    public void left()
    {
        System.out.println("left");
    }
    public void right()
    {
            System.out.println("Right");
    }
    public void isOn()
    {
            System.out.println("On");
    }
    public void isOff()
    {
            System.out.println("OFF");
    }
    
}


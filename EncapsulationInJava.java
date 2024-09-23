//Encapsulation in java

class Person
{
    // declaere var as private
    private String name;
    private int age;
    
    // declare setter and getter method to access and update value of private var
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    
    //getter methods
    public String getName()
    {
        System.out.println(name);
        return name;
    }
    public int getAge()
    {
        System.out.println(age);
        return age;
    }
}

public class EncapsulationInJava{
    public static void main(String[] args)
    {
        Person p = new Person(); // create obj of Person Class
      
        p.setName("Java Coding");
        p.setAge(24);
        p.getName();
        p.getAge();
    }
}

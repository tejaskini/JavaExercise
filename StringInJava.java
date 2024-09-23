
class StringInJava {
    public static void main(String[] args) {
        
       // System.out.println(" byte -1 \n short - 2 \n int - 4 \n long - 8 \n float-4 \n double-8 \n boolean -1bit \n character -4");
      
        //String in Java
        
       String s = "Java Coding by Tejas Kini";
       
       //length
        System.out.println(s.length());
        //charAt()
        System.out.println(s.charAt(4));
        //substring
        System.out.println(s.substring(5));
        //indexOf()
        System.out.println(s.indexOf("Kini"));
        //contains()
        System.out.println(s.contains("Coding"));
        //startWith and endWith
        System.out.println(s.startsWith("Coding"));
        System.out.println(s.endsWith("Kini"));
        //isEmpty
        System.out.println(s.isEmpty());
        //equals()
        System.out.println("Tejas".equals("Tejas"));
        // concat
        String s2 = "Learning Strings";
        
        System.out.println(s2.concat(" in Java by Tejas!"));
        
        //toUpperCase
        System.out.println(s.toUpperCase());
        
        //toLowerCase
        System.out.println(s.toLowerCase());
        //trim() - remove space from start and end of string
        System.out.println(s2.trim());
        
    }
}

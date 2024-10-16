class Palindrome {

    public static void main(String[] args) {

        String original = "MOM";  // Input string
        
        String tempRev = "";  // Reversed string storage

        int len = original.length() - 1;  // Length of the string

        for (int i = len; i >= 0; i--) {
            tempRev = tempRev + original.charAt(i);  // Building the reversed string
        }

        if (original.equals(tempRev)) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }
}

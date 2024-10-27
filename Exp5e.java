public class  Exp5e{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Java";
        String s3 = "World";
        //Get the length of each strings
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        //Join all strings and display resulting string. +, concate()
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println(s1.concat(" ").concat(s2).concat(" ").concat(s3));
        //Compare any two strings using equals() and compareTo() method
        System.out.println("Comparing s1 and s2 via equals() and compareTo()");
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println  ("Comparing s2 and s3 via equals() and compareTo()"); 
        System.out.println(s2.equals(s3));
        System.out.println(s2.compareTo(s3));
        System.out.println ("Comparing s1 and s3 via equals() and compareTo()");
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s3));
        //Find index of particular characters of string and find character at given index
        System.out.println("Index of 'o' in s1: " + s1.indexOf('o'));
        System.out.println("Index of 'o' in s2: " + s2.indexOf('o'));
        System.out.println("Index of 'o' in s3: " + s3.indexOf('o'));
        System.out.println("Character at index 2 in s1: " + s1.charAt(2));
        System.out.println("Character at index 2 in s2: " + s2.charAt(2));
        System.out.println("Character at index 2 in s3: " + s3.charAt(2));
        //Replace portion of string by given string
        System.out.println("Replacing 'Java' with 'Python' in s2: " + s2.replace("Java", "Python"));
        //Convert string into all characters in uppercase and Lowercase
        System.out.println("Uppercase of s1: " + s1.toUpperCase());
        System.out.println("Lowercase of s1: " + s1.toLowerCase());
        System.out.println("Uppercase of s2: " + s2.toUpperCase());
        System.out.println("Lowercase of s2: " + s2.toLowerCase());
        System.out.println("Uppercase of s3: " + s3.toUpperCase());
        System.out.println("Lowercase of s3: " + s3.toLowerCase());
        //Find string representation of given float and integer value
        float f = 3.14f;
        int i = 25;
        System.out.println("String representation of float f: " + Float.toString(f));
        System.out.println("String representation of integer i: " + Integer.toString(i));
        //Get sub-string of a string
        try {
            System.out.println("Sub-string from index 2 to 4 in s1: " + s1.substring(2, 4));
            System.out.println("Sub-string from index 2 to 5 in s3: " + s3.substring(1, 3));
            System.out.println("Sub-string from index 3 to 4 in s2: " + s2.substring(3, 5));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        //Get all words of the string
        String[] words1 = s1.split(" ");
        for (String word : words1) {
            System.out.println(word);
        }
        String[] words2 = s2.split(" ");
        for (String word : words2) {
            System.out.println(word);
        }
        String[] words3 = s3.split(" ");
        for (String word : words3) {
            System.out.println(word);
        }
        //Convert the string into character array
        char[] charArray1 = s1.toCharArray();
        for (char c : charArray1) {
            System.out.println(c);
        }
        System.out.println("\n");
        char[] charArray2 = s2.toCharArray();
        for (char c : charArray2) {
            System.out.println(c);
        }
        System.out.println("\n");
        char[] charArray3 = s3.toCharArray();
        for (char c : charArray3) {
            System.out.println(c);
        }
    }
}

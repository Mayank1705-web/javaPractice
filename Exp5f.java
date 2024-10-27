public class Exp5f{
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer ("Hello");
        StringBuffer buffer2 = new StringBuffer ("Java");
        System.out.println("Original strings are "+buffer1+" "+buffer2);
        //Add double value at the end of existing string
        buffer1.append(10.5);
        buffer2.append(11.5);
        System.out.println(buffer1);
        System.out.println(buffer2);
        //Add one character at the end of existing string
        buffer1.append('H');
        buffer2.append('W');
        System.out.println(buffer1);
        System.out.println(buffer2);
        //Add one sub string at the end of existing string
        buffer1.append(buffer2.substring(2,4));
        buffer2.append(buffer1.substring(0, 3));
        System.out.println(buffer1);
        System.out.println(buffer2);
        //Insert a sub string in the existing string
        buffer1.insert(6, buffer2.substring(0, 3));
        buffer2.insert(5, buffer1.substring(6, 9));
        System.out.println(buffer1);
        System.out.println(buffer2);
        //Insert a double value in between characters of existing string
        buffer1.insert(8, 12.5);
        buffer2.insert(7, 13.5);
        System.out.println(buffer1);
        System.out.println(buffer2);
        //Find the reverse of string
        System.out.println(buffer1.reverse());
        System.out.println(buffer2.reverse());
    }
} 
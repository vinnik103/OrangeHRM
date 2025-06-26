package String_demo;

public class Simple_string
{
    public static void main(String []args) {
        String name1 = "hello vinayak";
        String name2 = "JAVA PROgramming";

        System.out.println(name1);
        System.out.println(name2);

        // length of string

        System.out.println("length of string: " + name1.length());


        // substring
        // substring starts from zero

        System.out.println("sub string :"+name2.substring(5,8));


        //uppercase

        System.out.println("uppercase: "+name1.toUpperCase());

        // lowercase

        System.out.println("lowercase: "+name2.toLowerCase());

        //trimmed String

        System.out.println("trim of string: "+name2.trim());

        //replace

        System.out.println("caps of string: "+name1.replace("hello", "student"));
    }
}


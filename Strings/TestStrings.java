package Strings;


//strings are immutable

public class TestStrings {
    public static void main(String[] args) {
//        String s1 = "abc";
//        s1.concat("def");
//        System.out.println(s1);  // no reference pointing to s1 thus will output abc only
//
//        s1 = s1.concat("def");
//        System.out.println(s1);   // will output abcdef
//

        String s1 = "Hello";
        String s2 = s1;
        System.out.println("s1 == s2"+ s1 == s2);

        String s3 = "test";
        String s4 = "test";
        System.out.println("s3==s4: "+ s3 == s4);
        System.out.println("s3.equals(s4): "+ s3.equals(s4));

    }
}

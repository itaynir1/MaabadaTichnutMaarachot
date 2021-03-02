package il.ac.ono;

import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String s1 = "ok";
        String s2= new String("ok");
        String s3= "ok";
        if(s1 ==s2) // not equals
            System.out.println("shave");
        if(s1 ==s3)
            System.out.println("shave"); //equals -> at the same place in the memory
        String s4 =s1;
        s4 =s1.toUpperCase();
        System.out.println(s4);
        System.out.println(s1);
        System.out.println("old one is: "+s1);


    }

}

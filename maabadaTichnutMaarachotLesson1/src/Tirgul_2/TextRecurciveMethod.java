package Tirgul_2;

public class TextRecurciveMethod {
    static void lulaa(int i)
    {
        if (i>=10) return;
        // cycle body
        System.out.println(i);
        // end of body
        lulaa(i+1);

    }

    public static void main(String[] args) {
//        for (int i =0; i<10; i++) // in loop
//        {
//            System.out.println(i);
//        }
        lulaa(0);
    }
}

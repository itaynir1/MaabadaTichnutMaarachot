package Tirgul_2;

import org.w3c.dom.ls.LSOutput;

public class Factorial {
    static int recurcive(int k) {
        {
            // k! = k*(k-1)!
            // 1!=1
            if (k == 1) return 1;
            return k * recurcive(k - 1);
        }
    }
        static public int cycle(int k)
        {
            // k! = 1*2*3*...*k
            int res =1;
            for(int i = 2; i<=k; k++)
                res = res*i;
            return res;
        }

    public static void main(String[] args) {
        long s = System.nanoTime();
        System.out.println("s="+s);
        System.out.println("cycle = "+Factorial.cycle(6));
        long e= System.nanoTime();
        s = System.nanoTime();
        System.out.println("time="+(e-s));

        System.out.println("recurcive = "+ Factorial.recurcive(6));


        s = System.nanoTime();

        e = System.nanoTime();
        System.out.println("time="+(e-s));
        s= System.nanoTime();
        System.out.println("cycle = "+Factorial.cycle(6));


    }
    }

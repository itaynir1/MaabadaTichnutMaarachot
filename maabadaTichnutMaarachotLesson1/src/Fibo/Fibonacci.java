package Fibo;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 1) { return 1;}
         else if (n == 2) {
            return 1;
        }
            return fib(n - 1) + fib(n - 2);
        }


        public static void main (String[]args){
            System.out.println(fib(3));
        }
    }






// 0 1 1 2 3 5 8  13  21  34  55 89
// 1 2 3 4 5 6 7   8  9   10  11 12
// a(n) = a(n-1) + a(n-2)
// n = fib (n-1) + fib (n-2)
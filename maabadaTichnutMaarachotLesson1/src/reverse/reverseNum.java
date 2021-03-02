package reverse;
import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int reversed_num = 0, opposite = 1;
        int num = scanner.nextInt();

        if (num < 0) {
            opposite = -1;
            num = -num;
        }

        while (num > 0) {
            reversed_num = reversed_num * 10 + num % 10;
            num /= 10;
        }
        reversed_num *= opposite;
        System.out.println("Reversed num = " + reversed_num);
    }
}
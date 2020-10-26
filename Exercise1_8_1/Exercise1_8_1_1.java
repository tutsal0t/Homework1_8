package Exercise1_8_1;
import java.util.Scanner;

public class Exercise1_8_1_1 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String BinaryN = Integer.toBinaryString(N);
        char[] reversed_n = BinaryN.toCharArray();
        String result = "";

        for(int i = reversed_n.length - 1; i >= 0; --i) {
            result = result + reversed_n[i];
        }

        System.out.println(result);
    }
}


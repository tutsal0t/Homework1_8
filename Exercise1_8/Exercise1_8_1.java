package Exercise1_8;
import java.util.Scanner;

public class Exercise1_8_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int x = in.nextInt();
        int[] a = new int[x];

        for (int i = 0; i < x; i++){
            a[i] = in.nextInt();
        }

        int b = in.nextInt();

        for (int i = 0; i < x; i++) {
            if (a[i] == b) {
                flag = true;
                System.out.println(i + 1);
                break;
            }
        }

        if (!flag) {
            System.out.println("NO");
        }

    }
}
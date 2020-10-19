package Exercise1_8;
import java.util.Scanner;
public class Exercise1_8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        float res = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 != 0) {
                res += a[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO");
        } else {
            System.out.printf("%.2f", Math.round(res / count * 100) / 100.0);

        }
    }
}
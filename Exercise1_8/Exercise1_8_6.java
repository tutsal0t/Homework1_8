package Exercise1_8;
import java.util.Scanner;
public class Exercise1_8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int num = 0;
        int b = 0;
        int c;
        for (int i = 0; i < N; i++) {
            c = sc.nextInt();
            a[i] = c;
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i; j < N; j++) {
                if(a[i]== a[j]) {
                    count++;
                }
            }
            if (b < count) {
                b = count;
                num = i;
            }
        }
        System.out.println(a[num]);
    }
}
package Exercise1_8;
import java.util.Scanner;
public class Exercise1_8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int temp;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < N/2; i++) {
            temp = a[i];
            a[i] = a[N-i-1];
            a[N-i-1] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
package Exercise1_8;
import java.util.Scanner;
public class Exercise1_8_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] x = new int[b];
        int[] a = new int[x.length];
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0)
                a[temp++] = x[i];
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= 0)
                a[temp++] = x[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
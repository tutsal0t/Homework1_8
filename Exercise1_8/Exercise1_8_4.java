package Exercise1_8;
import java.util.Scanner;
public class Exercise1_8_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int b = 4;
        for (int i = 0; i < n; i++, b += 3) {
            a[i] = b;
            System.out.print(a[i] + " ");
        }
    }
}


package Exercise1_8_2;
import java.util.Scanner;
public class Exercise1_8_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a[] = new int[x];
        int count = 0;
        a[0] = in.nextInt();
        for (int i=1; i<x; i++) {
            a[i] = in.nextInt();
            if (a[i]>a[i-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
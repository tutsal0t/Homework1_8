package Exercise1_8_2;
import java.util.Scanner;
public class Exercise1_8_2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a[] = new int[x];
        a[0]=in.nextInt();
        int max=a[0];
        for (int i=1; i<x; i++) {
            a[i] = in.nextInt();
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}


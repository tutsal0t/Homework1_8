package Exercise1_8;
import java.util.Scanner;

public class Exercise1_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        int k = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum = sum + a[i];
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("NO");
        } else{
            System.out.print(sum);
        }
    }
}
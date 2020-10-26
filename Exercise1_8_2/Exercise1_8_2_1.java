package Exercise1_8_2;
import java.util.Scanner;
public class Exercise1_8_2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e[] = new int[n + 1];
        int f[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            e[i] = i;
            f[i] = e[i];
        }
        for (int i = 0; i <= b - a; i++) { // 0 1 2 3
            e[a + i] = f[b - i];
        }
        for (int i = 1; i <= n; i++) {
            f[i] = e[i];
        }
        for (int i = 0; i <= d - c; i++) {
            e[c + i] = f[d - i];
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(e[i] + " ");
            }
        }
}

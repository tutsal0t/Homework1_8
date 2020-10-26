package Exercise1_8_1;
import java.util.Scanner;
public class Exercise1_8_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1;
        for(int i=1;i<=a; i++) {
            b*=i;
        }
        System.out.println(b);
    }
}



package Exercise1_8_1;
import java.util.Scanner;
public class Exercise1_8_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] a = new int[x];
        for(int i=0; i<x; i++) {
            if (i+1==x) {
                for(int j = 0; j < x; j++) {
                    if (a[j] == 0) {
                        System.out.println(j+1);
                        break;
                    }
                }
            }else{
                int b = in.nextInt();
                a[b-1] = b;
            }
        }

    }
}


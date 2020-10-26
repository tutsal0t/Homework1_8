package Exercise1_8_1;
import java.util.Scanner;
public class Exercise1_8_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[][] arr = new int[x][x];
        int i;
        for (i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                arr[i][j]=x*i+j+1;
            }
        }
        for (i=0; i<x; i++) {
            if (i+1==x) {
                System.out.print(arr[i][i]);
            }else{
                System.out.print(arr[i][i]+" ");
            }
        }
    }
}


package Exercise1_11;
import java.util.Scanner;
public class Exercise1_11_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        int a[][] = new int[N][M];
        int b[][] = new int[M][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                a[i][j] = in.nextInt();
            }
        }
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                b[j][N-1-i] = a[i][j];
            }
        }
        System.out.println(M + " " + N);
        for(int i=0; i<M; i++){
            for (int j=0; j<N; j++){
                if (j+1 == N){
                    System.out.print(b[i][j]);
                } else {
                    System.out.print(b[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}


package Exercise1_11;
import java.util.Scanner;
public class Exercise1_11_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a;
        int b=0;
        String c;
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=i*j;
                a=arr[i][j];
                if (a==0){
                    b++;
                }
                while (a > 0) {
                    a/=10;
                    b++;
                }
                c="";
                for(int l=0; l<4-b; l++) {
                   c+=" ";
                }
                System.out.print(c+arr[i][j]);
                b=0;
            }
            System.out.println();
        }
    }
}

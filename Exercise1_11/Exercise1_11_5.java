package Exercise1_11;
import java.util.Scanner;
public class Exercise1_11_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int a[][] = new int[n][m];
        int b;
        int c=0;
        String del;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if (i%2==1){
                    a[i-1][j-1]=(i-1)*m+j-1;
                } else{
                    a[i-1][j-1]=i*m-j;
                }
                b=a[i-1][j-1];
                if (b==0){
                       c++;
                }
                while (b > 0) {
                    b/=10;
                    c++;
                }
                del = "";
                for(int l=0; l<3-c; l++) {
                    del+=" ";
                }
                System.out.print(del+a[i-1][j-1]);
                c=0;
            }
            System.out.println();
        }
    }
}


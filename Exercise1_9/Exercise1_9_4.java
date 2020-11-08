package Exercise1_9;
import java.util.Scanner;
public class Exercise1_9_4 {
    static String v(double x, int n){
        String a = "";
        double b;
        for (int i = 0; i < n; i++){
            b = x*2;
            if (b >= 1){
                a += 1;
                x = b-1;
            } else{
                a += 0;
                x = b;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        int N = in.nextInt();
        System.out.println(v(X, N));
    }
}


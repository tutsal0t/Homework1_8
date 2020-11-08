package Exercise1_9;
import java.util.Scanner;
public class Exercise1_9_3 {
    static int sum(int n){
        int count = 0;
        for (int i=100; i<n; i++){
            int a = i/100;
            int b = i/10 % 10;
            int c = i%10;
            if ((a+b+c)%13==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        System.out.println(sum(d));
    }
}


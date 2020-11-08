package Exercise1_9;
import java.util.Scanner;
public class Exercise1_9_1 {
    static int sum(int n){
        int a = n%10;
        int b = n/10;
        return a + b;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
    }
}


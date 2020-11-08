package Exercise1_9;
import java.util.Scanner;
public class Exercise1_9_2 {
    static void sum(){
        int sum=0;
        for (int i=10;i<100; i++){
            if (i%7==0){
                int a = i/10;
                int b = i%10;
                sum += a+b;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        sum();
    }
}


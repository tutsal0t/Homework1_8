package Exercise1_8_2;
import java.util.Scanner;
public class Exercise1_8_2_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a[] = new int[x];
        for (int i=0; i<x; i++){
            a[i] = in.nextInt();
        }
        for (int i=0; i<x; i++){
            if (a[i]%2 == 0){
                if (i+1==x){
                    System.out.print(a[i]);
                }else{
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}

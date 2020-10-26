package Exercise1_8_2;
import java.util.Scanner;
public class Exercise1_8_2_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a[] = new int[x];
        int b[] = new int[x];
        int count = 0;
        boolean c = true;
        boolean d = true;
        for(int i=0; i<x; i++){
            a[i] = in.nextInt();
            if (a[i]==0 && d){
                count++;
                d = false;
            }
            for (int j=0; j<x; j++){
                if (b[j]==a[i]){
                    c = false;
                }
            }
            if (c){
                b[i]=a[i];
                count++;
            }else{
                c=true;
            }
        }
        System.out.println(count);
    }
}


package Exercise1_9;
import java.util.Scanner;
public class Exercise1_9_6 {
    static int[] v(int[] arr){
        int a[] = new int[arr.length];
        int min = arr[0];
        int min1 = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                min1 = i;
            }
        }
        for (int i = 0; i<arr.length; i++){
            if (i==min1){
                a[0] = arr[i];
            } else if (i<min1) {
                a[i+1] = arr[i];
            } else if (i>min1){
                a[i] = arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int array[] = new int[N];
        for (int i=0; i<N; i++){
            array[i] = in.nextInt();
        }
        array = v(array);
        for (int i=0; i<N; i++){
            if (i+1==N){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}


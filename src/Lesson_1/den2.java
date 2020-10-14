package Lesson_1;
import java.util.Scanner;

 class fornov {
     public static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         n = n % 10;
         System.out.println(n);
     }
 }
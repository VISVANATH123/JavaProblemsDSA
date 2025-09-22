package Arrays;

import java.util.Scanner;

public class SecondMinimun {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[100];
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int min=a[0],secondmin=Integer.MAX_VALUE;
        for(int i=1;i<n;i++) {
            if (a[i] < min) {
                secondmin = min;
                min = a[i];
            } else if (a[i]>min && a[i]<secondmin) {
                secondmin=a[i];
            }
        }
        System.out.println(min);
        System.out.println("-------------------------------");
        System.out.println(secondmin);
    }
}

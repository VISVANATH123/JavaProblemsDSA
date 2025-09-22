package Arrays;

import java.util.Scanner;

public class checkArrayRotated {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] a=new int[100];
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[(i+1)%n]){
                count++;
            }
        }
        System.out.println(count<=1);
    }

    public static class SecondLargest {
        public static void main(String args[]){
            Scanner scan=new Scanner(System.in);
            int[] a=new int[100];
            int n= scan.nextInt();
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
            }
            int max=a[0],secondMax=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    secondMax=max;
                    max=a[i];
                }else if(a[i]<max && secondMax<max){
                    secondMax=a[i];
                }
            }
            System.out.println(secondMax);
            System.out.println("-------------------------------------------");
            System.out.println(max);
        }
    }
}

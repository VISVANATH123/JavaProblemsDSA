package mylist;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        // Using Linked class from another file
        LinkedList list = new LinkedList();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            list.insert(scan.nextInt());
        }
        int v=getDecimalValue(list.head);
        System.out.println(v);
        list.display();
    }
    public static int getDecimalValue(Node head) {
        String a="";
        while(head!=null){
            a+=head.data;
            head=head.next;
        }
        int decimal=Integer.parseInt(a,2);
        return decimal;

    }
}

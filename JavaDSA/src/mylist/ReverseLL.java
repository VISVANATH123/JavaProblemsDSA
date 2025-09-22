package mylist;

import java.util.Scanner;

public class ReverseLL {
    public static void main(String[] args) {
        // Using LinkedList class from another file
        LinkedList list = new LinkedList();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            list.insert(scan.nextInt());
        }
        list.head=reversell(list.head);
        list.display();
    }
    public static Node reversell(Node head){

        return helper(head,null);
    }
    public static Node helper(Node head,Node prev){
        if(head==null){
            return prev;
        }
        Node next=head.next;
        head.next=prev;
        return helper(next,head);
    }
}

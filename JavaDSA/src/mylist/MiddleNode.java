package mylist;

import java.util.Scanner;

public class MiddleNode {
    public static void main(String[] args) {
        // Using Linked class from another file
        LinkedList list = new LinkedList();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            list.insert(scan.nextInt());
        }
        Node mid=Middle(list.head);
        list.display();
        System.out.println(mid.data);
    }
    public static Node Middle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

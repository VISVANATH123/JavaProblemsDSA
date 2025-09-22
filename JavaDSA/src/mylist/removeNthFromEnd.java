package mylist;

import java.util.Scanner;

public class removeNthFromEnd {
    public static void main(String[] args) {
        // Using Linked class from another file
        LinkedList list = new LinkedList();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            list.insert(scan.nextInt());
        }
        int target=scan.nextInt();
        list.head=removeNode(list.head,target);
        list.display();
    }
    public static Node removeNode(Node head,int n){
        Node dummy=new Node(-1);
        dummy.next=head;
        Node fast=dummy;
        Node slow=dummy;
        for(int i=0;i<n;i++){
            slow=slow.next;
        }
        while(slow.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next=fast.next.next;
        return dummy.next;

    }
}

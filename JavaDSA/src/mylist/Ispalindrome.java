package mylist;

import java.util.Scanner;

public class Ispalindrome {
    public static void main(String[] args) {
        // Using Linked class from another file
        LinkedList list = new LinkedList();
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for(int i=0;i<n;i++){
            list.insert(scan.nextInt());
        }

        list.display();
        System.out.println(is(list.head));
    }
    public static boolean is(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null  && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }


        Node prev=null;
        Node curr=slow;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node f=head,s=prev;
        while(f!=null && s!=null){
            if(f.data!=s.data){
                return false;
            }
            f=f.next;
            s=s.next;
        }
        return true;

    }
}

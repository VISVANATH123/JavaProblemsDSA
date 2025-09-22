package mylist;

public class Cylcell {
//    / Detect if cycle exists using Floyd's Cycle Detection (Tortoise & Hare)
    public static boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps
            if (slow == fast) {
                return true;           // cycle detected
            }
        }
        return false;
    }
}

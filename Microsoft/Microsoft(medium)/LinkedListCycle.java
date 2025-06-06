public class LinkedListCycle {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Function to detect if a cycle exists in the linked list
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    // Function to find the start of the cycle if it exists
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        
        // First step: determine if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle detected, now find the entry point
                ListNode entry = head;
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                return entry; // The start of the cycle
            }
        }
        return null; // No cycle found
    }
    public static void main(String[] args) {
        LinkedListCycle llc = new LinkedListCycle();
        
        // Create a linked list with a cycle for testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Creates a cycle
        
        // Check if the linked list has a cycle
        System.out.println("Has Cycle: " + llc.hasCycle(head)); // Should print true
        
        // Detect the start of the cycle
        ListNode cycleStart = llc.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val); // Should print 1
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
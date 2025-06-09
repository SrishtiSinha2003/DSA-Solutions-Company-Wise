public class DeleteANodeInALinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // Deletes the given node (except the tail) from the linked list
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        DeleteANodeInALinkedList solution = new DeleteANodeInALinkedList();
        System.out.println("Before deletion:");
        printList(head);

        // Deleting node with value 5
        solution.deleteNode(head.next); // head.next is the node with value 5

        System.out.println("After deletion:");
        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if(l2 == null) return l1;
        // Create a dummy node to act as a placeholder for the result list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Iterate through both lists while both are not null
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If one of the lists is not null, append it to the result list
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Return the merged list, starting from the next of the dummy node
        return dummy.next;
    }

    public static void main(String[] args) {
        // Example lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode mergedList = solution.mergeTwoLists(l1, l2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}


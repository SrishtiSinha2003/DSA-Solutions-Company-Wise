public class PalindromeLinkedList {
    static class Node {
        int data;
        Node next;
    }
    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }
    static Node reverse(Node head) {
        Node prev = null;
        while(head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    static boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //if odd number of nodes, we will get an extra slow pointer
        if(fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while(slow != null && fast != null) {
            if(fast.data != slow.data) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(2);
        head.next.next.next = newNode(1);
        if (isPalindrome(head)) {
            System.out.println("Linked List is a palindrome.");
        } else {
            System.out.println("Linked List is not a palindrome.");
        }
    }
}

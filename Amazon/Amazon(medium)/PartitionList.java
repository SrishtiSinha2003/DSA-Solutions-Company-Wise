public class PartitionList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static void printList(Node node){
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
static Node partitionList(Node head, int x) {
    Node before_head = new Node(0);
    Node before = before_head;
    Node after_head = new Node(0);
    Node after = after_head;

    while(head != null) {
        if(head.data < x) {
            before.next = head;
            before = before.next;
        } else {
            after.next = head;
            after = after.next;
        }
        head = head.next;
    }
    after.next = null;
    before.next = after_head.next;  

    return before_head.next;
}

public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(4);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = new Node(2);
    
   int x = 3;
   Node result = partitionList(head, x);
    printList(result);
    
}
}

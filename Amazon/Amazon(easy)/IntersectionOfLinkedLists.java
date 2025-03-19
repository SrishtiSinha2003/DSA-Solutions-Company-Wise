public class IntersectionOfLinkedLists {
    static class Node{
        int data;
        Node next;
    }
    static Node newNode(int key){
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }
    static Node intersect(Node l1, Node l2) {
        if(l1 == null || l2 == null) return null;
        Node p1 = l1, p2 = l2;
        while(p1 != p2){
            p1 = p1 == null ? l2 : p1.next;
            p2 = p2 == null ? l1 : p2.next;
        }
        return p1;
    }
    public static void main(String[] args) {
        Node l1 = newNode(1);
        l1.next = newNode(2);
        l1.next.next = newNode(3);
        l1.next.next.next = newNode(4);
        l1.next.next.next.next = newNode(5);
        l1.next.next.next.next.next = newNode(6);
        Node l2 = newNode(9);
        l2.next = newNode(10);
        l2.next.next = l1.next.next.next;
        Node intersectingNode = intersect(l1, l2);
        if(intersectingNode != null){
            System.out.println("Intersecting Node: " + intersectingNode.data);
        }else{
            System.out.println("No intersection");
        }
    }
}

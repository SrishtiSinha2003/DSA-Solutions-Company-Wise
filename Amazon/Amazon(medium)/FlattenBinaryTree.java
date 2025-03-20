public class FlattenBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        static Node newNode(int data){
            return new Node(data);
        }
    }
    static Node Flatten(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }
        if(root.left != null){
            Node right = root.right;
            root.right = root.left;
            root.left = null;
            Node temp = Flatten(root.right);
            temp.right = right;
        }
        return Flatten(root.right);
    }
    static void print(Node root){
        while(root != null){
            System.out.print(root.data + " ");
            root = root.right;
        }
    }
    public static void main(String[] args) {
        Node root = Node.newNode(1);
        root.left = Node.newNode(2);
        root.right = Node.newNode(5);
        root.left.left = Node.newNode(3);
        root.left.right = Node.newNode(4);
        root.right.right = Node.newNode(6);
        Flatten(root);
        print(root);
    }
}

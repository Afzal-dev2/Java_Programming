//Binary Search Tree without recursion

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    static Node root = null;
    Node temp;

    public void insert(int data) throws NullPointerException {
        try {

            if (root == null) {
                root = temp = new Node(data);
            } else {
                temp = root;
                while (true) {
                    if (temp.data > data && temp.left != null) {
                        temp = temp.left;
                    } else if (temp.data < data && temp.right != null) {
                        temp = temp.right;
                        
                    } else if (temp.left == null || temp.right == null)
                        break;
                }
                if (temp.data > data) {
                    temp.left = new Node(data);
                } else if (temp.data < data) {
                    temp.right = new Node(data);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void display_inorder() {

        inorder(root);
    }

    public void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(20);
        bst.insert(2);
        bst.insert(10);
        bst.insert(40);

        bst.inorder(root);

    }
}

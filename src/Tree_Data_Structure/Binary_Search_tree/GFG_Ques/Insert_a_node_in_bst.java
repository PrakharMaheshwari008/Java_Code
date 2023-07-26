package Tree_Data_Structure.Binary_Search_tree.GFG_Ques;

public class Insert_a_node_in_bst {
    public static void main(String[] args) {
//        int[] arr = new
//        Node root = new Node()
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int Key) {
        if (root == null) {
            return new Node(Key);
        }
        if (root.data > Key) {
            root.left = insert(root.left, Key);

        }
        if (root.data < Key) {
            root.right = insert(root.right, Key);
        }
        return root;
    }
}
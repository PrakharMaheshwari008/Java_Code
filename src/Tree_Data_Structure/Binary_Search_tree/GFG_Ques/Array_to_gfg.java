package Tree_Data_Structure.Binary_Search_tree.GFG_Ques;

public class Array_to_gfg {
    public static void main(String[] args) {
        int[] values = {2, -1, 7, -1, 6, -1, 5, -1, 9, -1, 2, -1, 6};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
    }

    private static Node insert(Node root, int val_insert) {
        if (root == null){
            root = new Node(val_insert);
            return root;
        }
//        here Data (val_insert) to be inserted is smaller than root.data then go left side
        if (root.data > val_insert)
        { // root.left is Indicate that reference of the data that inserted on left side store in the same
            root.left = insert(root.left,val_insert);
        }
//        if (root.data < val_insert)
        else
        { // root.right is Indicate that reference of the data that inserted on right side store in the same
            root.right = insert(root.right,val_insert);
        }
        return root;
    }
   private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
     Node inorderSuccessor(Node root,Node x)
    {
        if(root == null){
            return null;
        }

       inorderSuccessor(root.left, x);
        if(root.data == x.data){
            if(root.right == null ){
                return null;
            }
            if(root.right.left == null){
                return root.right;
            }
        }
        inorderSuccessor(root.right, x);
        return null;
    }
}

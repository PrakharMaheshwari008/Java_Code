package Tree_Data_Structure.Binary_Tree_concept.gfg;
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
public class foldableBinaryTree {
    public static void main(String[] args) {
    }
//Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node root)
    {
        boolean check = true;
        if(root == null){
            return true;
        }
        if(root.left != null && root.right != null){
            return IsFoldable(root.left);


        }
        else if(root.right != null && root.left != null){
            return IsFoldable(root.left);
        }
        return false;

    }
}
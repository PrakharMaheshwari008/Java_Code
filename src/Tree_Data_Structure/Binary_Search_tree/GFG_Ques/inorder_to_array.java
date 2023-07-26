package Tree_Data_Structure.Binary_Search_tree.GFG_Ques;
import java.util.ArrayList;

public class inorder_to_array {
    static int[] arr  = {2,3,4,5,6,7,1,9,17,29,8,27,61};

    static ArrayList<Integer> arr1  = new ArrayList<>();

    public static void main(String[] args) {
        Node root = null;
        for (int i = 0; i< arr.length ;i++){
            root = insert(root,arr[i]);
        }
        System.out.println(root.data);

        inorder_prac(root);
        System.out.println();

        storeInOrder(root);
        for (int i= 0 ; i < arr1.size();i++)
        {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        System.out.println(arr1.get(arr1.size()-1));

    }
  private static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    private static Node insert(Node root,int val_insert){
        if (root == null){
            root = new Node(val_insert);
            return root;
        }
        if (root.data > val_insert) {
            root.left = insert(root.left,val_insert);
        }
        else {
            root.right = insert(root.right,val_insert);
        }
        return root;
    }

    private static void inorder_prac(Node root) {
        if (root == null){
            return;
        }
        inorder_prac(root.left);
        System.out.print(root.data+" ");
        inorder_prac(root.right);
    }


    static void storeInOrder(Node root) {
        if (root == null)
            return;
        storeInOrder(root.right);
        arr1.add(root.data);
        storeInOrder(root.left);
    }


}

package Tree_Data_Structure.Binary_Tree_concept;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class Boundry_Traversal {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);
//        ArrayList<Integer> boundaryTraversal.printBoundry(root);
    }
    static boolean isLeaf(Node root){
        return (root.left == null) && (root.right == null);
    }
    static void addleafBoundry(Node root, ArrayList<Integer> res){
        Node cur = root.left;
        while (cur != null){
            if(!isLeaf(cur)) res.add(cur.data);

            if (cur.left!= null) cur = cur.left;
            else cur = cur.right;
        }
    }
    static void addRightBoundary(Node root,ArrayList<Integer> res){
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr!=null){
            if(!isLeaf(curr)) temp.add(curr.data);
            if (curr.right != null) curr = curr.right;
            else curr = curr.right;
        }
        int i;
        for (i = temp.size() - 1; i >= 0; --i) {
            res.add(temp.get(i));
        }
    }

    static void addLeaves(Node root, ArrayList < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    static ArrayList < Integer > printBoundary(Node node) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (!isLeaf(node)) ans.add(node.data);
        addleafBoundry(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

}

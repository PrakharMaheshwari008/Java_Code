package Tree_Data_Structure.Binary_Tree_concept;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_tree_build_N_concept {

    static class Node {    // firstly, we have to make a Node [ Which represent every single node int the tree )
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryNode {
        static int idx = -1;            // this is the static variable create to incremented update as it has traversed

        public static Node Buildtree(int[] Node_arr) {  // arr is passed to the method then this method traverse the same array and perform their task

            idx++;          //initially index have to preform increment otherwise it got by base condition and operation will not occur
            if (Node_arr[idx] == -1) {        // revise the earlier concept in the array as they're traversing  and encountered any -1 value
                // it will place null value and goo ahead to right of tree if again faced -1
              return null;                  //                           go to their ancestor and check their right side of tree and traverse onward

            }
            Node newNode = new Node(Node_arr[idx]);                //creating the newNode to build tree
            newNode.left = Buildtree(Node_arr);            // recursion: call is made to add element(Node) to left side of the newNode nad soOn
            newNode.right = Buildtree(Node_arr);         // // recursion: call is made to add element(Node) to right side of the newNode nad soOn
            return newNode;                           // At last this return newNode and
        }
    }
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void main(String[] args) {
//        int[] Nodes_arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, F1, -1};
        int[] Nodes_arr = {10,75,-1,9,-1};
//        int[] Nodes_arr = {1,2,3,-1,-1,-1,3,-1,6,0,4,5,6,7};
//        int[] Nodes_arr1 = {1,2,3};

        BinaryNode Binarynode = new BinaryNode();
        Node root = BinaryNode.Buildtree(Nodes_arr); //
//        System.out.println(root.right.right.data); // to access any data through root.left.right.data or required
//        System.out.println(root.data);

//        >>>>>>>>>>>>>>>> Now Few calling for traversal <<<<<<<<<<<<<<<<<<<<<<<<
//        there are three types of traversal :
//        Also known as Depth first search : b'coz it's goes into the depth
        System.out.println(">>>>>>>>>>>>>>>> Now Few calling for traversal <<<<<<<<<<<<<<<<<<<<<<<<\n" +
                "there are three types of traversal :\n" +
                "Also known as Depth first search : b'coz it's goes into the depth");
        preordere(root);
        System.out.println();
        postorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
//        <<<<<<<<<<<<<<<<<< this is the Level Order Traversal  :- breadth first search
        System.out.println("<<<<<<<<<<<<<<<<<< this is the Level Order Traversal  :- breadth first search\n");
        levelOrder(root);
        System.out.println();
//        >>>>>>>>>>>>>> this call is to count node in the tree;
        System.out.println(" this call is to count node in the tree;");
        System.out.println(countNodes(root));
        System.out.println();
        TreeInfo trr = new TreeInfo(0,0);

        System.out.println(diaMeter(root).diam);
        System.out.println(IsFoldable(root));
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//            GFG Question Fordable Binary tree
static boolean IsFoldable(Node root)
{
    if(root == null){
        return true;
    }
    if(root.left != null && root.right != null){
        return true;
    }
  if(root.right == null || root.left != null){
        return false;
    }
    return false;
}
//private boolean dfs(Node root.[.length-1])
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public static void preordere(Node root) {
        if (root == null) {
//            System.out.println(-1 + " ");
            return;
        }
        System.out.print(root.data + " "); //first print Node
        preordere(root.left);      //then go left and print it
        preordere(root.right);     //then go right and print it
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    //___________________   Level_Order Traversal    ________________________
    public static Node levelOrder(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            Node currNode = que.remove();
            if (currNode == null) {
//                System.out.println();// to print next o/p in next line
                if (que.isEmpty())
                    break;
                else
                    que.add(null);

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null) {
                    que.add(currNode.right);
                }
            }
        }
        return root;
    }

    //    this is new _Ques: Count the No of Node in the Tree
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int left_node = countNodes(root.left);
        int right_node = countNodes(root.right);
        return left_node + right_node + 1;
    }

//    public static int Sumof_all_node{
//
//    }

    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diaMeter(Node root)
    {

        if (root == null)
        {
            return new TreeInfo(0,0);
        }
        TreeInfo left = diaMeter(root.left);
        TreeInfo right = diaMeter(root.right);
        int final_height = Math.max(left.ht,right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.diam + right.diam +1;
        int MyDiam = Math.max(Math.max(diam2,diam1),diam3) ;
        return new TreeInfo(final_height,MyDiam);
    }
}
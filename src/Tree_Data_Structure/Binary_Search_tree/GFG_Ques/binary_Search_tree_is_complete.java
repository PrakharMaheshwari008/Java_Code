package Tree_Data_Structure.Binary_Search_tree.GFG_Ques;
public class binary_Search_tree_is_complete {
    public static void main(String[] args) {
        int[] Nodes_arr = {1, 2, -1,3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryNode Binarynode = new BinaryNode();
        Node root = BinaryNode.Buildtree(Nodes_arr);
        int node_count = Binarynode.countNode(root);
//        System.out.println(BinaryNode.countNode(root));
        int index = 0;
        if (Binarynode.isComplete(root,index,Binarynode.countNode(root))){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right= null;
        }
    }

    static class BinaryNode {
        static int idx = -1;            // this is the static variable create to incremented update as it has traversed

        public static Node Buildtree(int[] Node_arr) {  // arr is passed to the method then this method traverse the same array and perform their task

            idx++;          //initially index have to preform increment otherwise it got by base condition and operation will not occur
            if (Node_arr[idx] == -1) {        // revise the earlier concept in the array as they're traversing  and encountered any -1 value
                // it will place null value and goo ahead to right of tree if again faced -1
//                                                                go to their ancestor and check their right side of tree and traverse toward
                return null;
            }
            Node newNode = new Node(Node_arr[idx]);                //creating the newNode to build tree
            newNode.left = Buildtree(Node_arr);            // recursion: call is made to add element(Node) to left side of the newNode nad soOn
            newNode.right = Buildtree(Node_arr);         // // recursion: call is made to add element(Node) to right side of the newNode nad soOn
            return newNode;                           // At last this return newNode and

        }

         int countNode(Node root){
            if (root == null){
                return 0;
            }
            return (countNode(root.left)+countNode(root.right) + 1);
        }
        boolean isComplete(Node root,int index,int number_nodes){
            // An empty tree is complete
            if (root ==null)
            {
                return true;
            }
            if (index >= number_nodes) {
                return false;
            }
            return (isComplete(root.left,2*index+1,number_nodes) && isComplete(root.right,2*index+2,number_nodes));
        }
    }

}

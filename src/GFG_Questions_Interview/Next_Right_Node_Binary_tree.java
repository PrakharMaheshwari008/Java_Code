package GFG_Questions_Interview;

import javax.management.ListenerNotFoundException;
import java.util.LinkedList;
import java.util.Queue;

public class Next_Right_Node_Binary_tree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int levelOrder (Node root,int key) {
        if (root == null) {
            return -1;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            Node currNode = que.remove();
            if (currNode == null) {
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            }

           else if (currNode.data == key) {
                if (!que.isEmpty()) {
                    Node righ = que.remove();
                    if (righ != null) {
                        return righ.data;
                    } else if (righ == null) {
                        return -1;
                    }
                }
            } else if (currNode == null) {
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            }


        }
        return key;
    }
    public static void main(String[] args) {

    }
}

package Tree_Data_Structure.Binary_Tree_concept;

import java.util.*;

public class Tree_practice {
    public static void main(String[] args) {

    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            Node currNode = que.remove();

            if (currNode == null) {
                System.out.println();

                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }
            } else {
                System.out.println(currNode.data+ " ");
                if (currNode.left != null) {
                    que.add(currNode.left);
                }
                if (currNode.right != null){
                    que.add(currNode.right);
                }
            }
        }
    }

    ArrayList<Integer> findSpiral(Node root)
    {
        // Your code here
        if(root==null)
        {
            ArrayList<Integer>hh=new ArrayList<>();
            return hh;
        }
        ArrayList<Deque<Integer>>l=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int eo=0;
        while(!q.isEmpty())
        {
            Deque<Integer> d=new ArrayDeque<>();
            int c=q.size();
            for(int i=0;i<c;i++)
            {
                Node cur=q.poll();
                if(eo==0)
                {
                    d.addFirst(cur.data);
                }
                else
                {
                    d.addLast(cur.data);
                }
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(eo==0) eo=1;
            else eo=0;
            l.add(d);
        }
        ArrayList<Integer>hh=new ArrayList<>();
        for(Deque<Integer>aa:l)
        {
            for(Integer t:aa)
            {
                hh.add(t);
            }
        }
        return hh;

    }
}
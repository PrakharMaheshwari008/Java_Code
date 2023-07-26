package leet_code_Contest;

import Linked_List.LL_Insertion;


public class MergeNodesinBetweentZeros {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
    public void insertionFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
    }
    static int ref2 =0;

    public void printing()
    {
        Node temp = head;
        while (temp != null){
            if (temp.value != 0) {
                int ref = temp.value + temp.next.value;
                System.out.println(ref);
            }
            else{

                ref2 = temp.value + temp.next.value;
                System.out.println(ref2);
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MergeNodesinBetweentZeros main = new MergeNodesinBetweentZeros();
        main.insertionFirst(1);
        main.insertionFirst(2);
        main.insertionFirst(3);
        main.insertionFirst(0);
        main.insertionFirst(17);
        main.insertionFirst(9);
        main.printing();
    }
}
package Linked_List;

public class Circular_LL {
    private Node tail;
    private Node head;
    class Node{
        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }
    public void insertion(int val)
    {
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display()
    {
        Node node = head;
        if (head != null)
        {
            do {
                System.out.print(node.val+" --> ");
                node = node.next;
            }
            while (node != head);
            System.out.println("Head");
        }
    }
    public void delete(int val)
    {
        Node node = head;
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }
}

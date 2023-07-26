package Linked_List;
public class Doubly_linked {
    Node head;
    int size = 0;

    private class Node {
        int val;
//        Node head;
        Node next;
        Node prev;
        public Node(int val) { // this constructor is used to insert at beginning or end &
//                                  delete at same position… with a single value.
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void display()
    {
        Node tempnode = head;
        Node tail = null;
        while (tempnode != null){
//          val = tempnode.val;
            System.out.print(tempnode.val +" --> ");
            tail = tempnode; // by the end of the while loop it will point to the last node;
            tempnode = tempnode.next;
        }
        System.out.println("End");
        System.out.println(" Print in reverse");

        while(tail != null)
        {
            System.out.print(tail.val + " <-- ");
            tail = tail.prev;
        }
        System.out.println("Start");

    }
    public void insertlast(int val)
    {
        Node node = new Node(val);
        Node tail = head;
//        int value = temp.val;
        if (head == null)
        {
            insertfirst(val);
            return;
        }
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;
        node.next = null;
        size++;
    }
    public void insertAtPos(int val, int index){
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1;i<index;i++) {
            temp = temp.next;
        }
        temp.next = new Node(val,temp.next,temp.prev);
        size++;
    }
    public void insertAfterValue(int After, int val) {
        Node p = findValue(After);
        if (p==null) {
            System.out.println("Does Not Exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null)
        {
            node.next.prev = node;
        }
    }
    public Node findValue(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }
        }
        return null;
    }
    }

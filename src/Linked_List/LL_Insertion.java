package Linked_List;

public class LL_Insertion {
    private Node head;
    private Node tail;
    private int size;
// **************************************************************
    public LL_Insertion(){
        this.size = 0;
    }
//    **********************************************************
public static class Node {
        private final int value;
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
//     ************************************************************
    public void insertionFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size+=1;
    }
    // **************************************************************
    public void insertionlast(int val)
    {
        if (tail == null)
        {
            insertionFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    // **************************************************************
    public void insert_at_pos(int val, int index)
    {
        if (index == 0){
            insertionFirst(val);
            return;
        }
        if (index == size){
            insertionlast(val);
            return;
        }
        Node temp = head;
        for(int i = 1 ; i <index ; i++)
        {
            temp = temp.next;
        }
        Node node;
        node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
//    *********************************************************8
    public Node remove_choose_val(Node head, int val){
//        Node curr = head;
        Node curr = head;
        while(curr != null){
            if(curr.value == val){
                head = curr.next;
                curr = head;
            }else if(curr.next != null && curr.next.value == val){
                if(curr.next.next != null){
                    curr.next = curr.next.next;
                }else{
                    curr.next = null;
                }
            }else{
                curr = curr.next;
            }
        }
        return head;
//              recursive Approach
//
//        if (head == null) return null;
//        head.next= remove_choose_val(head.next, val);
//
//        if (head.value == val) return head.next;
//        else return head;
    }
    // **************************************************************
    public void display()
    {
        Node temp = head;
       while (temp != null)
       {
           System.out.print(temp.value+" --> ");
           temp = temp.next;
        }
        System.out.println("END");

    }
    // **************************************************************
    public int delete(int index)
    {
        if(size <=1)
        {
            return deletefirst();
        }
        if (index == size-1)
        {
            return deletelast();
        }
        Node prev = get_element(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public int deletelast() {
        if (size <= 1)
        {
            return deletefirst();
        }
        Node secondNode = get_element(size-2);
        int val = secondNode.next.value;
//        tail = secondNode;
//        tail.next = null;

        secondNode.next = null;

        size--;
        return val;
    }

    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        size--;
        return val;
    }


    public Node get_element(int index)
    {
        Node node = head;
       for(int i = 0 ; i < index; i++)
       {
           node = node.next;
       }
        return node;
    }
//    *********************************************************************
//    Linked_List.Node recu_insert(Linked_List.Node Node, int index, int val)
//    {
//        Linked_List.Node newnode = new Linked_List.Node(index, val);
//        if (index == 1)
//        {
//            newnode.next = Node;
//            Node.next = newnode;
//            return Node;
//        }
//        recu_insert(Node.next,index--,val);
//        return Node;
//    }
public void insertRec(int val, int index)
{
    head = insertRec(val,index,head);
}
    private Node insertRec(int val, int index, Node node) {
        if (index == 0 )
        {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        index--;
        node.next = insertRec(val, index,node.next);
        return node;
    }

//    leetCode Ques : Remove Duplicates from Sorted List :-

    public void duplicate(){
        Node node = head;
        while(node.next != null)
        {
            if (node.value == node.next.value)
            {
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        LL_Insertion list = new LL_Insertion();
        list.insertionlast(1);
        list.insertionlast(1);
        list.insertionlast(1);
        list.insertionlast(1);
        list.insertionlast(3);
        list.insertionlast(3);
        list.display();
//        list.duplicate();
        list.remove_choose_val(list.head, 1);
        list.display();
    }


}

package Linked_List.practice_linked_List;

public class Linked_List {
    private Node head;
    private int size;
    private Node tail;

    public Linked_List(){
        this.size = 0;
    }
    // *********************** To Display the Node *****************************************
    public void display()
    {
        Node temp = head;
        while (temp!= null)
        {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
//    ****************************** First_Insertion_Function ********************************
public void insertFirst(int val)
{
    Node new_node = new Node(val);
    new_node.next = head;
    head = new_node;
    if (tail == null){
        tail =  head;
    }
    size++;
}
//    ******************* To Insertion At Last ********************************
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//    IMP_NOTE - In case we don't maintain the tail, so we have to traverse the entire
//                  LInkedList through head then the TIME COMPLEXITY : O(n) ***********
//                IN case we maintain the tail pointer at the last
//    ______________________________________________________________________________
    public void insertLast(int val)
    {
        if(tail == null)
        {
          insertFirst(val);
          return;
        }
        Node newNode = new Node(val);
        tail.next=newNode;
        tail = newNode;
        size++;
    }
//    ******************* To Insertion At Middle ********************************
    public void Middle_insertion(int val,int index){
        if (index == 0)
        {
            insertFirst(val);
            return;
        }
        if (index == size)
        {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1;i< index;i++)
        {
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }
//    ******************* To delete first_node ********************************
public int deletefirst()
{
    int val  = head.value;
    head = head.next;
    if (head == null)
    {
        tail = null;
    }
    size--;
        return val;
}

//************************** TO Delete Last_node ***********************************
//     first we have to find the second_Last element of the linked_list
//    for that we have to make a function
    public Node find_Index(int index)
    {
        Node node = head;
        for(int i = 0 ;i < index;i++)
        {
            node = node.next;
        }
        return node;
    }

    public int delete_last()
    {
        if (size <= 1)
        {
            return deletefirst();
        }
        Node second_Last = find_Index(size-2);
        int val = tail.value;
        tail = second_Last;
        tail.next = null;
        return val;
    }
//***************** At particular Position ****************************************

    public int delete_from_Index (int index){
        if(index == 0){
            return deletefirst();
        }
        if (index == size - 1) {
            return delete_last();
        }
        Node prev = find_Index((index-1));
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

//  ****************** For Creating the Node Value & Address *************************

    private class Node{// we make it private I don't wont to use this class from outside
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value,Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

//    ~~~~~~~ For search the weather the value is present on the linked Listed ~~~~~~~~

    public Node find_values(int value){
        Node node = head;
        while(node != null)
        {
            if (node.value == value)
            {
                return node;
            }
            return node.next;
        }
        return null;
    }

//    _________________________________________________
public void multiplyTwoLists(Node l1,Node l2){
    String mul1 = "";
    String mul2 = "";
    int ans = 0;
    while(l1.next != null){
        mul1 = mul1 +""+ l1.value;
    }
    while(l2.next != null){
        mul2 = (mul2 +""+ l2.value);
    }
    System.out.println(mul1);
    System.out.println();
    System.out.println(mul2);

}
}

//package Queu_placeMent.Using_linked_list;
//
//
//import Linked_List.LL_Insertion;
//import Queu_placeMent.Using_Array.Queue_Empty_Exception;
//
//public class Queue_Linked {
//    public static void main(String[] args) {
//
//    }
//}
//class Queue_using_LL<T>{
//    private LL_Insertion.Node front;
//    private LL_Insertion.Node rear ;
//    int size;
//
//    public Queue_using_LL(){
//        front  = null;
//        rear = null;
//        size  = 0;
//    }
//    public int size(){
//
//        return 0;
////    }
//    public boolean isEmpty(){
//
//        return false;
//    }
//    public void enqueue(int aelm){
//        LL_Insertion.Node newNode = new LL_Insertion.Node(aelm);
//        size++;
//        if(rear == null){
//            front = newNode;
//            rear = newNode;
//        }else{
//            rear.next = newNode;
//            rear = newNode;
//        }
//    }
//    public T front() throws Queue_Empty_Exception{
//        if (front == null) {
//            throw new Queue_Empty_Exception();
//        }
//        return front.data;
//    }
//    public T dequeue() throws Queue_Empty_Exception{
//        if(front == null){
//            throw new  Queue_Empty_Exception()
//        }
//        T temp = front.data;
//        front = front.next;
//        if(front == null){
//            return null;
//        }
//        size--;
//        return temp
//    }
//}

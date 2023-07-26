package Queu_placeMent.Using_Array;

public class Queue_placement_Queue_using_Array {

    private int data[]; //create an array
    private int front; // index of element at the front of the queue
    private int rear; // index of element at the rear of the queue
    private int size; // to store the size od the Queue

    public Queue_placement_Queue_using_Array(){
        data = new int[5];
        front = -1;
        rear = -1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void enqueue(int elem) throws QueueFullException {
        if(size == data.length)
            throw new QueueFullException();
        if (size == 0)
        {
            front =0;
        }
        rear++;
        data[rear] = elem;
        size++;
    }
    public int front() throws Queue_Empty_Exception{

        if (size == 0){
            throw new Queue_Empty_Exception();
        }
        return data[front];
    }
    public int dequeue(){
        int temp = data[front];
        front++;
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }

}

package Queu_placeMent;

import static Queu_placeMent.Queue_main_practice.Queue.add;

public class Queue_main_practice {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Queue.add(2);
        Queue.add(3);
        Queue.add(3897);
        Queue.add(389);
        Queue.add(36);

        while (!Queue.isEmpty()){
            System.out.println(Queue.peak());
            System.out.println("removed "+Queue.remove());
        }
    }
 static class Queue{
        static int[] arr;
        static int size;
        static int rear = -1;
        // front will be 0 by default in case
     Queue (int n)
    {
        arr = new int[n];
        size = n;
    }
    // check the Queue isEmpty or not
    public static Boolean isEmpty() {
        return rear == -1;
    }
    public static boolean isFull(){
        return  rear == size-1;
    }

    // Enqueue_ Operation
    public static void add(int data){
        if(isFull())
        {
            System.out.println("OverFlow");
            return;
        }
        arr[++rear] = data;
    }

//    O(n) time complexity by implementing Queue using array
    public static int remove()
    {
        if(isEmpty()) {
            System.out.println("Empty Queue");
        }
        int front = arr[0];
        for (int  i = 0 ; i < rear;i++)
        {
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }
    public static int peak(){
        if (isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[0];
    }
}

}

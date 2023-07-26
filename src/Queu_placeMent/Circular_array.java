package Queu_placeMent;

public class Circular_array {
    public static void main(String[] args) {
        Queue1 queue1 = new Queue1(5);
        Queue1.add(1);
        Queue1.add(2);
        Queue1.add(3);
        Queue1.add(3);
        while (!Queue1.isEmpty())
        {
            System.out.println(Queue1.peak());
            System.out.println("delete "+Queue1.remove());
        }
    }
    static class Queue1{
        static int[] arr;
        static int size;
        static int rear = -1;
        // front will be 0 by default in case Array
//        Defined front in circular Queue
        static int front = -1;
        Queue1 (int n)
        {
            arr = new int[n];
            size = n;
        }
        // check the Queue isEmpty or not
        public static Boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return  (rear+1) %size == front;
        }

        // Enqueue_ Operation
        public static void add(int data){
            if(isFull()) {
                System.out.println("OverFlow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //    O(n) time complexity by implementing Queue using array
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                front =rear =  -1;
            } else {
                front = (front+1)%size;
            }


            return result;
        }
        public static int peak() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
}

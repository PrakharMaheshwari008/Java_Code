package Array;

public class Avg_OF_Array {
    public static void main(String[] args) {
        int array[] = AVG(10);
//        System.out.println(printing(array));
        System.out.println("dgcc"+10+10);
    }
    public static int[] AVG( int index)
    {
        int[] arr = new int[index]; /// creating the array with index

        int val = 1;


        for(int i = 0; i < index; i++)
        {

            arr[i] = val;
            val++;
            arr[index-1] = val;
            if(i== index-1){
                arr[i] = val-1;
            }
            val++;
            index--;
        }
        return arr;
    }

    public static int printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println("After 2nd Loop");
        return 0;
    }
}

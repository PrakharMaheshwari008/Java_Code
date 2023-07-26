package GFG_Ques;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class removeTheBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] color = new int[n];
        int[] radius = new int[n];

        for(int i = 0 ; i < n ;i++){
            color[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n;i++){
            radius[i] = sc.nextInt();
        }
        HashSet<Integer> hash1 = new HashSet<>();
        HashSet<Integer> hash2 = new HashSet<>();
        int count = 0;
        for (int i = 0 ; i < n;i++){
            if(hash1.contains(color[i])){

            }else {
                hash1.add(color[i]);
            }
            if (hash2.contains(radius[i]))
            {
                hash1.remove(color[i]);
                hash2.remove(radius[i]);
            }else {
                hash2.add(color[i]);
                count++;
            }
        }
        System.out.println(hash1.size());

    }
    public static int finLength(int N, int[] color, int[] radius) {
        // code here

       Stack<Integer> st = new Stack<>();
       for (int i = 0 ;i < N;i++){
           if (!st.isEmpty() && color[st.peek()]== color[i] && radius[st.peek()] == radius[i]){
               st.pop();
           }else {
               st.push(i);
           }
       }return st.size();
    }
}

package GFG_Ques;

public class TaxiBooking {
    public static void main(String[] args) {
       int N = 3, cur = 4;
      int[]  pos = {1,5,6};
       int[] time = {2,3,1};
        System.out.println(minimumTime(N,cur,pos,time));
    }
    public static int minimumTime(int N, int curr, int[] pos, int[] time) {
        // code here
        for(int i = 0 ;i <N;i++){
            if(curr == pos[i]){
                return 0;
            }
            else{
                int num = (Math.abs(curr-pos[i]))*time[i];
                pos[i] = num;
            }
        }
        int max = Integer.MAX_VALUE;
        for(int i = 0 ;i < N;i++){
            max = Math.min(max,pos[i]);
        }
        return max;
    }
}

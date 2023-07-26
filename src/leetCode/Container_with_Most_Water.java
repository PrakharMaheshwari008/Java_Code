package leetCode;

public class Container_with_Most_Water {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] hei) {
        int len = hei.length;
        int first = 0;
        int last = 0;
        for(int i = 0 ;i < hei.length-1;i++){
            if(hei[i] < hei[i+1]){
                first = i+1;
            }else{
                break;
            }
        }
        for(int i = hei.length-1 ;i>=0;i--){
            if(hei[i] > hei[i-1]){
                last = i;
            }else{
                break;
            }
        }
        int ans = 0;
        int diff = Math.abs(first-last);
        int min1 =  Math.min(hei[first], hei[last]);
        for(int i = first ; i <= min1;i++){
            ans+=min1;
        }
        return ans;
    }
}

package GFG_Questions_Interview;

import java.util.Arrays;
import java.util.HashMap;

public class min_swap {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 4};
        System.out.println(minSwaps(arr));

    }
    public static int minSwaps(int nums[])
    {
        // Code here
        int n= nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i < n; i++)
        {
            map.put(nums[i],i);
        }
        boolean Visited[]=new boolean[n];
        Arrays.fill(Visited,false);
        int res=0;
        Arrays.sort(nums);
        for(int i=0; i < n; i++)
        {
//            System.out.println(nums[i] +" "+ map.get(nums[i]) + " "+ map.get(i));
            int old_idx=map.get(nums[i]);
            if(Visited[i] == true|| old_idx==i)
            {
                continue;
            }

            int idx=i;
            int cycle=0;
            while(Visited[idx]==false)
            {
                Visited[idx]=true;
                int next_idx = map.get(nums[idx]);
                idx=next_idx;
                cycle++;
            }
            res+=(cycle-1);
        }
        return res;
    }
}

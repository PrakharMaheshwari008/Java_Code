package leetCode;

public class MaximumBagsWithFullCapacityofRocks {
    public static void main(String[] args) {
        int[] cap = {54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91};
        int[] rocks = {14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18};
       int add = 77;
        System.out.println(maximumBags(cap,rocks,add));

    }
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count = 0;
        for (int i = 0 ;i<capacity.length;i++)
        {
            if (capacity[i] == rocks[i])
            {
                count++;
            }
//            else if(capacity[i] < rocks[i])
//            {
//                count++;
//            }
            else if (capacity[i]>rocks[i]){
                capacity[i] = capacity[i] - rocks[i];
                if (capacity[i]!=0) {
                    if (capacity[i] <= additionalRocks) {
                        additionalRocks = additionalRocks - capacity[i];
                        capacity[i] = 0;
                        count++;
                    }

                }
                }

            }


        return count;
    }
}

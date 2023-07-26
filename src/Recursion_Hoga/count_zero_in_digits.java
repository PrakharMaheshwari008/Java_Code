package Recursion_Hoga;

public class count_zero_in_digits {
    public static void main(String[] args) {
//        count_value(2110515051);
//        System.out.println(count);
        numberOfSteps(8);
        System.out.println(countfun);
    }
    static int count;
    public static int count_value(int n)
    {
     if (n == 0){
         return 0;
     }
     int last = n%10;
     if (last == 0) {
         count++;
     }
     count_value(n/10);
        return count ;
    }

    static int countfun;
    public static int numberOfSteps(int num) {
        if(num == 0){
            return countfun;
        }
        if(num%2 == 0){
            countfun++;
            numberOfSteps(num/2);
//            countfun++;
        }
        else{
            countfun++;
            numberOfSteps(num-1);
//            countfun++;
        }
//        countfun++;

        return countfun;

    }
}

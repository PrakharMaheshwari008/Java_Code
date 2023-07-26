package HackerRank;

public class BeautifulDaysat_theMovies {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;
        int count = 0;

beautifulDays(i,j,k);

    }
    public static int beautifulDays(int i, int j, int k) {
        int rem = 0;
        int count = 0;
        for (int m = i;m<=j ;m++) {
            int div = m;

            int final_rem = 0;
            while (div> 0) {
//            while (rem == 0)
                rem = div % 10;
                 div = div / 10;
                final_rem = final_rem * 10 + rem;
            }
           float find_avg = (m-final_rem);
            float divide = find_avg/k;
                float avg = divide;
                if (avg<0)
                {
                    avg = Math.abs(avg);
                }
            if (avg%1 == 0)
                {
                    count++;
                }
        }
       return count;

    }
}

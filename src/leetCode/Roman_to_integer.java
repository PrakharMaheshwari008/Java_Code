package leetCode;

public class Roman_to_integer {
    public static void main(String[] args) {
//        System.out.println(roman_to_integer1("LVIII"));

        System.out.println(result("LVIII"));
    }
    public static int roman_to_integer1(String str)
    {
//        mine _code *****************

        int asum = 0;
        for (int  i = 0 ;i< str.length()-1;i++)
        {
            if (str.charAt(i) == 'I') {
                asum = asum + 1;
                if (str.charAt(i+1) == 'V') {
                    asum = asum + 3;
                    i++;
                }
                else {

                }
            }
            else if (str.charAt(i) == 'V'){
            asum = asum + 5;
            }
            else if (str.charAt(i) == 'X'){
            asum = asum + 10;
            if (str.charAt(i+1) == 'L')
            {
                asum = asum + 30;
                i++;
            }
                else if (str.charAt(i+1) == 'C')
                {
                    asum = asum + 80;
                    i++;
                }
            }

            else if (str.charAt(i) == 'L'){
            asum = asum + 50;
            }
            else if (str.charAt(i) == 'C'){
            asum = asum + 100;
            if (str.charAt(i+1) == 'M')
            {
                asum = asum + 800;
                i++;
            }
            else if(str.charAt(i) == 'D')
            {
                asum = asum + 300;
                i++;
            }
            continue;
            }
            else if (str.charAt(i) == 'D'){
            asum = asum + 500;
            }
            else if (str.charAt(i) == 'M'){
            asum = asum + 1000;
            }

        }
        return asum;
    }

//  ***************************************************************************
    public static  int getvalue(char c)
    {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else return 1000;
    }

    public static int result(String str)
    {
        int res = 0;
        for (int i = 0 ; i< str.length()-1 ;i++)
        {
            int a = getvalue(str.charAt(i));
            int b = getvalue(str.charAt(i+1));

            if (a<b)
            {
                res -=a;
            }
            else {
                res +=a;
            }

        }
        res+= getvalue(str.charAt(str.length()-1));
        return res;
    }

}

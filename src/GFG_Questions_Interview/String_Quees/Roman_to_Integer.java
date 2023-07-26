package GFG_Questions_Interview.String_Quees;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String str = "CX";
        System.out.println(romanToDecimal(str));
    }

    //Real Approaches on gfg Solution problem
    public static int romanToDecimal(String str) {
        int i = 0;
        int count = 0;
        while(i <= str.length()-1){
            if(str.charAt(i) == 'I'){
                count+=1;
            }
            else if(str.charAt(i) == 'M'){
                count+=1000;
                if(i > 1 &&str.charAt(i-1) == 'C'){
                    count-=100;
                }
            }
            else  if(str.charAt(i) == 'D'){
                count+=500;
                if(i > 1 &&(str.charAt(i-1) == 'C')){
                    count-=100;
                }
            }
            else   if(str.charAt(i) == 'C'){
                count+=100;
                if(i > 1 &&str.charAt(i-1) == 'X'){
                    count-=10;
                }
            }
            else if(str.charAt(i) == 'L'){
                count+=50;
                if(i > 1 &&str.charAt(i-1) == 'X'){
                    count-=10;
                }
            }
            else if(i <= str.length()-1 && str.charAt(i) == 'X' && str.charAt(i+1) != 'C' && str.charAt(i+1) != 'L' ){
                count+=10;
                if(i > 1 &&str.charAt(i-1) == 'I'){
                    count-=1;
                }
            }
            else if(str.charAt(i) == 'V'){
                count+=5;
                if (i > 1 && (str.charAt(i-1) == 'I')){
                    count-=1;
                }
            }
            i++;

        }
        return count;
    }
}

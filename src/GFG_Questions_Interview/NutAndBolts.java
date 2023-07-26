package GFG_Questions_Interview;

import java.util.HashSet;
import java.util.Set;

public class NutAndBolts {
    public static void main(String[] args) {
      char  nuts[] = {'@', '%', '$', '#', '^'};
       char bolts[] = {'%', '@', '#', '$' ,'^'};
        matchPairs(nuts,bolts,9);
    }
    static void matchPairs(char nuts[], char bolts[], int n) {
        HashSet<Character> hash = new HashSet<>();
        char[] arr = {'!','#','$','%','&','*','@','^','~'};
        Set<Character> hash1 = new HashSet<>();
        Set<Character> hash2 = new HashSet<>();
        for(char i : nuts){
            hash1.add(i);
        }
        for(char i : bolts){
            hash2.add(i);
        }

        int j = 0;
        for(char ch : arr){
            if(hash1.contains(ch)){
                if(j<nuts.length){
                    System.out.print(ch+" ");

                }
                j++;
            }

        }
        System.out.println();
        int c = 0;
        for(char ch : arr){
            if(hash2.contains(ch)){
                if(c<bolts.length){
                    System.out.print(ch+" ");
                }
                c++;

            }
        }
    }
}

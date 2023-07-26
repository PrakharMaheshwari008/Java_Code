package leetCode;

public class Valid_anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s,String t){
        int[] freqS = getFreqMap(s);
        int[] freqT = getFreqMap(t);
        for(int i = 0;i<26;i++){
            if(freqS[i] != freqT[i]){
                return false;
            }
        }
        return true;
    }
    public static int[] getFreqMap(String str){
        int[] freq = new int[26];
        for(char c: str.toCharArray()){
            freq[c-'a']++;
        }
        return freq;
    }
}

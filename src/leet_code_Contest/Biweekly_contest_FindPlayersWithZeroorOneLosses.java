package leet_code_Contest;

import java.util.*;

public class Biweekly_contest_FindPlayersWithZeroorOneLosses {
    public static void main(String[] args) {

        int[][] match = {
                {1, 3}, {2, 3}, {3, 6},{5, 6},{4, 5}, {4, 8},{4, 9},{10, 4},{10, 9}, {5, 6}        };

        System.out.println(player12(match));

    }
    public static List<List<Integer>> player12(int[][] match)
    {
        List <List<Integer>> ans = new ArrayList<>();
        Set<Integer> allplayers = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> losers = new HashSet<>();
        Set<Integer> nonLosers = new HashSet<>();
        Set<Integer>  lostOnMatch = new HashSet<>();

        for (int[] match_temp:match){
            allplayers.add(match_temp[0]);
            allplayers.add(match_temp[1]);
            losers.add(match_temp[1]);

            int lostTime = map.getOrDefault(match[1],0);
            map.put(match_temp[1],lostTime+1);
        }
        for (Integer player:allplayers){
            if (!losers.contains(player)){
                nonLosers.add(player);}
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if (entry.getValue() == 1){
                lostOnMatch.add(entry.getKey());
            }
        }
        List<Integer> nonLoserList = new ArrayList<>(nonLosers);
        Collections.sort(nonLoserList);
        ans.add(new ArrayList<>(nonLoserList));
        List<Integer> lostonMatchList = new ArrayList<>(lostOnMatch);
        Collections.sort(lostonMatchList);
        ans.add(lostonMatchList);
        return ans;

    }
}

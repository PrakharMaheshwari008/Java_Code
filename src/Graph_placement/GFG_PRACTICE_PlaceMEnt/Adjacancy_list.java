package Graph_placement.GFG_PRACTICE_PlaceMEnt;

import java.util.ArrayList;

public class Adjacancy_list {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;
        System.out.println(printGraph(v,adj));
    }
    public static ArrayList<ArrayList<Integer>> printGraph(
            int V, ArrayList<ArrayList<Integer>> adj) {
        for(int i=0;i<V;i++){
            adj.get(i).add(0,i);
        }
        return adj;
    }
}

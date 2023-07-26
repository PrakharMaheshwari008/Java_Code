package Graph_placement.Graph_Riya_Bansal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Practice_BFS_DFS {
    public static void main(String[] args) {
        Practice_BFS_DFS graph = new Practice_BFS_DFS();
        graph.add_vertex("A");
        graph.add_vertex("B");
        graph.add_vertex("C");
        graph.add_vertex("D");
        graph.add_vertex("E");
        graph.add_vertex("F");
        graph.add_vertex("G");

        graph.add_Edge("A", "B",1);
        graph.add_Edge("A","D",10);
        graph.add_Edge("B","C",2);
        graph.add_Edge("C","D",3);
        graph.add_Edge("D","E",4);
        graph.add_Edge("E", "F",5);
        graph.add_Edge("E", "G",12);
        graph.add_Edge("F","G",4);
        graph.display();
        graph.dft();
    }
    private final HashMap<String, Vertex> vertices = new HashMap<>();
    private class Vertex{
        HashMap<String, Integer> neighbour = new HashMap<>();
    }
    public void add_vertex(String vname)
    {
        Vertex vtx = new Vertex();
        vertices.put(vname,vtx);
    }

    public void add_Edge(String Vname1, String Vname2, Integer Cost )
    {
        Vertex vtx1 = vertices.get(Vname1);
        Vertex vtx2 = vertices.get(Vname2);
        if (vtx1 == null || vtx2 == null || vtx1.neighbour.containsKey(vtx2))
        {
            return;
        }
        vtx1.neighbour.put(Vname2,Cost);
        vtx2.neighbour.put(Vname1,Cost);
    }
    public void display()
    {
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for(String key1 : keys){
            Vertex vtx = vertices.get(key1);
            String str = key1 + " --> " + vtx.neighbour;
            System.out.println(str);

        }
    }
//--------------------------------------------------------------------------------------------------------
    private class Pair{
        String name;
        Practice_BFS_DFS.Vertex vtx;
        String remaining_Vertex;
    }
    public void dft(){
        HashMap<String, Boolean> traversed = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>();

        ArrayList<String> key = new ArrayList<>(vertices.keySet());
        for (String keys : key)
        {
            if (traversed.containsKey(keys))
            {
                continue;
            }
            Pair sp = new Pair();
            sp.name = keys;
            sp.remaining_Vertex = keys;
            stack.addFirst(sp);
            while(!stack.isEmpty())
            {
                Pair rp = stack.removeFirst();
                if (traversed.containsKey(rp.name))
                {continue;
                }
                traversed.put(rp.name, true);
                Vertex rpVtx = vertices.get(rp.name);
                ArrayList<String> nbrs = new ArrayList<>(rpVtx.neighbour.keySet());
                for (String nbr : nbrs)
                {
                    if (!traversed.containsKey(nbr))
                    {
                        Pair np  = new Pair();
                        np.name = nbr;
                        np.remaining_Vertex = rp.remaining_Vertex + nbr;
                        stack.addFirst(np);
                    }
                }
                System.out.println(rp.name + " Via "+ rp.remaining_Vertex);

            }
        }
    }
}

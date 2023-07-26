package Graph_placement.Graph_Riya_Bansal;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph_Intro {
    public static void main(String[] args) {
     Graph_Intro graph = new Graph_Intro();
     graph.addVertex("A");
     graph.addVertex("B");
     graph.addVertex("C");
     graph.addVertex("D");
     graph.addVertex("E");
     graph.addVertex("F");
     graph.addVertex("G");

     graph.addEdge("A","B",1);
     graph.addEdge("A","D",10);
     graph.addEdge("B","C",12);
     graph.addEdge("D","E",3);
     graph.addEdge("E", "F",24);
     graph.addEdge("F","G",211);

     graph.display();
     }
//    representing the vertex we are going to use hashmap this used to store the neighbour
    private class Vertex {
        HashMap<String, Integer> ngbrs = new HashMap<>(); // ngbrs ==> neighbour
    }
    private HashMap<String, Vertex> vertices = new HashMap<>(); //String will be that value for the particular node

    public int numVertex(){                      // Auxiliary function   //
        return  vertices.size();
}

public void addVertex(String Vname) // we have to add the vertex to the graph we will make the
//        new vertex             !! Vname is the name of the vertex
{
    Vertex vtx = new Vertex();       //   new vertex which object is vtx...!! to use a class(Vertex) make an object vtx
    vertices.put(Vname, vtx);
}
public void addEdge(String Vname1, String Vname2, int cost) // two vertice 1 ist the Vname1 Vname2
{    Vertex vtx1 = vertices.get(Vname1);
    Vertex vtx2 = vertices.get(Vname2);
    if(vtx1 == null || vtx2 == null || vtx1.ngbrs.containsKey(Vname2)){
        return;
    }
    vtx1.ngbrs.put(Vname2, cost);
    vtx2.ngbrs.put(Vname1, cost);
}
public void display()
{
    System.out.println("______________________________");
ArrayList<String>keys  = new ArrayList<>(vertices.keySet());
for(String key: keys)
{
    Vertex vtx = vertices.get(key);
    String str = key+" --> " +vtx.ngbrs;
    System.out.println(str);
}
    System.out.println("_______________________________");
}

}

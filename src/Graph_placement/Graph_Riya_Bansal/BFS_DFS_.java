package Graph_placement.Graph_Riya_Bansal;
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;


public class BFS_DFS_ {
     public static void main(String[] args) {
        BFS_DFS_ graph = new BFS_DFS_();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "D", 10);
        graph.addEdge("B", "C", 2);
        graph.addEdge("C", "D", 3);
        graph.addEdge("D",  "E", 4);
        graph.addEdge("E", " F", 5);
        graph.addEdge("E", "G", 12);
        graph.addEdge("F", "G", 4);

//        graph.display();
        System.out.println("___________**DFS_Traversal**_____________");
        graph.dft();
         System.out.println("_____________**BFS_Traversal**_____________");
         graph.bft();
    }
    // -------------------------------------------------------------------------

    //            this Scenario is used to store the value of Main vertex in another hashMap  --> <-
    private HashMap<String, Vertex> vertices = new HashMap<>(); // String is their vertex and (Vertex)  is their neighbour
//------------------------------------------------------------------------------------------------
//    private int numvertex() // to define the size of the vertices
//    {
//        return vertices.size();
//    }
//------------------------------------------------------------------------------------------------
//  for representing the vertex we are going to use hashmap to store the value of the neighbour
private class Vertex {
    //neighbours
    HashMap<String, Integer> ngbrs = new HashMap<>(); // ngbrs ==> neighbour
}
    public void addVertex(String vname) { // this scenario is used add the value of the vertex as can the weight;
        Vertex vtx = new Vertex(); // this is the object through which we will add the as the vertex
        vertices.put(vname, vtx); // add the value in the vertex:
    }
    public void addEdge(String vname1, String vname2, int cost) // cost is just a weight
    {
        Vertex vtx1 = vertices.get(vname1); //we try to operate the value through vertices method and get the name -1
        Vertex vtx2 = vertices.get(vname2);
        // same as above and get value name2
        // if one of the node is null or if the node are already connected

        if (vtx1 == null || vtx2 == null || vtx1.ngbrs.containsKey(vname2)) {
            return;
        }
        vtx1.ngbrs.put(vname2, cost);
        vtx2.ngbrs.put(vname1, cost);
    }
    public void removeEdge() {

    } // I will complete function further
    public void display() {
        System.out.println("___________________________________");
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for (String key: keys) {
            Vertex vtx = vertices.get(key);
            String str = key + " --> " + vtx.ngbrs;
            System.out.println(str);
        }
    }
    private class Pair {     // this is for set the variable name as :- Name, vtx, Psf
        String name;
        Vertex vtx;
        // this is the path so far
        String Remaining_Vertex;
    }
public  void dft(){
        // contain information about nodes that have been traversed!!!
    HashMap<String, Boolean> traversed = new HashMap<>();
        LinkedList<Pair> stack = new LinkedList<>(); //implement stack using linked list
        ArrayList<String> keys = new ArrayList<>(vertices.keySet());
        for (String key1: keys) {
            if(traversed.containsKey(key1)){
            continue;
            }
        // create a new pair
    Pair sp = new Pair(); // this is the object create to class call
    sp.name = key1;
    sp.Remaining_Vertex = key1;
    stack.addFirst(sp);
    while(!stack.isEmpty()){
        Pair rp = stack.removeFirst();
        if (traversed.containsKey(rp.name))
        {
            continue;
        }
        // processed true
        traversed.put(rp.name,true);
        // print the node
        System.out.println(rp.name + " via "+ rp.Remaining_Vertex);
        Vertex rpvtx = vertices.get(rp.name);
        // getting the neighbour of the current node...
        ArrayList<String> nbrs = new ArrayList<>(rpvtx.ngbrs.keySet());

        for (String nbr : nbrs)
        {
            if (!traversed.containsKey(nbr))
            {
                Pair np = new Pair();
                np.name = nbr;
//                np.vtx = vertices.get(nbr);
                np.Remaining_Vertex = rp.Remaining_Vertex + nbr;
                stack.addFirst(np);
            }
        }
    }

    }
    }
//-------------------------------------------------------------------------------------
public void bft(){
        HashMap<String, Boolean> traverse_Element = new HashMap<>(); // this is for storing the traversed element
    // Implement the queue using the linked_list
        LinkedList<Pair> queue  =  new LinkedList<>(); // from above Pair method Store the value in that format
    ArrayList<String> keys = new ArrayList<>(vertices.keySet()); // for storing all the values i.e. key(String) A, B, C
    for(String element_keys: keys)
    {
        if(traverse_Element.containsKey(element_keys))
        {
            continue;
        }
        // 1. Make a pair and put it in queue
        Pair pair_ing_Class = new Pair();
        pair_ing_Class.name = element_keys;
        pair_ing_Class.Remaining_Vertex = element_keys;
        pair_ing_Class.vtx = vertices.get(element_keys);
        queue.addLast(pair_ing_Class);
//        2. queue is mot empty do some work
        while (!queue.isEmpty())
        {                   // psf is just like a resulting_element or remaining_element
            // 2.1 remove a pair..
            Pair first_remove_pair = queue.removeFirst();
            if (!traverse_Element.containsKey(first_remove_pair.name)){
                // 2.2 processed true
                traverse_Element.put(first_remove_pair.name, true);
//                2.3 ,,, printing the result
                System.out.println(first_remove_pair.name + " --> " + first_remove_pair.Remaining_Vertex);
//                2.4 get neighbour
                Vertex rpvtx = vertices.get(first_remove_pair.name);
                ArrayList<String> ndrs = new ArrayList<>(rpvtx.ngbrs.keySet());
                // loop on the neighbour
                for (String nbr : ndrs)
                {
                    if (!traverse_Element.containsKey(nbr))
                    {
                        Pair np = new Pair();
                        np.name = nbr;
                        np.vtx  = vertices.get(nbr);
                        np.Remaining_Vertex = first_remove_pair.Remaining_Vertex + nbr;
                        queue.addLast(np);
                        }
                    }
                }
            }
        }
    }
}
package Graph_placement.Graph_Anuj_Bhaiya;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// In case of Dfs
public class Graph_Anuj_DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number od vertices and edges");
        int v = sc.nextInt(); // vertices are initialized by the user
        int e = sc.nextInt(); // edge is also initialized by the user
        Graph_Anuj_BFS Graph = new Graph_Anuj_BFS(v); // constructor call … for vertices
        System.out.println("Enter " + e + " Edges"); // getting the edge
        for (int i = 0; i < e; i++) {                        // what is edge... !! edge is just like for joining two vertices // Source is just like one vertex and destination is just like another vertices and join together
            int source = sc.nextInt();
            int destination = sc.nextInt();
            Graph.addEdge(source, destination); // this method is for call the  AddEdge…
        }
        System.out.println("Enter source and destination");
        int source = sc.nextInt();
        int destination = sc.nextInt();
        Graph_Anuj_DFS graph = new Graph_Anuj_DFS(v);
        System.out.println("Possible " + graph.dfsStack(source,destination));
    }
    private final LinkedList<Integer>[] adj; // we are using array for storing the value ... can say array ka LinkedList
    public Graph_Anuj_DFS(int v) // this the constructor through we can know how much
    // vertex is passed
    {
        adj = new LinkedList[v];// upper adjacency linked_list is initializing
        for(int i = 0 ; i<v; i++)
        {
            adj[i] = new LinkedList<Integer>();  // this for storing the value of vertices in the LinkedList
        }
    }
    public void addEdge(int source, int destination) {
        adj[source].add(destination); // this will help us to join the to vertices togethers from starting node to the end node and find the minimum path
        adj[destination].add(source); // this will help us to join the vertices togethers
        //same as above  but is one another task is to check is the destination element is matched with source element
    }
    private boolean DfSUtil(int source, int destination, boolean[] Isvisit) { // this  the function for DFS as source , destination, IsVisit

        // In case of recursive function first be handled the base conditions ...
        if(source == destination) return true; // if our source and destination is equal then we reached destination...!!
        for (int neighbour : adj[source])
        {
            if (!Isvisit[neighbour])
            {
              Isvisit[neighbour] = true;
              boolean isConnect = DfSUtil(source, destination,Isvisit); // recursive call
              if(isConnect) return true;
            }
        }
        return false;
    }
    public boolean dfs(int source, int destination)
    {
        boolean[] isVisit = new boolean[adj.length];
        isVisit[source] = true;
        return DfSUtil(source, destination, isVisit);
    }
    public boolean dfsStack(int source, int destination)
    {
        boolean[] IsVisiting = new boolean[adj.length];
        IsVisiting[source] = true;
        Stack<Integer> stack = new Stack<>();

        stack.push(source);
        while(!stack.isEmpty())
        {
            int cur = stack.pop();
            if (cur == destination) return true;

            for (int neighbor : adj[cur]){
                if (!IsVisiting[neighbor]){
                    IsVisiting[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return false;
    }

}

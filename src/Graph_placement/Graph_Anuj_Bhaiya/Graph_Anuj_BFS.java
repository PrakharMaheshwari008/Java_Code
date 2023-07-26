package Graph_placement.Graph_Anuj_Bhaiya;
// BFS
// One of the peculiarity(Specialty)
import java.util.LinkedList;
        import java.util.Queue;
import java.util.Scanner;

public class Graph_Anuj_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number od vertices and edges");
        int v = sc.nextInt(); // vertices are initialized by the user
        int e = sc.nextInt(); // edge is also initialized by the user
        Graph_Anuj_BFS Graph = new Graph_Anuj_BFS(v); // constructor call … for vertices
        System.out.println("Enter " + e + " Edges"); // getting the edge
        for (int i = 0; i < e; i++) {                        // what is edge... !! edge is just like for joining two vertices
            // Source is just like one vertex and destination is just like another vertices
            // and join together
            int source = sc.nextInt(); //
            int destination = sc.nextInt();

            Graph.addEdge(source, destination); // this method is for call the  AddEdge…
        }
        System.out.println("Enter source and destination");
        int source = sc.nextInt();
        int destination = sc.nextInt();
        int distance = Graph.bfs(source,destination);
        System.out.println("min distance" + distance);
        sc.close();
    }


    private LinkedList<Integer> adj[]; // we are using array for storing the value ... can say array ka LinkedList

    public Graph_Anuj_BFS(int v) // this the constructor through we can know how much
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
    public int bfs(int source, int destination) {
        boolean Isvisit[] = new boolean[adj.length]; // created due to check is the node or vertices is Visited or Not Basically we are storing the those values those are visited...!!
        int parent[] = new int[adj.length];// created due to main or first element as a main or parent
        Queue<Integer> q = new LinkedList<>(); //implementing queue using linked_list
        q.add(source);
        parent[source] = -1;
        Isvisit[source] = true;// for visited element could not return in queue
        while (!q.isEmpty()) {
            int cur = q.poll(); // this used to pull the front element and name as a current element
            if (cur == destination) // current element is the destination element ... then break because no mean to move forward ..
            {
                break; // break
            }
            for (int nighbour : adj[cur]) {// this mean earlier current traverse their neighbour's element through adj[cur] . stored into neighbour ... || neighbours is being through linked list
                if (!Isvisit[nighbour]) { // line means if the neighbour not visited the put is into queue ..
                    Isvisit[nighbour] = true; // visited neighbour couldn't be revisited
                    q.add(nighbour);
                    parent[nighbour] = cur;
                }
            }
        }
        int cur = destination;
        int distance = 0;
        while (parent[cur] != -1) {
            System.out.print(cur + " --> ");
            cur = parent[cur];
            distance++;
        }
        return distance;
    }

}

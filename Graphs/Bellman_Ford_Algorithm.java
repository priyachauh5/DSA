//  //METHOD- 1
// import java.util.*;

// public class Bellman_Ford_Algorithm{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s, int d, int w){
//             this.src=s;
//             this.dest=d;
//             this.wt=w;
//         }
//     }

//     // Edge[]
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 2, -4));

//         graph[2].add(new Edge(2, 3, 2));

//         graph[3].add(new Edge(3, 4, 4));

//         graph[4].add(new Edge(4, 1, -1));
//     }


//     public static void bellmanFord(ArrayList<Edge> graph[], int src){
//         int dist[]=new int[graph.length];
//         for(int i=0; i<dist.length; i++){
//             if(i!=src){
//                 dist[i]=Integer.MAX_VALUE;
//             }
//         }
//         //O(V*E)
//         //algo-O(V)
//         int V=graph.length;
//         for(int i=0; i<V-1; i++){ //find vertices
//             //edges-O(E)
//             for(int j=0; j<graph.length; j++){ //find edge
//                 for(int k=0; k<graph[j].size(); k++){
//                     Edge e=graph[j].get(k);
//                     //u, v, wt
//                     int u=e.src;
//                     int v=e.dest;
//                     int wt=e.wt;
//                     //relaxation
//                     if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
//                         dist[v]=dist[u]+wt;
//                     }
//                 }
//             }
//         }
//         //print
//         for(int i=0; i<dist.length; i++){
//             System.out.print(dist[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         int V=5;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> graph[]=new ArrayList[V];
//         createGraph(graph);
//         // ArrayList<Edge> edges=new ArrayList<>();
//         // createGraph2(edges);
//         bellmanFord(graph, 0);
//     }
// }

//METHOD-2

import java.util.*;

public class Bellman_Ford_Algorithm {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Create the list of edges
    static void createGraph2(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    // Bellman-Ford Algorithm
    public static void bellmanFord(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (Edge e : graph) {
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        // Check for negative weight cycles
        for (Edge e : graph) {
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                System.out.println("Negative weight cycle detected!");
                return;
            }
        }

        // Print result
        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph2(graph);
        bellmanFord(graph, 0, V);
    }
}

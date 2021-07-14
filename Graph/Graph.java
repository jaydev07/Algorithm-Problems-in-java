import java.util.*;
import java.util.LinkedList;

public class Graph {
	ArrayList<ArrayList<Integer>> graph;
	int V;
	
	Graph(int nodes){
		V=nodes;
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	
	void addEdge(int v,int u) {
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
	void printGraph() {
		for(int i=0;i<V;i++) {
			System.out.printf("\n Node %d: ",i);
			for(int x:graph.get(i)) {
				System.out.print(" -> "+ x);
			}
		}
	}
	
	void dfsUtil(int node,boolean visited[]) {
		visited[node]=true;
		System.out.printf(" %d ",node);
		for(int x:graph.get(node)) {
			if(visited[x]==false) {
				dfsUtil(x,visited);
			}
		}
	}
	
	void DFS(int start) {
		boolean visited[]=new boolean[V];
		System.out.println("\nDFS traversal is:");
		dfsUtil(start,visited);
	}
	
	void BFS(int start) {
		boolean visited[]=new boolean[V];
		Queue<Integer> q=new LinkedList<Integer>();
		System.out.println("BFS Traversal: ");
		visited[start]=true;
		q.add(start);
		while(q.isEmpty()==false) {
			int node=q.poll();
			System.out.print(node + " ");
			for(int x:graph.get(node)) {
				if(visited[x]==false) {
					visited[x]=true;
					q.add(x);
				}
			}
		}
	}
}

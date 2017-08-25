package graphs.AdjacencyList;

import java.util.*;

public class AdjacencyListImpl {
	Graph g;
	
	public AdjacencyListImpl(int nVert) {
		g = new Graph(nVert);
	}
	
	public void addEdge(int from, int to){
		g.addEdge(from, to);
	}
	
	/*public void displayGraph(){
		List<Integer> ver = g.getAllVertex();
		LinkedListImpl edges[] = g.getAllEdges();
		
		for(int i = 0 ; i < g.getNoVertex() ; i++){
			System.out.println("Vertex: " + ver.get(i));
			System.out.println("Edges with: \n");
			ListNode tmp = edges[i].getHead();
			while(tmp != null){
				System.out.println(tmp.getData());
				tmp = tmp.getNext();
			}
			System.out.println();
		}
	}*/
	
	public void displayGraph(){
		Map<Integer, List<Integer>> list = g.getAllGraph();
		Iterator itr = list.entrySet().iterator();
		
		Map.Entry<Integer,List<Integer>> me = null ;
		
		while(itr.hasNext()){
			me = (Map.Entry)itr.next();
			
			System.out.println("Vertex: "+ me.getKey());
			System.out.println("Edges For: "+ me.getValue());
		}
	}
}

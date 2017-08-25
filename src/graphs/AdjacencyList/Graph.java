package graphs.AdjacencyList;

import java.util.*;

public class Graph {
	Map<Integer, List<Integer>> list;
	private int noVertices;
	
	Graph(int nVert){
		list = new HashMap<Integer, List<Integer>>();
		
		for(int i = 0 ; i < nVert ; i++){
			list.put(i, new ArrayList<Integer>());
		}
	}
	
	public int getNoVertex() {
		return noVertices;
	}
	
	public Map<Integer, List<Integer>> getAllGraph(){
		return list;
	}
	
	public void addEdge(int from, int to) {
		List<Integer> i = list.get(from);
		List<Integer> j = list.get(to);
		
		if(i != null && j != null){
			if(!i.contains(to)){
				i.add(to);
			}
			
			if(!j.contains(from)){
				j.add(from);
			}
		}
	}
}

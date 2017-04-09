package graphs.AdjacencyList;

import java.util.*;

import linkedList.SinglyLinedList.LinkedListImpl;
import linkedList.SinglyLinedList.ListNode;

public class Graph1 {
	private ArrayList<Integer> vertices;
	private LinkedListImpl edges[];
	private int noVertices;
	
	Graph1(int nVert){
		noVertices = nVert;
		vertices = new ArrayList<>();
		edges = new LinkedListImpl[noVertices];
		
		for(int i = 0 ; i < noVertices ; i++){
			vertices.add(i);
			edges[i] = new LinkedListImpl();
		}
	}
	
	public int getNoVertex() {
		return noVertices;
	}
	
	public List<Integer> getAllVertex() {
		return vertices;
	}
	
	public LinkedListImpl[] getAllEdges() {
		return edges;
	}

	public void addEdge(int from, int to) {
		int i = vertices.indexOf(from);
		int j = vertices.indexOf(to);
		
		if(i != -1 && j != -1){
			edges[i].insertAtBeg(new ListNode(to));
			
			if(i !=j){
				edges[j].insertAtBeg(new ListNode(from));
			}
		}
	}
}

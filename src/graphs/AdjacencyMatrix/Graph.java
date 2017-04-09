package graphs.AdjacencyMatrix;

public class Graph {
	private boolean g[][];
	private int noVertices;
	
	Graph(int nVert){
		noVertices = nVert;
		g = new boolean[noVertices][noVertices];
	}
	
	public int getNoVertex() {
		return noVertices;
	}

	public boolean getG(int from, int to) {
		return g[from][to];
	}
	
	public boolean[][] getCompleteG() {
		return g;
	}

	public void setG(int from, int to,boolean val) { // val is whether we want to attach or remove the edge
		g[from][to] = val;
		g[to][from] = val;
	}
}

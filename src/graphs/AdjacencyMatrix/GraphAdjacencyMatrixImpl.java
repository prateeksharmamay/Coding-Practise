package graphs.AdjacencyMatrix;

public class GraphAdjacencyMatrixImpl {
	Graph g;
	
	public GraphAdjacencyMatrixImpl(int nVert) {
		g = new Graph(nVert);
	}
	
	public void addEdge(int from, int to){
		if(from >= 0 && from < g.getNoVertex() && to >= 0 && to < g.getNoVertex()){
			g.setG(from, to, true);
		}
	}
	
	public void removeEdge(int from, int to){
		if(from >= 0 && from < g.getNoVertex() && to >= 0 && to < g.getNoVertex()){
			g.setG(from, to, false);
		}
	}
	
	public boolean isEdge(int from, int to){
		if(from >= 0 && from < g.getNoVertex() && to >= 0 && to < g.getNoVertex()){
			return g.getG(from, to);
		}
		return false;
	}
	
	public void displayGraph(){
		boolean graph[][] = g.getCompleteG(); 
		for(int i = 0 ; i < g.getNoVertex() ; i++){
			for(int j = 0 ; j < g.getNoVertex() ; j++){
				System.out.print(graph[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

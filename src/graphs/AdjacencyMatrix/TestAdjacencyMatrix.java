package graphs.AdjacencyMatrix;

public class TestAdjacencyMatrix {

	public static void main(String[] args) {
		GraphAdjacencyMatrixImpl g = new GraphAdjacencyMatrixImpl(4);
		g.displayGraph();
		System.out.println("\n");
		
		g.addEdge(0, 3);
		
		g.addEdge(1, 2);
		
		g.addEdge(2, 3);
		
		g.addEdge(3, 1);
		
		g.displayGraph();
		System.out.println("\n");
		
		g.removeEdge(1, 2);
		
		g.displayGraph();
		System.out.println("\n");
	}

}

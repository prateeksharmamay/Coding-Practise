package graphs.AdjacencyList;

public class TestAdjacencyList {
	public static void main(String a[]){
		AdjacencyListImpl g = new AdjacencyListImpl(5);
		
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(0, 0);
		g.addEdge(0, 0);
		g.displayGraph();
	}
}

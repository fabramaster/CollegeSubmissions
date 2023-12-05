package lab10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
//Name: Alexander Ross
//Student Number: 300213662	

public class Solution {

	public static void main(String[] args) {
		Graph[] g = new Graph[7];
		g[0] = readGraph("small1");
		g[1] = readGraph("small2");
		g[2] = readGraph("small2");
		g[3] = readGraph("medium1");
		g[4] = readGraph("medium2");
		g[5] = readGraph("medium3");
		g[6] = readGraph("medium4");
		System.out.println(g[0]);

		for (int i=0; i<7; i++)
			System.out.println(isEulerian(g[i]));
	}
	static boolean isEulerian(Graph graph) {
		return isConnected(graph) && has0or2oddDegrees(graph);
	}
	static boolean isConnected(Graph graph) {
		ArrayList<String>visted= new ArrayList<>(); 
		LinkedList<String> queue = new LinkedList<>(); 
		String randomStartingLine=graph.getSomeVertex(); 
		queue.add(randomStartingLine); 
		visted.add(randomStartingLine); 
		while(queue.size()!=0){  
			String poll=queue.poll();
			ArrayList<String>neighbour=graph.getNbrs(poll);
			for (String neigh:neighbour) {
				if(!(visted.contains(neigh))) {
					visted.add(neigh);
					queue.add(neigh);
				}
			}
		}
		if(visted.size()==graph.getNumVertices()){
			return true;
		}
		//DONE: complete this
		return false;
	}
	static boolean has0or2oddDegrees(Graph graph) {
		ArrayList<Integer>degreeAtEachPoint= new ArrayList<>();
		int oddDegreeCounter=0; 
		for (String vertex:graph.getAllVertices()) {
			degreeAtEachPoint.add(graph.degree(vertex));
		}
		for (Integer Degrees: degreeAtEachPoint) {
			if(Degrees%2!=0){ 
				oddDegreeCounter+=1; 
			}
		}
		if(oddDegreeCounter==2 || oddDegreeCounter==0){
			return true;
		}
		//DONE: complete this
		return false;
	}
	/**
	 * This function reads a list of edges from a given filename
	 * and returns a simple Graph.
	 * DO NOT EDIT THIS METHOD.
	 * @param filename
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Graph readGraph(String filename) {

		FileReader f = null;
		try {
			f = new FileReader(filename);
		} catch (FileNotFoundException e) {
			System.err.println("Cannot find file: " + filename);
			System.err.println("This can probably be fixed by dragging your data files onto your Eclipse Project (not src folder)");
			e.printStackTrace();
		}

		Scanner sc = new Scanner(f);

		Graph g = new Graph();
		while (sc.hasNext()) {
			String u = sc.next();
			String v = sc.next();
			g.add(u);
			g.add(v);
			g.add(u,v);
		}
		sc.close();
		return g;
	}
}

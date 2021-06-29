package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Graph {
  List<List<Character>> graph;
  boolean visited[];
  
  Graph(int nodes) {
    graph = new ArrayList<>(128);
    visited = new boolean[128];
    
    for(int i = 0; i < 128; i++) {
      graph.add(i, new ArrayList<>());
    }
  }
  
  public void addEdge(Character a, Character b) {
    graph.get((int)a).add(b);
    graph.get((int)b).add(a);
  }

  public int minimumDistanceBetweenTwoNodes(Character source, Character destination) {
    if(source == destination) {
      return 0;
    }
    
    Queue<Character> queue = new LinkedList<>();
    int minDistance = 0;
    
    queue.add(source);
    visited = new boolean[128];
    visited[source] = true;
    
    
    while(!queue.isEmpty()) {
      int size = queue.size();
      
      while(size > 0) {
    	  Character node = queue.poll();
        
        List<Character> childList = graph.get(node);
        
        for(Character child: childList) {
          if(child == destination) {
            return ++minDistance;
          }
          if(!visited[child]) {
            queue.add(child);
            visited[child] = true;  
          }
        }
        
        size--;
      }
      
      minDistance++;
    }
    
    return -1;
  }
 
}

public class GraphProblems {

  public static void main(String[] args) {
    
    String s = "A,B;B,C;A,C;B,D;C,D;D,E;F,G;G,H;F,H";
    
    String [] val = s.split(";");
    Character source = 'A';
    Graph a = new Graph(val.length);
    Set<Character> set = new TreeSet<Character>();
    for (String string : val) {
		a.addEdge(string.split(",")[0].charAt(0),string.split(",")[1].charAt(0));
		set.add(string.split(",")[0].charAt(0));
		set.add(string.split(",")[1].charAt(0));
	}
    
    set.remove(source);
    for (Character character : set) {
    	int dis = a.minimumDistanceBetweenTwoNodes(source, character);
    	System.out.println(character+" "+(dis==-1?"INF":dis));
	}
  }
}
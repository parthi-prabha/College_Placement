package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class listgraph{
    int vertices;
    boolean[] visit;
    ArrayList<ArrayList<Integer>> s1;
    listgraph(int v){
        vertices = v;
        visit = new boolean[v];
        s1 = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            s1.add(new ArrayList<>());
        }
    }

    void addegde(int s, int d){
        s1.get(s).add(d);
        s1.get(d).add(s);
    }

    // Needs to delete the from the list not the entire list. so use Integer.valueOf() to delete the particular value
    void removeegde(int s, int d){
        s1.get(s).remove(Integer.valueOf(d));
        s1.get(d).remove(Integer.valueOf(s));
    }

    boolean hasedge(int s, int d){
        return s1.get(s).contains(d);
    }

    void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[s1.size()];
        q.add(start);
        visited[start] = true;
        while ((!q.isEmpty())){
            int curr = q.poll();
            System.out.print(curr + " ");
            for(int val : s1.get(curr)){
                if(!visited[val]){
                    visited[val] = true;
                    q.add(val);
                }
            }
        }
    }

    void dfs(int start){
        visit[start] = true;
        System.out.print(start + " ");
        for (int val : s1.get(start)){
            if(!visit[val]){
                dfs(val);
            }
        }
    }

    void display(){
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ->");
            for (int val : s1.get(i)){
                System.out.print(val + " ->");
            }
            System.out.println();
        }
    }
}

public class UsingList {
    public static void main(String[] args) {
        listgraph s1 = new listgraph(5);
        s1.addegde(1, 2);
        s1.addegde(1, 3);
        s1.addegde(2, 3);
        s1.addegde(4, 2);

        s1.display();
        s1.dfs(1);

    }
}

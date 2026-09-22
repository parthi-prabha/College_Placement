package graph;

public class Graph {
    static class Adigraph {
        int mat[][];
        int vertices;
        Adigraph(int v){
            vertices = v;
            mat = new int[vertices][vertices];
        }

        void addedge(int s, int d) {
            mat[s][d] = 1;
            mat[d][s] = 1;
        }

        void deledge(int s, int d){
            mat[s][d] = 0;
            mat[d][s] = 0;
        }

        void valid(int s, int d){
            if(mat[s][d] == 1){
                System.out.println("Edge present ");
                return;
            }
            System.out.println("Edge not presented");
        }

        void display(){
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }



    }

    public static void main(String[] args) {
        Adigraph s1 = new Adigraph(5);
        s1.addedge(0, 1);
        s1.addedge(1, 2);
        s1.addedge(0, 2);
        s1.addedge(4, 1);
        s1.addedge(4, 0);
        s1.display();
        System.out.println();
        s1.deledge(4, 1);
        s1.display();
    }


}

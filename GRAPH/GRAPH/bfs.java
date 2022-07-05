package GRAPH;

import java.util.ArrayList;
 class bfs{
    public static void main(String[] args) {
        int n = 5; 
        int m =5;
        //adjacency matrix way from line 11 -17
        int pgg[][] = new int[n+1][n+1];
        pgg[1][2]=1;//edge 1--2
        pgg[2][1]=1;
        pgg[2][3]=1;//edge 2--3
        pgg[3][2]=1;
        pgg[3][1]=1;//edgle 1--3
        pgg[1][3]=1;
        //adjacency list way of representaion of graph 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i =0; i<=n;i++){
            adj.add(new ArrayList<Integer>());
            adj.get(1).add(2);
            adj.get(2).add(3);
            adj.get(1).add(3);
            adj.get(2).add(5);
            adj.get(3).add(4);
            adj.get(5).add(4);

        }
        for(int j =1;j<n;j++){
            for(int z=0;z<adj.get(j).size();z++){
            System.out.print(adj.get(j).get(z)+" ");
        }
        System.out.println();
    }

    }
 }
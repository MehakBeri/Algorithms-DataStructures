/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Mehak Beri
 */
public class graphs {
    int n;
    LinkedList<Integer> adj[];
    
    graphs(int v)
    {
        n=v;
        adj = new LinkedList[v];
        for(int i=0; i<v;i++)
        {
            adj[i]=new LinkedList();
        }
    }
    void addEdge(int i, int j)
    {
        adj[i].add(j);
    }
    void dfs()
    {
        //sSystem.out.println(adj[2]);
        boolean[] visited= new boolean[n];
        for(int it=0; it<n;it++)
        {
            if(visited[it]==false)
            {
                DFS(it,visited);
            }
        }
        
    }
    void DFS(int v, boolean[] visited)
    {
        visited[v]=true;
        System.out.print(v+" ");
        Iterator<Integer> i= adj[v].iterator();
        while(i.hasNext())
        {
            int a= i.next();
            if(!visited[a])
            {
                DFS(a,visited);
            
            }
        }
        
    }
    
    void BFS(int s)
    {
        LinkedList<Integer> queue= new LinkedList<Integer>();
        boolean[] vis= new boolean[n];
        int iter=0;
        vis[s]=true;
        queue.add(s);
        
        while(queue.size()!=0)
        {
            int dequeue= queue.poll();
            System.out.print(dequeue+" ");
            Iterator<Integer> o= adj[dequeue].iterator();
            while(o.hasNext())
            {
                int t= o.next();
                if(!vis[t])
                {
                    vis[t]=true;
                    queue.add(t);
                }
                
            }
        }
    }
    
     public static void main(String args[])
    {
        graphs g = new graphs(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        g.dfs();
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
    
}

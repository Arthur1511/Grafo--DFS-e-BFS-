/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import sun.misc.Queue;

/**
 *
 * @author Arthur
 */
public class Busca {
 
    public static void  DFS(Grafo G, Vertice v){
    
        v.setVisitado(true);
                
        for ( Vertice w: v.getAdjacentes()) {
            
            if(!w.isVisitado()){
            
                w.setVisitado(true);
                Busca.DFS(G, G.buscaVertice(w));
                System.out.print(w.getNome());
                System.out.print(" -> ");
            }
        }
    }
    
    public static void BFS(Grafo G, Vertice v) throws InterruptedException{
    
        Queue Q = new Queue();
        
        v.setVisitado(true);
        Q.enqueue(v);
        
        while(!Q.isEmpty()){
        
            v = (Vertice)Q.dequeue();
            
            System.out.print(v.getNome());
            System.out.print(" -> ");
            
            
            
            for (Vertice w : v.getAdjacentes()) {
                if(!w.isVisitado()){
                    w.setVisitado(true);
                    Q.enqueue(G.buscaVertice(w));
                    int aux = 0;
                    for (Vertice ver : v.getAdjacentes()) {
                        if(ver.isVisitado())
                            aux++;
                        if(aux == v.getAdjacentes().size())
                            System.out.println("");
            }
                }
            }
            
        }
    }
}

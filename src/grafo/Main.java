/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        // TODO code application logic here
        
        Scanner in = new Scanner(new File("dados.txt"),"UTF-8");
        //BufferedReader br = new BufferedReader(new FileReader("dgfdgf.txt"));
        
        int numGrafos = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < numGrafos; i++) {
        
            Grafo G = new Grafo(in);
             //System.out.println(G.toString());
            
           //Busca.DFS(G, G.getVertices().get(0));
           //System.out.println("FIM");
            Busca.BFS(G,G.getVertices().get(0));
            System.out.println("FIM");
        }
        
       
    }
    
}

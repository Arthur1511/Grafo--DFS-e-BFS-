/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Arthur
 */
public class Grafo {
    
    private ArrayList<Vertice> vertices = new ArrayList<>();

    
    public Grafo(Scanner in) {
        
        // Leitura do numero de vertices
        int numVertices = Integer.parseInt(in.nextLine());
        
        //Criação de vertice
        for (int i = 0; i < numVertices; i++) {
            
            Vertice v = new Vertice();
            
            //Leitura do vertice e seus adjacentes
            String adjacencia = in.nextLine();
            adjacencia = adjacencia.replace(" ", "");
            
            //System.out.println(adjacencia);
            //System.out.println(adjacencia.length());
            //Integer b = adjacencia.charAt(0)-'0';
            //System.out.println(b);
            
            //Setando o nome do vertice que esta sendo criado
            v.setNome(adjacencia.charAt(0));
            
            //Criando array de vertices adjacentes
            ArrayList<Vertice> verticesAdj = new ArrayList<>();
            
            for (int j = 1; j < adjacencia.length(); j++) {

                verticesAdj.add(new Vertice(adjacencia.charAt(j)));
            }
            
            //Setando o array de adjacentes no vertice "v" criado
            v.setAdjacentes(verticesAdj);
            
            //Adicionando o vertice "v" criado ao grafo
            this.vertices.add(v);
        }
        
        
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public Vertice buscaVertice(Vertice v){
    
        for (Vertice vertice : vertices) {
            if(v.getNome() == vertice.getNome())
                return vertice;
        }
        return null;
    }
    
}

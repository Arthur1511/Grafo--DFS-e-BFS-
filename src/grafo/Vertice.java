/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Vertice {
    
        private char nome;
        private ArrayList<Vertice> adjacentes;
        private boolean visitado;

        public Vertice() {
            this.visitado = false;
        }

        public Vertice(char nome) {
            this.nome = nome;
            this.visitado = false;
        }
        public Vertice(char nome, ArrayList<Vertice> adjacentes) {
            this.nome = nome;
            this.adjacentes = adjacentes;
        }

        
        public char getNome() {
            return nome;
        }

        public void setNome(char nome) {
            this.nome = nome;
        }

        public ArrayList<Vertice> getAdjacentes() {
            return adjacentes;
        }

        public void setAdjacentes(ArrayList<Vertice> adjacentes) {
            this.adjacentes = adjacentes;
        }

        public boolean isVisitado() {
            return visitado;
        }

        public void setVisitado(boolean visitado) {
            this.visitado = visitado;
        }

        @Override
        public String toString() {
            return "Vertice{" + "nome=" + nome + ", adjacentes=" + adjacentes.toString() + '}';
        }
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.pilhas;

/**
 *
 * @author otaku
 */

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade){
        this.capacidade=capacidade;
        this.topo=-1;
        this.dados=new int[this.capacidade];

    }

    public void Inserir(int dados){
        if(Cheia()==0){
            this.topo++;
            this.dados[topo]=dados;
            System.out.println("Inserido");
        }
        else{
            System.out.println("Não Inserido");
        }
    }
    public int Cheia(){
        if(this.topo==this.capacidade){
            System.out.println("A Pilha está cheia");
            return 1;
        }
        else{
            System.out.println("A Pilha não está cheia");
            return 0;
        }
    }
    public int Vazia(){
        if(this.topo==-1){
            System.out.println("A Pilha está vazia");
            return 1;
        }
        else{
            System.out.println("A Pilha não está vazia");
            return 0;
        }
    }
    public void Remover(){
        if(Vazia()==0){
            System.out.println(this.dados[topo] + " removido");
            this.topo--;
        }
    }
    public void Imprime(){
        for(int i=0;i<=this.topo;i++){
            System.out.print(this.dados[i]);
            System.out.print(",");
        }
        System.out.println("");
    }

}


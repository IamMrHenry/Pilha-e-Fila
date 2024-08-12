/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.pilhas;

/**
 *
 * @author otaku
 */
public class ProjetoPilhas {

    public static void main(String[] args) {
        Pilha p1 = new Pilha(3);
    p1.Vazia();
    p1.Inserir(2);
    p1.Inserir(4);
    p1.Inserir(9);
    p1.Imprime();
    p1.Remover();
    p1.Imprime();
    Fila f1 = new Fila(3);
    f1.Vazia();
    f1.Insere(2);
    f1.Insere(4);
    f1.Insere(9);
    f1.Imprime();
    f1.Remove();
    f1.Imprime();
    }
}

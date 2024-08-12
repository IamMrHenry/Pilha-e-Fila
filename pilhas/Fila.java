/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.pilhas;

/**
 *
 * @author otaku
 */

public class Fila {
  private int primeiro;
  private int ultimo;
  private int[] dados;
  private int capacidade;

  public Fila(int capacidade) {
    this.primeiro = -1;
    this.ultimo = -1;
    this.capacidade = capacidade;
    this.dados = new int[this.capacidade];
  }

  public int Cheia() {
    if (this.ultimo >= this.capacidade) {
      System.out.println("A Fila está cheia");
      return 1;
    } else {
      System.out.println("A Fila não está cheia");
      return 0;
    }
  }

  public int Vazia() {
    if (this.ultimo == -1) {
      System.out.println("A Fila está vazia");
      return 1;
    } else {
      System.out.println("A Fila não está vazia");
      return 0;
    }
  }

  public void Insere(int valor) {
    if (Vazia() == 1) {
      this.primeiro++;
      this.ultimo++;
      this.dados[primeiro] = valor;
    } else {
      if (Cheia() != 1) {
        this.ultimo++;
        this.dados[ultimo] = valor;
      }
    }
  }

  public void Remove() {
    if (Vazia() == 0) {
      for (int i = 0; i < this.ultimo; i++) {
        this.dados[i] = this.dados[i + 1];
      }
      this.ultimo--;
    }
  }

  public void Imprime() {
    for (int i = 0; i <= this.ultimo; i++) {
      System.out.print(this.dados[i]);
      System.out.print(",");
    }
    System.out.println("");
  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_prova;

/**
 *
 * @author d.jacobis
 */
public class MetodosAluno {
    int primeiro = 0;
    int last = 0;
    int maximo;
    private Aluno[] Lista_Aluno;

    //Construtor
    public MetodosAluno(int maximo) {
        this.Lista_Aluno = new Aluno[maximo];
        this.maximo = maximo;
    }


    public void InserirAluno(Aluno a1) {

        if (this.last == this.maximo) {
            AumentaTAMLista();
        }
        this.Lista_Aluno[this.last] = a1;
        this.last = this.last + 1;
        System.out.println("Aluno inserido com sucesso!");
    }


    public void Imprimir() {
        if (this.last == 0) {
            System.out.println("A lista está vazia!");
        } else {
            for (int i = 0; i < this.last; i++) {
                System.out.println(this.Lista_Aluno[i].toString());
            }
        }

    }


    public void RetirarAluno(int matricula) {
        int index = 0;
        for (int i = 0; i < this.last; i++) {

            if (matricula == Lista_Aluno[i].matricula) {
                index = i;
                break;
            }
        }
        this.Lista_Aluno[index] = null;
        for (int i = index; i < this.maximo - 1; i++) {
            this.Lista_Aluno[i] = this.Lista_Aluno[i + 1];
        }
        this.last = this.last - 1;
        System.out.println("O produto a seguir foi deletado: ");
    }

    public int PosicaoVazia() {
        return this.maximo - this.last;
    }

    // Função de inserção
    public void AumentaTAMLista() {
        Aluno[] ListaTemp = this.Lista_Aluno;
        this.maximo = ListaTemp.length + 7;
        this.Lista_Aluno = new Aluno[this.maximo];
        for (int i = 0; i < ListaTemp.length; i++) {

            this.Lista_Aluno[i] = ListaTemp[i];
        }
    }
}

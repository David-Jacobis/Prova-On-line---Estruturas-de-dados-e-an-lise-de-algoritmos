/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto_prova;

/**
 *
 * @author d.jacobis
 */
public class Projeto_Prova {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("David", 321, "Ciência Da computação");
        Aluno a2 = new Aluno("David67", 7653, "Sistemas");
        Aluno a3 = new Aluno("David22", 90987, "Engenharia Elétrica");
        Aluno a7 = new Aluno("David3241", 6537, "Física 2");
        
        MetodosAluno array = new MetodosAluno(5);
        array.InserirAluno(a1);
        array.InserirAluno(a2);
        array.InserirAluno(a3);
        array.RetirarAluno(1235);
        array.InserirAluno(a7);
        System.out.println(array.PosicaoVazia());
        array.Imprimir();
        
    }
    
}

 

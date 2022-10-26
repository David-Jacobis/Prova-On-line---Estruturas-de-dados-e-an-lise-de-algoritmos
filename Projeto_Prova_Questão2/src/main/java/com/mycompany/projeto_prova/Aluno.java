/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_prova;

/**
 *
 * @author d.jacobis
 */
public class Aluno {
    String nome;

     int matricula;

     String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + '}';
    }
}

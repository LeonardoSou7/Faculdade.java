/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculdade;

import java.util.Random;

/**
 *
 * @author alunolab03
 */
public class Aluno {
   
    public String Nome = "Cristiano";
    public String Curso = "Ciencias da Computação";
    public String Turma = "CC3M";
    public int Periodo = 3;
    public double Nota1B = 8.0;
    public double Nota2B = 6.5;
    public double NotaFinal = (Nota1B + Nota2B)/2;
    
    int ano = 2025;
    Random random = new Random();
    int numeroAleatorio = random.nextInt(10000);
    String numeroFinal = String.format("%04d", numeroAleatorio);
    public String Matricula = ano + numeroFinal;
    
    
    
}

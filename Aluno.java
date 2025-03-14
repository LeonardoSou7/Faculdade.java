package com.mycompany.faculdade;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;


public class Aluno {
    private static final AtomicInteger contadorAlunos = new AtomicInteger(0);
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota1B;
    private double nota2B;
    private double notaFinal;
    
    
    private String gerarMatricula() {
        int ano = java.time.Year.now().getValue();
        int aleatorio = new Random().nextInt(10000);
        return String.format("%d%04d", ano, aleatorio);
    }
    
    
    public double calcularFinal() {
        return (nota1B + nota2B) / 2;
    }
    
    
    public void passar(String novaTurma, int novoPeriodo) {
        this.turma = novaTurma;
        this.periodo = novoPeriodo;
    }

    
    public static int getQuantidadeAlunos() {
        return contadorAlunos.get();
    }
    
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    
    public Aluno() {
        this.matricula = gerarMatricula();
        contadorAlunos.incrementAndGet();
    }
    
    
    public Aluno(String nome, String curso, String turma, int periodo, double nota1B, double nota2B) {
        this.matricula = gerarMatricula();
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota1B = nota1B;
        this.nota2B = nota2B;
        this.notaFinal = calcularFinal();
        contadorAlunos.incrementAndGet();
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
    
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getNota1B() {
        return nota1B;
    }

    public void setNota1B(double nota1B) {
        this.nota1B = nota1B;
        this.notaFinal = calcularFinal();
    }

    public double getNota2B() {
        return nota2B;
    }

    public void setNota2B(double nota2B) {
        this.nota2B = nota2B;
        this.notaFinal = calcularFinal();
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    
    
    public void imprimir() {
        System.out.println("-----------------------------------");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
        System.out.println("Período: " + periodo);  
        System.out.println("Nota 1º Bimestre: " + nota1B);
        System.out.println("Nota 2º Bimestre: " + nota2B);
        System.out.println("Nota Final: " + notaFinal);
        System.out.println("-----------------------------------");
    }
    

    
    
}

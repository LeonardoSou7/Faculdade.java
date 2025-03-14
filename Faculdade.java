package com.mycompany.faculdade;

public class Faculdade {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Leonardo Rosa", "Ciencia da Computação", "CC3M", 3, 7.6, 7.3);
        Aluno aluno2 = new Aluno("Arthur Prates", "Ciencia da Computação", "CC3M", 3, 9.2, 8.3);
        Aluno aluno3 = new Aluno("Gabriel Aguilar", "Ciencia da Computação", "CC3M", 3, 8.0, 8.4);
        
        System.out.println("Números de babuínos matriculados: " + Aluno.getQuantidadeAlunos());
        
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
        
        Aluno aluno4 = new Aluno("Matheus Presidente", "Ciencia da Computação", "CC3M", 3, 6.6, 6.0);
        Aluno aluno5 = new Aluno("João Pinto Presidente", "Ciencia da Computação", "CC3M", 16, 1.0, 0.5);
        
        System.out.println("Números de babuínos matriculados: " + Aluno.getQuantidadeAlunos());
        
        System.out.println("Um ano depois:");
        
        
        aluno1.passar("CC4M", 4);
        aluno2.passar("CC4M", 4);
        aluno3.passar("CC4M", 4);
        aluno4.passar("CC4M", 4);
        aluno5.passar("CC3M", 17);
        
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
        aluno4.imprimir();
        aluno5.imprimir();
   
    }
    
}

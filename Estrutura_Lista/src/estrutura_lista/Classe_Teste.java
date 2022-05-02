/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_lista;

/**
 *
 * @author miningsolution
 */
public class Classe_Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //*******Cria uma lista de alunos vazia****** 
       Lista lista_aluno = new Lista(4);
       
       //Criando 4 objetos do tipo aluno
       Aluno a1 = new Aluno("Joao", 30);
       Aluno a2 = new Aluno("Maria", 23);
       Aluno a3 = new Aluno("Sara", 34);
       Aluno a4 = new Aluno("Gabriela", 19);
       
       //Adicionando os alunos na Sala de aula. Aqui representada pela estrutura de dados lista.
      System.out.println(lista_aluno.Lista_Aluno.length);
      lista_aluno.Inserir(a1);
       lista_aluno.Inserir(a2);
       lista_aluno.Inserir(a3);
       lista_aluno.Inserir(a4);
       
       	lista_aluno.remover("Joao");
       	lista_aluno.pesquisa("Gabriela");
    }
    
}

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
public class Aluno {
    
    private String nome;
    private int idade;
    
    
    //************Métodos**************
    public Aluno(String nome, int idade){
       this.nome = nome;
       this.idade = idade;   
    }
    
    public String get_Nome(){
         return(this.nome);
    }
    
    public int get_Idade(){
         return(this.idade);
    }
   
}

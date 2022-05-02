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
public class Lista {

    public int primeiro = 0;
    public int ultimo = 0;
    public int matricula;
    public Aluno[] Lista_Aluno;

    //******Método Construtor******
    public Lista(int maximo) {
        this.primeiro = 0; 
        this.ultimo = this.primeiro;
        Lista_Aluno = new Aluno[maximo];
    }

    //*******Método para testar se a lista está vazia********
    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    //*********Método para adicionar um aluno na lista*******
    public void Inserir(Aluno a1) {
        if (this.ultimo >= this.Lista_Aluno.length) {
            System.out.println("Lista Cheia....Nao e permitido adicionar outro aluno");
        } else {
            this.Lista_Aluno[this.ultimo] = a1;
            this.ultimo = this.ultimo + 1;
            System.out.println("Aluno inserido com sucesso");
        }
    }
    
    //*********Criar Método para Remover um aluno da lista com base no seu nome*****************
    public void remover(String nome) {
    	Aluno[] array = null;
    	for(int i = 0; i < this.Lista_Aluno.length-1; i++) {
    		
    		if(this.Lista_Aluno[i].get_Nome().equals(nome)) {
    			
    			array = new Aluno[ this.Lista_Aluno.length-1];
    			
    			   for(int index = 0; index < i; index++){
    				   array[index] = this.Lista_Aluno[index];
                   }
    			   for(int j = i; j <this.Lista_Aluno.length - 1; j++){
    				   System.out.println("Aluno vai ser deletado "+ this.Lista_Aluno[j+1].get_Nome());
    				   array[j] = this.Lista_Aluno[j+1];
    				  
                   }
    			   this.Lista_Aluno = array;
    			   this.ultimo = this.ultimo -1;
    			System.out.println("Aluno Deletado "+ nome);
    			 break;
    		}
			
    	}
    	
    	for(int inde = 0; inde<array.length ; inde++){
    		 System.out.println(array[inde].get_Nome());
        };
    }
    
    //*********Criar Método para recuperar os dados de  um aluno em especifico da lista com base no seu nome*****************
    public void pesquisa(String nome) {
    	boolean verificado = false;
    	for(int i = 0; i < this.Lista_Aluno.length; i++) {
    		if(this.Lista_Aluno[i].get_Nome().equals(nome)) {
    			System.out.println( this.Lista_Aluno[i].get_Nome()+" encontrado(a) Idade: "+this.Lista_Aluno[i].get_Idade());
    			verificado= true;
    		}
    	}
    	if(verificado == false) {
    		
    			System.out.println( nome+" n�o encontrado(a)");
    		
    	}
        
    }
    
   
    public Aluno[] imprimir() {
    	for(int j = 0; j < this.Lista_Aluno.length; j++) {
        	
    		System.out.print(Lista_Aluno[j].get_Nome()+" ,");
    		}
        return Lista_Aluno;
    }

}

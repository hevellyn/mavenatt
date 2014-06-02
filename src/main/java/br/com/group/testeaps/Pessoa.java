package br.com.group.testeaps;

public class Pessoa {
	public int matricula = 0;
    public String nome = "Hévellyn";
	
    
    
    public Pessoa (String nome, int idade){
    	this.nome = nome;
    	this.matricula = matricula;
    }
    
    public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int novamatricula) {
		this.matricula = novamatricula;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String novonome){
		this.nome = novonome;
	}

}

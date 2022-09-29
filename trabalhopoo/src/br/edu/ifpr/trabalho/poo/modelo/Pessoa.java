package br.edu.ifpr.trabalho.poo.modelo;

public abstract class Pessoa {

	protected String nome;
	protected String endereco;
	protected String dataNascimento;
	protected String telefoneContato;

	public Pessoa() { // construtor
		super();
	}

	public Pessoa(String nome, String endereco, String dataNascimento, String telefoneContato) { //construtor com parametro
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefoneContato = telefoneContato;

	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getTelefoneContato() {
		return telefoneContato;
	}
	
	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	
	public abstract void imprimirDados();

}

package br.edu.ifpr.trabalho.poo.modelo;

public final class Aluno extends Pessoa {
	
	private int anoDeIngresso;

	public Aluno() { // construtor
		super();

	}

	public Aluno(String nome, String endereco, String dataNascimento, String telefoneContato, int anoDeIngreco) {
		super(nome, endereco, dataNascimento, telefoneContato);
		this.anoDeIngresso = anoDeIngreco;
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
	
	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}

	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

	public void imprimirDados() {
		System.out.println(">>>>>>>>>>>DADOS DO ALUNO<<<<<<<<<<<");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Data de nascimento: " + this.getDataNascimento());
		System.out.println("Telefone de Contato: " + this.getTelefoneContato());
		System.out.println("Ano de Ingresso: " + this.getAnoDeIngresso());
		System.out.println("------------------------------------");
	}
}
package br.edu.ifpr.trabalho.poo.modelo;

public final class Professor extends Pessoa {
	
	private String siape;

	public Professor() {
		super();
	}

	public Professor(String siape, String nome, String endereco, String dataNascimento, String telefoneContato) {
		super(nome, endereco, dataNascimento, telefoneContato);
		this.siape = siape;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
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

	public void imprimirDados() {
		System.out.println(">>>>>>>>>DADOS DO PROFESSOR<<<<<<<<<");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Data de nascimento: " + this.getDataNascimento());
		System.out.println("Telefone de Contato: " + this.getTelefoneContato());
		System.out.println("SIAPE: " + this.getSiape());
		System.out.println("------------------------------------");

	}
}

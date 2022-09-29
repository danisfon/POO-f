package br.edu.ifpr.trabalho.poo.modelo;

public class Matricula {

	private int numero;
	private boolean ativa;
	private Turma turma;
	private Aluno aluno;
	
	public Matricula () {
		
	}
	
	public Matricula (int numero, boolean ativa, Aluno aluno, Turma turma) { 
		this.numero = numero;
		this.ativa = ativa;
		this.turma = turma;
		this.aluno = aluno;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}


	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}

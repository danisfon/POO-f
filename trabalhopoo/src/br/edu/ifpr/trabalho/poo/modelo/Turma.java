package br.edu.ifpr.trabalho.poo.modelo;

public class Turma {
	
	private String nomeTurma;
	private int alunosMatriculados;
	private int numeroMinimo;
	private Curso curso;

	public Turma() {
	}

	public Turma(String nomeTurma, int alunosMatriculados, int numeroMinimo, Curso curso) {
		this.nomeTurma = nomeTurma;
		this.alunosMatriculados = alunosMatriculados;
		this.numeroMinimo = numeroMinimo;
		this.curso = curso;

	}
	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public int getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(int alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}

	public int getNumeroMinimo() {
		return numeroMinimo;
	}

	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}

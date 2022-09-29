package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	private Turma turma;
	private Professor professor;
	
	public Disciplina () { 
		super();
	}
	
	public Disciplina (String nome, int cargaHoraria, Professor professor, Turma turma) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.turma = turma;
		this.professor = professor;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}

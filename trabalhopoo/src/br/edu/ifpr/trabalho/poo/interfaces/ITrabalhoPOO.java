package br.edu.ifpr.trabalho.poo.interfaces;

import java.util.ArrayList;


import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public interface ITrabalhoPOO {
	
	Curso lerDadosCurso();
	Professor lerDadosProfessor();
	Turma lerDadosTurma();
	Turma lerDadosTurma(Curso curso);
	Disciplina lerDadosDisciplina();
	Disciplina lerDadosDisciplina(Professor professor, Turma turma);
	Aluno lerDadosAluno();
	Matricula lerDadosMatricula();
	Matricula lerDadosMatricula(Aluno aluno, Turma turma);

	void listarMatriculasAtivas(ArrayList<Matricula> matriculas);
	void listarTodasMatriculas(ArrayList<Matricula> matriculas);
	void listasAlunos(ArrayList<Aluno> alunos);
	void listasTurmas(ArrayList<Turma> turmas);
	void listasProfessores(ArrayList<Professor> professores);
	void listasDisciplinas(ArrayList<Disciplina> disciplinas);
	void listasCursos(ArrayList<Curso> cursos);

}

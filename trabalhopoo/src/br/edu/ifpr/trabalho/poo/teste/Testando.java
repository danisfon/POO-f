package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.ImpleTrabDani;
import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class Testando {

	public static void main(String[] args) {

		ITrabalhoPOO testePoo = new ImpleTrabDani();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

		Curso curso = testePoo.lerDadosCurso();
		cursos.add(curso);
		Professor professor = testePoo.lerDadosProfessor();
		professores.add(professor);
		Turma turma = testePoo.lerDadosTurma(curso);
		turmas.add(turma);
		Disciplina disciplina = testePoo.lerDadosDisciplina(professor, turma);
		disciplinas.add(disciplina);

		for (int i = 1; i <= turma.getAlunosMatriculados(); i++) {
			System.out.println("----INFORME OS DADOS DO " +i+ "º ALUNO----");
			Aluno aluno = testePoo.lerDadosAluno();
			alunos.add(aluno);
			Matricula matricula = testePoo.lerDadosMatricula(aluno, turma);
			matriculas.add(matricula);
		}
		
		testePoo.listarMatriculasAtivas(matriculas);
		testePoo.listarTodasMatriculas(matriculas);
		testePoo.listasAlunos(alunos);
		testePoo.listasTurmas(turmas);
		testePoo.listasProfessores(professores);
		testePoo.listasDisciplinas(disciplinas);
		testePoo.listasCursos(cursos);
	}
}

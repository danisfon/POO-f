package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.ArrayList;

import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class ImpleTrabDani implements ITrabalhoPOO {

	@Override
	public Curso lerDadosCurso() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do curso: ");
		String nome = teclado.nextLine();

		System.out.println();

		Curso curso = new Curso(nome);
		return curso;
	}

	@Override
	public Professor lerDadosProfessor() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("----INFORME OS DADOS DO PROFESSOR----");

		System.out.println("Informe o nome do professor: ");
		String nome = teclado.nextLine();

		System.out.println("Informe o endereco do professor: ");
		String endereco = teclado.nextLine();

		System.out.println("Informe a data de nascimento do professor: ");
		String dataNascimento = teclado.nextLine();

		System.out.println("Informe o telefone do professor: ");
		String telefoneContato = teclado.nextLine();

		System.out.println("Informe o SIAPE do professor:");
		String siape = teclado.nextLine();

		System.out.println();

		Professor professor = new Professor(nome, endereco, dataNascimento, telefoneContato, siape);
		return professor;
	}

	@Override
	public Turma lerDadosTurma(Curso curso) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("----INFORME OS DADOS DA TURMA----");

		System.out.println("Informe o nome da Turma: ");
		String nomeTurma = teclado.nextLine();

		System.out.println("Informe a quantidade de alunos matriculados: ");
		int alunosMatriculados = teclado.nextInt();

		System.out.println("Informe o numero minimo de alunos na turma: ");
		int numeroMinimo = teclado.nextInt();

		System.out.println();

		Turma turma = new Turma(nomeTurma, alunosMatriculados, numeroMinimo, curso);
		return turma;

	}

	@Override
	public Turma lerDadosTurma() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("----INFORME OS DADOS DA TURMA----");

		System.out.println("Informe o nome da Turma: ");
		String nomeTurma = teclado.nextLine();

		System.out.println("Informe a quantidade de alunos matriculados: ");
		int alunosMatriculados = teclado.nextInt();

		System.out.println("Informe o numero minimo de alunos na turma: ");
		int numeroMinimo = teclado.nextInt();

		Curso curso = new Curso();
		curso = lerDadosCurso();

		System.out.println();

		Turma turma = new Turma(nomeTurma, alunosMatriculados, numeroMinimo, curso);
		return turma;
	}

	@Override
	public Aluno lerDadosAluno() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do aluno: ");
		String nome = teclado.nextLine();

		System.out.println("Informe o endereço do aluno: ");
		String endereco = teclado.nextLine();

		System.out.println("Informe a data de Nascimento do aluno: ");
		String dataNascimento = teclado.nextLine();

		System.out.println("Informe o telefone do aluno: ");
		String telefoneContato = teclado.nextLine();

		System.out.println("Informe o ano de ingresso do aluno: ");
		int anoDeIngresso = teclado.nextInt();

		System.out.println();

		Aluno aluno = new Aluno(nome, endereco, dataNascimento, telefoneContato, anoDeIngresso);
		return aluno;
	}

	@Override
	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {

		System.out.println("----INFORME OS DADOS DA DISCIPLINA----");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome da Disciplina: ");
		String nome = teclado.nextLine();

		System.out.println("Informe a carga Horaria: ");
		int cargaHoraria = teclado.nextInt();

		System.out.println();

		Disciplina disciplina = new Disciplina(nome, cargaHoraria, professor, turma);
		return disciplina;
	}

	@Override
	public Disciplina lerDadosDisciplina() {

		System.out.println("----INFORME OS DADOS DA DISCIPLINA----");

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome da Disciplina: ");
		String nome = teclado.nextLine();

		System.out.println("Informe a carga Horaria: ");
		int cargaHoraria = teclado.nextInt();

		Turma turma = new Turma();
		turma = lerDadosTurma();

		Professor professor = new Professor();
		professor = lerDadosProfessor();

		System.out.println();

		Disciplina disciplina = new Disciplina(nome, cargaHoraria, professor, turma);
		return disciplina;
	}

	@Override
	public Matricula lerDadosMatricula() {
		boolean ativa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("----INFORME OS DADOS DA MATRÍCULA----");

		System.out.println("Informe o numero da matricula: ");
		int numeroMatricula = teclado.nextInt();

		System.out.println("Informe se a matricula esta ativa: ");
		teclado.nextLine();
		char matriculaAt = teclado.next().charAt(0);

		if (matriculaAt == 's' || matriculaAt == 'S') {
			ativa = true;
		} else {
			ativa = false;
		}

		Aluno aluno = new Aluno();
		aluno = lerDadosAluno();
		Turma turma = new Turma();
		turma = lerDadosTurma();

		System.out.println();

		Matricula matricula = new Matricula(numeroMatricula, ativa, aluno, turma);
		return matricula;
	}

	@Override
	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		boolean ativa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("----INFORME OS DADOS DA MATRÍCULA----");

		System.out.println("Informe o numero da matricula: ");
		int numeroMatricula = teclado.nextInt();

		System.out.println("Informe se a matricula esta ativa: ");
		teclado.nextLine();
		char matriculaAt = teclado.next().charAt(0);

		if (matriculaAt == 's' || matriculaAt == 'S') {
			ativa = true;
		} else {
			ativa = false;
		}

		System.out.println();

		Matricula matricula = new Matricula(numeroMatricula, ativa, aluno, turma);
		return matricula;
	}

	@Override
	public void listarMatriculasAtivas(ArrayList<Matricula> matriculas) {
		System.out.println("-----LISTA DE MATRICULAS ATIVAS-----");
		System.out.println();
		for (Matricula matricula : matriculas) {
			if (matricula.isAtiva() == true) {
				System.out.println(
						"Aluno(a) " + matricula.getAluno().getNome() + " - Matricula: " + matricula.getNumero());
				System.out.println();
			}
		}
		System.out.println("------------------------------------");
		System.out.println();

	}

	@Override
	public void listarTodasMatriculas(ArrayList<Matricula> matriculas) {
		System.out.println("---------LISTA DE MATRICULAS--------");
		System.out.println();
		for (Matricula matricula : matriculas) {
			System.out.println("Aluno(a) " + matricula.getAluno().getNome() + " - Matricula: " + matricula.getNumero());
			System.out.println();

		}
		System.out.println("------------------------------------");
		System.out.println();

	}

	@Override
	public void listasAlunos(ArrayList<Aluno> alunos) {
		System.out.println("-----------LISTA DE ALUNOS-----------");
		System.out.println();
		for (Aluno aluno : alunos) {
			System.out.println("-Nome: " + aluno.getNome());
			System.out.println("-Endereço: " + aluno.getEndereco());
			System.out.println("-Data de nascimento: " + aluno.getDataNascimento());
			System.out.println("-Telefone de contato: " + aluno.getTelefoneContato());
			System.out.println("-Ano de ingresso: " + aluno.getAnoDeIngresso());
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println();

	}

	@Override
	public void listasTurmas(ArrayList<Turma> turmas) {
		System.out.println("----------LISTA DAS TURMAS----------");
		System.out.println();
		for (Turma turma : turmas) {
			System.out.println("-Nome da Turma: " + turma.getNomeTurma());
			System.out.println("-Curso: " + turma.getCurso().getNome());
			System.out.println("-Numero Minimo de alunos: " + turma.getNumeroMinimo());
			System.out.println("-Aluno matriculado: " + turma.getAlunosMatriculados());
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println();

	}

	@Override
	public void listasProfessores(ArrayList<Professor> professores) {
		System.out.println("---------LISTA DO PROFESSOR---------");
		System.out.println();
		for (Professor professor : professores) {
			System.out.println("-Nome: " + professor.getNome());
			System.out.println("-Endereço: " + professor.getEndereco());
			System.out.println("-Data de nascimento: " + professor.getDataNascimento());
			System.out.println("-Telefone de contato: " + professor.getTelefoneContato());
			System.out.println("-SIAPE: " + professor.getSiape());
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println();

	}

	@Override
	public void listasDisciplinas(ArrayList<Disciplina> disciplinas) {
		System.out.println("--------LISTA DAS DISCIPLINAS-------");
		System.out.println();
		for (Disciplina disciplina : disciplinas) {
			System.out.println("-Nome: " + disciplina.getNome());
			System.out.println("-Carga horaria da disciplina: " + disciplina.getCargaHoraria());
			System.out.println("-Nome do Professor: " + disciplina.getProfessor().getNome());
			System.out.println("-Turma da disciplina: " + disciplina.getTurma().getNomeTurma());
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println();

	}

	@Override
	public void listasCursos(ArrayList<Curso> cursos) {
		System.out.println("-----------LISTA DO CURSO----------");
		System.out.println();
		for (Curso curso : cursos) {
			System.out.println("-Nome do curso: " + curso.getNome());
			System.out.println();
		}
		System.out.println("------------------------------------");
	}

}
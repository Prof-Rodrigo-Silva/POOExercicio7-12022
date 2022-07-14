package classeexecutavel;

import model.Aluno;
import model.Disciplina;
import model.Nota;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;


public class ClasseExecutavel {
	
	public static void main(String[] args) throws Throwable {
	
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		List<Nota> notas = new ArrayList<Nota>();
		
		
		int nroAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o nro de alunos?"));
		int nroDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Qual o nro de disciplinas por aluno?"));
		
		
		for(int i = 0; i < nroAluno; i++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual idade? "));
			long cpf = Long.parseLong(JOptionPane.showInputDialog("Qual o CPF? "));
			String dataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula?[dd/mm/yyyy] ");
			String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola? ");
			int semestreMatriculado = Integer.parseInt(JOptionPane.showInputDialog("Semestre matriculado? "));
			
			SimpleDateFormat sdfd = new SimpleDateFormat("dd/MM/yyyy");
			Date data = sdfd.parse(dataMatricula);
			
			Aluno aluno = new Aluno(nome, idade, cpf, data, nomeEscola, semestreMatriculado);
			
			for(int j = 0; j < nroDisciplinas; j++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da "+(j+1)+"º Disciplina?");
				Disciplina disciplina = new Disciplina(nomeDisciplina);
				
				int nroNotas = Integer.parseInt(JOptionPane.showInputDialog("Qual o nro de conjunto de notas?"));
				
				for(int w = 0; w <nroNotas;w++) {
					float[] coletaNotas = new float[4];
					for(int z = 0; z <= 3; z++) {
						float valorNota = Float.parseFloat(JOptionPane.showInputDialog((w+1)+"º Nota da Disciplina?"));
						coletaNotas[w] = valorNota;
					}
					Nota nota = new Nota(coletaNotas);
					notas.add(nota);
				}
				
				disciplina.setNotas(notas);
				aluno.getDisciplinas().add(disciplina);
			}
		
			alunos.add(aluno);
		}
		System.out.println("------------LISTA DE ALUNOS------------");
		for(Aluno aluno : alunos) {
			System.out.println("------------ALUNO------------");
			System.out.println("Nome do aluno: "+aluno.getNome());
			System.out.println("Idade do aluno: "+aluno.getIdade());
			System.out.println("CPF do aluno: "+aluno.getNumCPF());
			System.out.println("Data de matricula do aluno: "+aluno.getDataMatricula());
			System.out.println("Nome da escola: "+aluno.getNomeEscola());
			System.out.println("Semestre do aluno: "+aluno.getSemestreMatriculado());
			System.out.println("Média Geral: "+aluno.calculaMediaGeral());
			System.out.println("Situação: "+aluno.calculaMediaGeral2());
			
			System.out.println("------------LISTA DE DISCIPLINAS------------");
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("Disciplina: "+disciplina.getNomeDisciplina());
				System.out.println("Média da disciplina: "+disciplina.getMediaDisciplina());
				System.out.println("------------LISTA DE NOTAS------------");
				for(Nota nota : disciplina.getNotas()) {
					for(int y = 0; y < nota.getNota().length;y++) {
						System.out.println((y+1)+"º Nota: "+nota.getNota()[y]);
					}
					System.out.println("--------------------------------------------");
				}
				System.out.println("--------------------------------------------");
				}
			}
	}
}

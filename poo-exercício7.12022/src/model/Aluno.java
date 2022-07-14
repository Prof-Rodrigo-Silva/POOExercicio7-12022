package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import interfaces.CalculaMedia;

public class Aluno extends Pessoa implements CalculaMedia{

	private Date dataMatricula;
	private String nomeEscola;
	private int semestreMatriculado;
	private List<Disciplina> disciplinas;
	
	public Aluno() {
		disciplinas = new ArrayList<Disciplina>();
	}

	public Aluno(String nome, int idade, long numCpf, Date dataMatricula, String nomeEscola, int semestre){
		this.nome = nome;
		this.idade = idade;
		this.numCPF = numCpf;
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.semestreMatriculado = semestre;
		disciplinas = new ArrayList<Disciplina>();
	}
		
	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getSemestreMatriculado() {
		return semestreMatriculado;
	}

	public void setSemestreMatriculado(int semestreMatriculado) {
		this.semestreMatriculado = semestreMatriculado;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dataMatricula, disciplinas, nomeEscola, semestreMatriculado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(nomeEscola, other.nomeEscola) && semestreMatriculado == other.semestreMatriculado;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome="+ nome +", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", semestreMatriculado="
				+ semestreMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public float calculaMediaGeral() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean calculaMediaGeral1() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

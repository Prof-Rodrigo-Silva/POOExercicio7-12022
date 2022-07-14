package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import interfaces.CalculaMedia;
import suport.Situacao;

public class Professor extends Pessoa implements CalculaMedia{
	
	private String inscMatricula;
	private String area;
	private List<Disciplina> disciplinas;
	
	public Professor() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public Professor(String nome, int idade, long numCpf, String inscMatricula, String area) {
		super(nome, idade, numCpf);
		this.inscMatricula = inscMatricula;
		this.area = area;
		disciplinas = new ArrayList<Disciplina>();
		
	}

	public String getInscMatricula() {
		return inscMatricula;
	}

	public void setInscMatricula(String inscMatricula) {
		this.inscMatricula = inscMatricula;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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
		result = prime * result + Objects.hash(area, disciplinas, inscMatricula);
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
		Professor other = (Professor) obj;
		return Objects.equals(area, other.area) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(inscMatricula, other.inscMatricula);
	}

	@Override
	public String toString() {
		return "Professor [nome="+ nome +"inscMatricula=" + inscMatricula + ", area=" + area + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public float calculaMediaGeral() {
		float somaNotas = 0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaDisciplina();
		}
		return somaNotas / disciplinas.size();
	}

	@Override
	public boolean calculaMediaGeral1() {
		// TODO Auto-generated method stub
		return false;
	}
	public String calculaMediaGeral2() {
		return calculaMediaGeral() >=7 ? Situacao.APROVADO : Situacao.REPROVADO;
		
		
	}
	

}

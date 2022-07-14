package model;

import java.util.Arrays;

public class Nota {
	
	private float[] notas = new float[3];
	
	public Nota() {

	}
	
	public Nota(float[] notas) {
		this.notas = notas;
	}

	public float[] getNota() {
		return notas;
	}

	public void setNota(float[] notas) {
		this.notas = notas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Arrays.equals(notas, other.notas);
	}

	@Override
	public String toString() {
		return "Nota [nota=" + Arrays.toString(notas) + "]";
	}
	
	public float getSomaNotas() {
		float soma = 0;
		for(float nota : notas) {
			soma += nota;
		}
		return soma;
	}
	
	public float getMediaNotas() {
		return getSomaNotas() / notas.length;
	}
	
	

}

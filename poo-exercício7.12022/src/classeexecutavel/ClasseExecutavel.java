package classeexecutavel;

import model.Disciplina;
import model.Nota;
import java.util.ArrayList;
import java.util.List;

public class ClasseExecutavel {
	
	public static void main(String[] args) {
	
		float[] listaNotas = new float[3];
		
		for(int i = 0; i < 3; i++) {
			float nota = 5 + i;
			listaNotas[i] = nota;
		}
		Nota notas = new Nota(listaNotas);
		Disciplina disciplina = new Disciplina();
		disciplina.setNomeDisciplina("POO");
		disciplina.getNotas().add(notas);
		
		
		
		System.out.println(notas.getSomaNotas());
		System.out.println(notas.getMediaNotas());
		System.out.println(disciplina.getMediaDisciplina());
		System.out.println(disciplina.getNomeDisciplina());
		
	}
}

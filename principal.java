package com.relatorio.trabalho.java;

import java.util.List;
import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList<Docente> docentes = new ArrayList<>();
		ArrayList<Discente> discentes = new ArrayList<>();
		ArrayList<Disciplina> disciplinas = new ArrayList<>();
		ArrayList<Curso> cursos = new ArrayList<>();
		ArrayList<Graduacao> graduacoes = new ArrayList<>();
		ArrayList<posGraduacao> posGraduacoes = new ArrayList<>();
		ArrayList<prodCien> producoes = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-d")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqDocent(docentes, args[++i])) {
					continue;
				} else
					break;
			} else if (args[i].equals("-a")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqDiscent(discentes, args[++i])) {
					continue;
				} else
					break;
			} else if (args[i].equals("-r")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqDisciplina(disciplinas, args[++i])) {
					continue;
				} else
					break;
			} else if (args[i].equals("-c")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqCurso(cursos, args[++i])) {
					continue;
				} else
					break;
			} else if (args[i].equals("-og")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqGrad(graduacoes, args[++i])) {
					continue;
				} else
					break;
			} else if (args[i].equals("-op")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqPos(posGraduacoes, args[++i])) {
					continue;
				} else
					break;
			} else if (args[i].equals("-p")) {
				Arquivos arq = new Arquivos();
				if (arq.lerArqProd(producoes, args[++i])) {
					continue;
				} else
					break;
			}
		}
		for (int i = 0; i < docentes.size(); i++) {
			for(int j = 0;j<disciplinas.size();j++) {
				Docente doc = docentes.get(i);
				Disciplina dis = disciplinas.get(j);
				if(dis.buscaDis(doc.getCod())) {
					doc.setDis(dis);
					for(int q =0; q<cursos.size();q++) {
						Curso cur = cursos.get(q);
						if(cur.buscaCur(dis.getCodCur())) {
							doc.setCurs(cur);
						}
					}
				}
			}
		}
		

	}

}

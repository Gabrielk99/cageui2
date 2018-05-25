package com.relatorio.trabalho.java;
import java.util.*; 
public class Docente{
	private int codDocente;
	private String nome;
	private Departamento dep;
	private ArrayList<Curso> cursos;
	private ArrayList<posGraduacao> pos;
	private ArrayList<Graduacao> grad;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<prodCien> prods;


	public Docente ( int cd,String n, Departamento d) {
		this.nome = n;
		this.dep = d;
		this.codDocente = cd;
		this.cursos = new ArrayList <>();
		this.pos = new ArrayList <> ();
		this.grad = new ArrayList<>();
		this.disciplinas = new ArrayList <>();
		this.prods = new ArrayList <>();
	}
	public  int getCod () {
		return this.codDocente;
	}
	public void setDis(Disciplina dis) {
		disciplinas.add(dis);
	}
	public void setCurs(Curso cur) {
		cursos.add(cur);
	}
}

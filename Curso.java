package com.relatorio.trabalho.java;

public class Curso {
	private double codCurso;
	private String nome;
	private String grad;
	private String posGrad;
	
	public Curso (double codigo,String name,String g, String pg) {
		this.codCurso = codigo;
		this.nome = name;
		this.grad = g;
		this.posGrad =pg;
	}
	public boolean buscaCur (double cd) {
		if (this.codCurso == cd) {
			return true;
		}
	else return false;
	}
}
package com.relatorio.trabalho.java;
import java.util.Date;
public class Discente{
	private long matricula;
	private String nome;
	private double codCurso;
	
	public Discente(String n, double cd, long mat) {
		this.nome = n;
		this.codCurso = cd;
		this.matricula = mat;
	}
}

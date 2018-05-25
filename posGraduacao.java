package com.relatorio.trabalho.java;
import java.util.Date;
import java.util.*;
public class posGraduacao {
	private int codDoc;
	private long mat;
	private String programa;
	private int cargHorSem;
	private Date dataIng;
	private int cargHorSms;
	private ArrayList <Discente> alunos;
	
	
	public posGraduacao (int cd,long m,String prog,int chs,Date dat, int csms) {
		this.cargHorSem = chs;
		this.codDoc = cd;
		this.mat = m;
		this.programa = prog;
		this.dataIng = dat;
		this.cargHorSms = csms;
		this.alunos = new ArrayList <> ();
	}
}

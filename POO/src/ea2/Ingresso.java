package ea2;

import java.util.ArrayList;

class Ingresso {
	private double ingressoInt = 32.00;
	private ArrayList<String> sessoes = new ArrayList<String>();
	private Filme filme;
	
	public Ingresso(Filme filme) {
		this.filme = filme;
	}
	
	public String getFilme() {
		return this.filme.getTitulo();
	}
	
	public ArrayList<String> getSessoes() {
		this.sessoes.add("13:30");
		this.sessoes.add("14:35");
		this.sessoes.add("17:00");
		this.sessoes.add("19:00");
		this.sessoes.add("19:40");
		this.sessoes.add("21:00");
		
		return this.sessoes;
	}
	
	public double getIngressoInteira() {
		return this.ingressoInt;
	}
	
	public double getIngressoMeia() {
		return this.ingressoInt / 2 ;
	}
	
}

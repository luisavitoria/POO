package ea3;

import java.util.ArrayList;

class Ingresso {
	protected double ingressoInt;
	protected ArrayList<String> sessoes = new ArrayList<String>();
	protected Filme filme;
	
	public Ingresso(Filme filme) {
		this.filme = filme;
		this.ingressoInt = 32.00;
	}
	
	public Ingresso(Filme filme, double ingressoInt) {
		this.filme = filme;
		this.ingressoInt = ingressoInt;
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
	
	public String acessoLanchonete() {
		return "Você não possui acesso à lanchonete liberado. Compre um ingresso VIP.";
	}
	
}


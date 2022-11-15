package ea1;

import java.util.ArrayList;

public class Filme {
	private String titulo;
	private String genero;
	private int ano;
	private int codigo;
	private ArrayList<String> sessoes;
	private double ingressoInteira = 32.00;
	
	
	public Filme(String titulo, String genero, int ano, int codigo, ArrayList<String> sessoes){
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.codigo = codigo;
		this.sessoes = sessoes;
	}
	
	public static ArrayList<Filme> getListaFilmes() {
		ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
		
		ArrayList<String> sessao1 = new ArrayList<String>();
		sessao1.add("13:30");
		sessao1.add("17:00");
		sessao1.add("19:40");
		
		ArrayList<String> sessao2 = new ArrayList<String>();
		sessao2.add("14:35");
		sessao2.add("16:30");
		sessao2.add("19:00");
		sessao2.add("21:00");
		
		listaFilmes.add(new Filme("A Mulher Rei", "Ação/Drama", 2022, 1, sessao1));
		listaFilmes.add(new Filme("Adão Negro", "Ação/Fantasia", 2022, 2, sessao1));
		listaFilmes.add(new Filme("One Piece - Red", "Aventura/Ação", 2022, 3, sessao2));
		listaFilmes.add(new Filme("Convite Maldito", "Terror/Mistério", 2022, 4, sessao2));
		listaFilmes.add(new Filme("Halloween Ends", "Terror/Thriller", 2022, 5, sessao1));
		listaFilmes.add(new Filme("Sorria", "Terror", 2022, 6, sessao2));
		
		return listaFilmes;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public ArrayList<String> getSessoes() {
		return this.sessoes;
	}
	
	public double getIngressoInteira() {
		return this.ingressoInteira;
	}
	
	public double getIngressoMeia() {
		return this.ingressoInteira / 2 ;
	}
	
	@Override
	public String toString() {
		return this.codigo + " - " + this.titulo;
	}
	
}

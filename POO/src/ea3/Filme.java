package ea3;

import java.util.ArrayList;

class Filme {
	private String titulo;
	private String genero;
	private String diretor;
	private String descricao;
	private String duracao;
	private int ano;
	private int codigo;
	private boolean filme3D;
	
	public Filme(String titulo, String genero, String diretor, String descricao, String duracao, int ano, int codigo, boolean filme3D){
		this.titulo = titulo;
		this.genero = genero;
		this.diretor = diretor;
		this.descricao = descricao;
		this.duracao = duracao;
		this.ano = ano;
		this.codigo = codigo;
		this.filme3D = filme3D;
	}
	
	public static ArrayList<Filme> getListaFilmes() {
		ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
		
		listaFilmes.add(new Filme("A Mulher Rei", "Ação/Drama", "Gina Prince-Bythewood", "Em 1800, o general Nanisca treina um grupo de mulheres guerreiras para proteger o reino africano de Dahomey de um inimigo estrangeiro.", "2h 14m" ,2022, 1, false));
		listaFilmes.add(new Filme("Adão Negro", "Ação/Fantasia", "Jaume Collet-Serra", "O poderoso Adão Negro é libertado de sua tumba para lançar sua justiça cruel sobre a Terra.", "2h 5m", 2022, 2, true));
		listaFilmes.add(new Filme("One Piece - Red", "Aventura/Ação", "Gorō Taniguchi", "Luffy e sua equipe assistem a um show onde a cantora Uta não é outra senão a filha de Shanks.", "1h 55m", 2022, 3, true));
		listaFilmes.add(new Filme("Convite Maldito", "Terror/Mistério", "Jessica M. Thompson", "Após um teste de DNA, Evie tem notícias de um primo distante e, melhor ainda, recebe um convite para um casamento luxuoso no campo. No entanto, pouco depois de chegar, Evie descobre a terrível verdade por trás do evento.", "1h 44m", 2022, 4, false));
		listaFilmes.add(new Filme("Halloween Ends", "Terror/Thriller", "David Gordon Green", "Depois de seu último encontro com Michael Myers, Laurie Strode finalmente decide se libertar e abraçar a vida. No entanto, um assassinato local desencadeia uma onda de violência e terror, forçando-a a enfrentar o mal que ela não pode controlar.", "1h 51m", 2022, 5, true));
		listaFilmes.add(new Filme("Sorria", "Terror", "Parker Finn", "Após um paciente sofrer um trauma, um médico começa a se distrair em seus próprios pensamentos.", "1h 55m", 2022, 6, false));
		
		return listaFilmes;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String getDiretor() {
		return this.diretor;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public String getDuracao() {
		return this.duracao;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public boolean getFilme3D() {
		return this.filme3D;
	}
	
	@Override
	public String toString() {
		return this.codigo + " - " + this.titulo;
	}
}

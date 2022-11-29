package ea3;

class IngressoVIP extends Ingresso {
	
	public IngressoVIP(Filme filme) {
		super(filme);
		this.ingressoInt = 48.00;
	}
	
	public IngressoVIP(Filme filme, double ingressoInt) {
		super(filme, ingressoInt);
	}
	
	public String acessoLanchonete() {
		return "Lanchonete do cinema liberada.";
	}
}
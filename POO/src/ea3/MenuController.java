package ea3;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuController {

	public static void main(String[] args) {
		Filme filmeEscolhido = selecionarFilme();
		boolean ingressoVIP = ingressoVIP(filmeEscolhido);
		comprarIngresso(filmeEscolhido, ingressoVIP);

	}
	
	public static Filme selecionarFilme() {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Filme> listaFilmes = Filme.getListaFilmes();
		Boolean[] codigoValido = {false};
		Boolean[] continuarCompra = {false};
		Filme[] filmeEscolhido = new Filme[1];
		
		while(codigoValido[0] == false || continuarCompra[0] == false) {
			System.out.println("\n Filmes disponíveis: \n");
			
			for(Filme filme: listaFilmes) {
				System.out.println(filme);
			}
			
			System.out.println("\n Digite o código do filme que deseja -> ");
			
			int inputCodigo = teclado.nextInt();
			
			listaFilmes.forEach((filme) -> {
				if(filme.getCodigo() == inputCodigo) {
					codigoValido[0] = true;
					filmeEscolhido[0] = filme;
					System.out.println("\nTítulo: " + filme.getTitulo());
					System.out.println("Gênero: " + filme.getGenero());
					System.out.println("Ano: " + filme.getAno());
					System.out.println("Diretor: " + filme.getDiretor());
					System.out.println("Descrição: " + filme.getDescricao());
					System.out.println("Duração: " + filme.getDuracao());
					if(filme.getFilme3D() == true) {
						System.out.println("Tipo de filme: 3D");
					}else {
						System.out.println("Tipo de filme: Comum");
					}
					
					System.out.println("\nDeseja continuar a compra? (1- Sim / 2- Não) ->");
					int inputContinuarCompra = teclado.nextInt();
					if(inputContinuarCompra == 1) {
						continuarCompra[0] = true;
					}
				};
			});
			
			if(codigoValido[0] == false) {
				System.out.println("Código inválido.\n");
			};
		}
		return filmeEscolhido[0];
	}

	public static boolean ingressoVIP(Filme filme) {
		Scanner teclado = new Scanner(System.in);
		boolean ingressoVIP = true;
		boolean opcaoValida = false;
		
		while (opcaoValida == false) {
			if(filme.getFilme3D() == false) {
				System.out.println("\nDeseja comprar: \n 1- Ingresso VIP (acesso à lanchonete liberado) \n 2- Ingresso Comum ");
				int inputIngressoVIP = teclado.nextInt();
				if(inputIngressoVIP == 2) {
					ingressoVIP = false;
					opcaoValida = true;
				}else if(inputIngressoVIP == 1) {
					opcaoValida = true;
				}
			}else {
				opcaoValida = true;
			}
		}
		return ingressoVIP;
	}
	
	public static void comprarIngresso(Filme filme, boolean ingressoVIP) {		
		Scanner teclado = new Scanner(System.in);
		boolean sessaoValida = false;
		Ingresso ingresso;
		
		if(ingressoVIP == true) { ingresso = new IngressoVIP(filme); }
		else { ingresso = new Ingresso(filme); }
		
		ArrayList<String> listaSessoes = ingresso.getSessoes();
		
		while(sessaoValida == false) {
			System.out.println("\nTítulo: " + ingresso.getFilme());
			
			System.out.println("\nValores do Ingresso: ");
			System.out.println("Inteira: R$" + ingresso.getIngressoInteira());
			System.out.println("Meia: R$" + ingresso.getIngressoMeia());
			System.out.println("Acesso à lanchonete do cinema: " + ingresso.acessoLanchonete());
			
			System.out.println("\nSessões Disponíveis: ");
			int numeroSessoes = listaSessoes.size();
			for (int i = 0; i < numeroSessoes; i++) {
	            System.out.println((i+1)+ "- " + listaSessoes.get(i)+ "h");
			}
			
			System.out.println("\nEscolha a quantidade de ingressos inteira ->: ");
			int inputIngressosInt = teclado.nextInt();
			System.out.println("\nEscolha a quantidade de ingressos meia ->: ");
			int inputIngressosMeia = teclado.nextInt();
			System.out.println("\nEscolha o número da sessão ->: ");
			int inputSessao = teclado.nextInt();
			
			if(inputSessao > 0 && inputSessao <= numeroSessoes && (inputIngressosInt > 0 || inputIngressosMeia > 0)) {
				sessaoValida = true;
				double ingressoInteira = ingresso.getIngressoInteira();
				double ingressoMeia = ingresso.getIngressoMeia();
				
				System.out.println("\nIngresso comprado! ");
				
				System.out.println("\nFilme: " + ingresso.getFilme());
				System.out.println("Sessão: " + listaSessoes.get(inputSessao - 1) + "h");
				if(inputIngressosInt > 0) {
					System.out.println("Ingressos Inteira: " + inputIngressosInt + "(R$" + ingressoInteira + ")");
				}
				if(inputIngressosMeia > 0) {
					System.out.println("Ingressos Meia: " + inputIngressosMeia + "(R$" + ingressoMeia + ")");
				}
				System.out.println("Valor total: R$" + ((inputIngressosInt * ingressoInteira) + (inputIngressosMeia * ingressoMeia)));
				System.out.println("Acesso à lanchonete do cinema: " + ingresso.acessoLanchonete());
				
			}else {
				System.out.println("\nSessão ou quantidade de ingressos inválida!");
			}
		}
	}
}

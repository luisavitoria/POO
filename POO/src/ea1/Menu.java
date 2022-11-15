package ea1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Exibe Lista de Filmes
		Boolean[] codigoValido = {false};
		Boolean[] continuarCompra = {false};
		Filme[] filmeEscolhido = new Filme[1];
		
		while(codigoValido[0] == false || continuarCompra[0] == false) {
			ArrayList<Filme> listaFilmes = Filme.getListaFilmes();  
			
			System.out.println("\n Filmes disponíveis: \n");
			
			for(Filme filme: listaFilmes) {
				System.out.println(filme);
			}
			
			System.out.println("\n Digite o código do filme que deseja -> ");
			
			int inputCodigo = teclado.nextInt();
			
			//Exibe detalhes do filme selecionado
			
			listaFilmes.forEach((filme) -> {
				if(filme.getCodigo() == inputCodigo) {
					codigoValido[0] = true;
					filmeEscolhido[0] = filme;
					System.out.println("\nTítulo: " + filme.getTitulo());
					System.out.println("Gênero: " + filme.getGenero());
					System.out.println("Ano: " + filme.getAno());
					System.out.println("Ingresso Inteira: R$" + filme.getIngressoInteira());
					System.out.println("Ingresso Meia: R$" + filme.getIngressoMeia());
					System.out.println("Sessões: " );
					for(String sessao: filme.getSessoes()) {
						System.out.println(sessao + "h");
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
		
		// Exibe detalhes do filme escolhido
		boolean sessaoValida = false;
		
		while(sessaoValida == false) {
			System.out.println("\nFilme Selecionado: ");
			System.out.println(filmeEscolhido[0].getTitulo());
			
			System.out.println("\nValores do Ingresso: ");
			System.out.println("Inteira: R$" + filmeEscolhido[0].getIngressoInteira());
			System.out.println("Meia: R$" + filmeEscolhido[0].getIngressoMeia());
			
			System.out.println("\nSessões Disponíveis: ");
			ArrayList<String> listaSessoes = filmeEscolhido[0].getSessoes();
			for (int i = 0; i < listaSessoes.size(); i++) {
	            System.out.println((i+1)+ "- " + listaSessoes.get(i)+ "h");
			}
			int numeroSessoes = listaSessoes.size();
			
			System.out.println("\nEscolha a quantidade de ingressos inteira ->: ");
			int inputIngressosInt = teclado.nextInt();
			System.out.println("\nEscolha a quantidade de ingressos meia ->: ");
			int inputIngressosMeia = teclado.nextInt();
			System.out.println("\nEscolha o número da sessão ->: ");
			int inputSessao = teclado.nextInt();
			
			if(inputSessao > 0 && inputSessao <= numeroSessoes && (inputIngressosInt > 0 || inputIngressosMeia > 0)) {
				sessaoValida = true;
				//Exibe detalhes do ingresso
				System.out.println("\nIngresso comprado! ");
				
				System.out.println("\nFilme: " + filmeEscolhido[0].getTitulo());
				System.out.println("Sessão: " + listaSessoes.get(inputSessao - 1) + "h");
				if(inputIngressosInt > 0) {
					System.out.println("Ingressos Inteira: " + inputIngressosInt + "(R$" + filmeEscolhido[0].getIngressoInteira() + ")");
				}
				if(inputIngressosMeia > 0) {
					System.out.println("Ingressos Meia: " + inputIngressosMeia + "(R$" + filmeEscolhido[0].getIngressoMeia() + ")");
				}
				System.out.println("Valor total: R$" + (inputIngressosInt * filmeEscolhido[0].getIngressoInteira() + inputIngressosMeia * filmeEscolhido[0].getIngressoMeia()));
				
			}else {
				System.out.println("\nSessão ou quantidade de ingressos inválida!");
			}
			
		}
		
		
	}

}

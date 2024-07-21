import java.util.Scanner;

public class Safari {
	Scanner sc = new Scanner(System.in);
	
	public void pesquisa() {
		System.out.println("Safari\r Insira a URL do site.");
		String endereco = sc.nextLine();
		System.out.println("Exibir URL da página\rAdicionar nova aba\rAtualizar página\rSair");
		
		
		boolean end = true;
		while(end == true) {
			
			String acoes = sc.nextLine();
			
			if(acoes.equals("Exibir URL da página")) {
				exibirPagina(endereco);
			}else if(acoes.equals("Adicionar nova aba")) {
				adicionarNovaAba();
			}else if(acoes.equals("Atualizar página")) {
				atualizarPagina(endereco);
			}else if(acoes.equals("Sair")) {
				System.out.println("Voltando ao menu");
				end = false;
			}else {
				System.out.println("Opção inválida");
			}
		}
	}

	public void exibirPagina(String url) {
		System.out.println("Se conectando com " + url + ".");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Criando uma nova aba");

	}
	
	public void atualizarPagina(String att) {
		System.out.println("Atualizando a página, URL: " + att);
	}
}

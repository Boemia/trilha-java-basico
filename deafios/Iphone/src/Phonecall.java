import java.util.Scanner;

public class Phonecall {

	Scanner sc = new Scanner(System.in);
	
	public void telefone() {
		System.out.println("Telefone\r Ligar\r Correio de voz\r Atender\r Sair");
		
		boolean end = true;
		while(end == true) {
		
			String escolha = sc.nextLine();
			if(escolha.equals("Ligar")) {
				ligar();
			}else if(escolha.equals("Correio de voz")) {
				iniciarCorreioVoz();
			}else if(escolha.equals("Atender")) {
				atender();
			}else if (escolha.equals("Sair")) {
				System.out.println("Voltando ao menu");
				end = false;
			}
		}
	}
	
	public void ligar() {
		System.out.println("Teclado\rLista de contatos");
		String tecladoLista = sc.nextLine();
			
		if(tecladoLista.equals("Teclado")) {
			System.out.println("Insira o número de telefone");
			int numero = sc.nextInt();
			System.out.println("Ligando para " + numero);
		}else if(tecladoLista.equals("Lista de contatos")) {
			System.out.println("Escolha o contato para ligar (Número)");
			String contato[] = {"Pai", "Mãe", "Claudio", "Marcia"};
			for(int i = 0; i < contato.length; i++) {
				System.out.println((i + 1) + " -  " + contato[i]);
			}
			int ligandoContato = sc.nextInt();
			if(ligandoContato > contato.length) {
				System.out.println("Contato inexistente");
			}else {
				System.out.println("Ligando para "+ contato[ligandoContato - 1]);
			}
			
		}
	}
	
	public void atender() {
		System.out.println("Ligação de número desconhecido.\r Atender\r Recusar");
		String ligacao = sc.nextLine();
		if(ligacao.equals("Atender")) {
			System.out.println("Alô\rLigação finalizada");
		}else if(ligacao.equals("Recusar")) {
			System.out.println("Ligação recusada");
		}
	}
	
	public void iniciarCorreioVoz() {
		int correioVoz = 10;
		boolean playCorreioVoz = true;
		System.out.println(correioVoz + " menssagens de correio de voz disponíveis, gostaria de reproduzir? Sim/Não");
		
		String ouvir = sc.nextLine();
		
		if(ouvir.equals("Sim")) {
			while(playCorreioVoz == true) {
				correioVoz--;
				System.out.println("Reproduzindo correio de voz, " + correioVoz + " menssagens restantes, gostaria de continuar ouvindo? Sim/Nâo");
				String correioConfirmacao = sc.nextLine();
				if(correioConfirmacao.equals("Não")) {
					playCorreioVoz = false;
				}
			}
		}else {
			playCorreioVoz = false;
		}
	
	}
}


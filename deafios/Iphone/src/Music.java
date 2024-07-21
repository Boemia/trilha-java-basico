import java.util.Scanner;

public class Music {
	Scanner sc = new Scanner(System.in);
		
		public void reprodutor() {
			System.out.println("Bem vindo ao app Músicas!\r Selecione a opção que deseja acessar:\r Selecionar música\r"
					+ " Tocar\r Pausar\r Próxima música\r Música anterior\r Aumentar o volume\r Diminuir volume\r Sair");
			
			boolean end = true;
			while(end == true) {
				
				String escolha = sc.nextLine();
				
				if(escolha.equals("Selecionar música")) {
					selecionarMusica();
				}else if(escolha.equals("Tocar")) {
					tocar();
				}else if(escolha.equals("Pausar")) {
					pausar();
				}else if(escolha.equals("Próxima música")) {
					proximaMusica();
				}else if(escolha.equals("Música anterior")) {
					voltarMusica();
				}else if(escolha.equals("Aumentar o volume")) {
					aumentarVolume();
				}else if(escolha.equals("Diminuir volume")) {
					diminuirVolume();
				}else if(escolha.equals("Sair")) {
					System.out.println("Voltando ao menu");
					end = false;
				}else {
					System.out.println("Opção inválida");
				}
			}
		}
	
		String musicas[] = {"Here comes the sun - The Beatles","Still D.R.E. - Dr. Dre","Gimme Shelter - The Rolling Stones"};
		int reproduzindo = 0;
		
		private void selecionarMusica() {
			System.out.println("Selecione uma das músicas salvas:\r Here comes the sun - The Beatles\r Still D.R.E. - Dr. Dre\r Gimme Shelter - The Rolling Stones");
			String musica = sc.nextLine();
			
			if(musica.equals("Here comes the sun")) {				
				reproduzindo = 0;
				System.out.println("Reproduzindo: " + musicas[reproduzindo]);					
			}else if(musica.equals("Still D.R.E.")) {				
				reproduzindo = 1;
				System.out.println("Reproduzindo: " + musicas[reproduzindo]);
			}else if(musica.equals("Gimme Shelter")) {				
				reproduzindo = 2;
				System.out.println("Reproduzindo: " + musicas[reproduzindo]);				
			}else {			
				System.out.println("Nenhuma música com este nome encontrada.");			
			}
		}
		
		private void tocar() {
			System.out.println("Continuando reprodução " + musicas[reproduzindo]);
		}
		
		private void pausar() {
			System.out.println("Música pausada");
		}
		
		private void proximaMusica() {
			if (reproduzindo < musicas.length-1) {
				reproduzindo++;
				System.out.println("Avançando para a próxima música: " + musicas[reproduzindo]);
			}else {
				reproduzindo = 0;
				System.out.println("Avançando para a próxima música:  " + musicas[reproduzindo]);
			}
		}
		
		private void voltarMusica() {
			if (reproduzindo == 0) {
				reproduzindo = 2;
				System.out.println("Voltando para música: " + musicas[reproduzindo]);
			}else {
				reproduzindo--;
				System.out.println("Voltando para música: " + musicas[reproduzindo]);
			}
		}
		
		int volume = 0;
		
		private void aumentarVolume() {
			if(volume < 100) {
				volume++;
				System.out.println("Volume aumentado para " + volume);
			}else {
				System.out.println("Volume máximo " + volume);
			}
		}
		
		private void diminuirVolume() {
			if(volume > 0) {
				volume--;
				System.out.println("Volume diminuido para " + volume);
			}else {
				System.out.println("Volume mínimo " + volume);
			}
		}
}

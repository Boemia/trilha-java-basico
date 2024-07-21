import java.util.Scanner;

public class Iphone {
	public static void main(String[] args) {
		Music musica = new Music();
		Phonecall telefone = new Phonecall();
		Safari busca = new Safari();
		
		Scanner sc = new Scanner(System.in);
		
		boolean end = true;
		while(end == true) {
			System.out.println("Bem vindo ao IPhone 2007\rDigite o app desejado:\rMusica\rTelefone\rSafari\rDesligar");
			String opcao = sc.nextLine();
			
			if(opcao.equals("Musica")) {
				musica.reprodutor();
			}else if(opcao.equals("Telefone")) {
				telefone.telefone();
			}else if(opcao.equals("Safari")) {
				busca.pesquisa();
			}else if(opcao.equals("Desligar")) {
				System.out.println("Até mais");
				end = false;
			}else {
				System.out.println("Opção inválida");
			}
		}
		
		sc.close();
	}
}

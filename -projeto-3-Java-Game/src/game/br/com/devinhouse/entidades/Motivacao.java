package game.br.com.devinhouse.entidades;

public class Motivacao {
	private String motivacao;
	String opcao1;
	
	public Motivacao() {	
	}
	
	public Motivacao(String motivacao) {
		this.motivacao = motivacao;
	}
	
	public void setMotivacao(String motivacao) {
		this.motivacao = motivacao;
	}
	
	public String getMotivacao() {
		return motivacao;
	}

	String motivacaoParte1(String motivacao) {
		
		if(motivacao == "VINGANÇA") {
			return opcao1 = "\n" 
							+" Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\n"
							+ "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\n"
							+ "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\n"
							+ "que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\n"
							+ "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\n"
							+ "finalmente pagará por tanto mal causado na vida de tantos e principalmente na sua.\n"; 
		} else if(motivacao == "GLÓRIA") {
			return opcao1 = "\n"
							+"Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\n"
							+"abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\n"
							+"diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\n"
							+"já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\n"
							+"o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\n"
							+"história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.\n";
		}
		return opcao1 = "A motivação é inválida!\n";
	}
	
	String motivacaoParte2(String motivacao) {
		
		if(motivacao == "VINGANÇA") {
			return opcao1 = " Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio\n"
						  + " e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.\n"; 
			
		} else if(motivacao == "GLÓRIA") {
			return opcao1 = "O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria.\n"
					      + "A glória o aguarda, você a conquistou.\n";
		}
		return opcao1 = "A motivação é inválida!\n";
	}
	
	
	void motivacaoParte3 (String motivacao, String sexo) {
		
		if(motivacao == "VINGANÇA") {
			System.out.println(" Não foi possível concluir sua vingança, agora resta saber se alguém se vingará por você."); 
			
		} else if(motivacao == "GLÓRIA") {
			
			switch(sexo) {
			case "Masculino": 
						System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói.");
						break;
			case "Feminino":
						System.out.println("A glória que buscavas não será sua, e a cidade aguarda por sua próxima heróina.");
						break;
			default:
						System.out.println("A motivação é inválida!");
			}
		}
	}
	
	
	
}

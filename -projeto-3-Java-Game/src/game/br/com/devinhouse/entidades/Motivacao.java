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
		
		if(motivacao == "VINGAN�A") {
			return opcao1 = "\n" 
							+" Imagens daquela noite tr�gica invadem sua mente. Voc� nem precisa se esfor�ar\n"
							+ "para lembrar, pois essas mem�rias est�o sempre presentes, mesmo que de pano de fundo,\n"
							+ "quando voc� tem outros pensamentos em foco, elas nunca o deixaram. Elas s�o o combust�vel\n"
							+ "que te fizeram chegar at� aqui. E voc� sabe que n�o ir� desistir at� ter vingado a morte daqueles\n"
							+ "que foram - e pra sempre ser�o - sua fonte de amor e desejo de continuar vivo. O maldito l�der\n"
							+ "finalmente pagar� por tanto mal causado na vida de tantos e principalmente na sua.\n"; 
		} else if(motivacao == "GL�RIA") {
			return opcao1 = "\n"
							+"Voc� j� consegue visualizar na sua mente o povo da cidade te recebendo de bra�os\n"
							+"abertos, bardos criando can��es sobre seus feitos her�icos, nobres te presenteando com j�ias e\n"
							+"diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilan�as. Desde\n"
							+"j�, voc� sente o amor do p�blico, te louvando a cada passo que d� pelas ruas, depois de destruir\n"
							+"o vil�o que tanto assombrou a paz de todos. Por�m, voc� sabe que ainda falta o �ltimo ato dessa\n"
							+"hist�ria. Voc� se concentra na miss�o. A gl�ria o aguarda, mas n�o antes da �ltima batalha.\n";
		}
		return opcao1 = "A motiva��o � inv�lida!\n";
	}
	
	String motivacaoParte2(String motivacao) {
		
		if(motivacao == "VINGAN�A") {
			return opcao1 = " Voc� obteve sua vingan�a. Voc� se ajoelha e cai no choro, invadido por uma sensa��o de al�vio\n"
						  + " e felicidade. Voc� se vingou, tudo que sempre quis, est� feito. Agora voc� pode seguir sua vida.\n"; 
			
		} else if(motivacao == "GL�RIA") {
			return opcao1 = "O �xtase em que voc� se encontra n�o cabe dentro de si. Voc� se ajoelha e grita de alegria.\n"
					      + "A gl�ria o aguarda, voc� a conquistou.\n";
		}
		return opcao1 = "A motiva��o � inv�lida!\n";
	}
	
	
	void motivacaoParte3 (String motivacao, String sexo) {
		
		if(motivacao == "VINGAN�A") {
			System.out.println(" N�o foi poss�vel concluir sua vingan�a, agora resta saber se algu�m se vingar� por voc�."); 
			
		} else if(motivacao == "GL�RIA") {
			
			switch(sexo) {
			case "Masculino": 
						System.out.println("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por seu pr�ximo her�i.");
						break;
			case "Feminino":
						System.out.println("A gl�ria que buscavas n�o ser� sua, e a cidade aguarda por sua pr�xima her�ina.");
						break;
			default:
						System.out.println("A motiva��o � inv�lida!");
			}
		}
	}
	
	
	
}

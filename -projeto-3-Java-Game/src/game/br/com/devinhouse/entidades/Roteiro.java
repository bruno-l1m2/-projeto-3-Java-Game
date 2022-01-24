package game.br.com.devinhouse.entidades;

public class Roteiro {
	
	public Roteiro() {
	}

	public void startRoteiro(String nivel, String nome, String sexo, String classe, String arma) {
		
		// Criando Personagem
		Guerreiro personagem;
		switch (classe) {
		case "Cavaleiro":
						personagem = new Cavaleiro(nome, sexo);
						break;
		case "Arqueiro":
						personagem = new Arqueiro(nome, sexo);
						break;
		case "Mago":
						personagem = new Mago(nome, sexo);
						break;		
		case "B�rbaro":	
						personagem = new Barbaro(nome, sexo);
						break;
			   
		case "Alquimista":
						personagem = new Alquimista(nome, sexo);
						break;
		default:
						personagem = new Cavaleiro(nome, sexo);
		}
	
		// Criando arma
		Arma arma_personagem;
		
		switch (arma) {
					case "Espada":
									arma_personagem = new Espada("Espada", 15);
									break;
					case "Machado":
									arma_personagem = new Machado("Machado", 18);
									break;
					case "Martelo":
									arma_personagem = new Martelo("Martelo", 17);
									break;		
					case "Clava":	
									arma_personagem = new Clava("Clava", 17);
									break;
					case "Arco":
									arma_personagem = new Arco("Arco",13, "Flecha");
									break;
					case "Besta":
									arma_personagem = new Besta("Besta",13,"Virote");
									break;
					case "Cajado":
									arma_personagem = new Cajado("Cajado",15);
									break;
					case "Livro":
									arma_personagem = new Livro("Livro", 15);
									break;
					case "Po��es":
									arma_personagem = new Pocoes("Po��es", 13);
									break;			
					default:
									arma_personagem = new Espada("Espada", 15);
						
		}	
		
		// Criando Motiva��o
		Motivacao motivacao = new Motivacao();
		
		// Sexo do Personagem
		String sexo1 = sexo;
		
		//Nivel do game
		String nivel1 = nivel;
		
		// Criando Menu
		Menu menu = new Menu();
		
		// Iniciado o Roteiro
		System.out.println("\n");
		System.out.println("A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo\n"
				           +"voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e\n"
				           +"sabe que a partir desse ponto, sua vida mudar� para sempre.\n");
		System.out.println("Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de\n"
							+ "todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu\n"
							+ "equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um\n"
							+ "passo de encerrar para sempre esse mal.\n");
		System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.\n");
		
		// Motiva��o
		String motiv = menu.menuMotivacao();
		motivacao.setMotivacao(motiv);
		System.out.println(motivacao.motivacaoParte1(motiv));
		
		System.out.println("Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas\n"
							+ "m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado.\n"
							+ "Voc� avan�a pelo portal.\n");
		System.out.println("A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua\n"
							+ "frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir �\n"
							+ "frente, ou desistir.\n");
		
		// Escolha Seguir ou Fugir
		String escolha1 = menu.menuEscolha1();
		if(escolha1 == "Seguir") {
			System.out.println("Voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente\n"
								+ "uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta\n"
								+ "aberta.\n");
		} else {
			System.out.println("O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio.\n"
								+ "Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.\n");
			return;
		}
		
		System.out.println("Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\n"
						  + "sobre como passar pela porta.\n");
		
		// Escolha Andar, Correr ou Saltar
		String escolha2 = menu.menuEscolha2();
		if(escolha2 == "Andando") {
			System.out.println("Voc� toma cuidado e vai caminhando vagarosamente em dire��o � luz. Quando voc�\n"
								+ "pisa exatamente embaixo da porta, voc� sente o ch�o ceder levemente, como se tivesse pisado\n"
								+ "em uma pedra solta. Voc� ouve um ru�do de mecanismos se movimentando, e uma escotilha se\n"
								+ "abre no teto atr�s de voc�, no corredor. Flechas voam da escotilha em sua dire��o, e voc� salta\n"
								+ "para dentro da sala, por�m uma delas te acerta na perna.\n");
			
			//Dano de Flecha [O rolamento de dados � s� de 1-10]
			combateTurno(personagem);
			
		} else if(escolha2 == "Correndo") {
			System.out.println("Voc� respira fundo e desata a correr em dire��o � sala. Quando passa pela porta,\n"
								+ "sente que pisou em uma pedra solta, mas n�o d� muita import�ncia e segue para dentro da sala,\n"
								+ "olhando ao redor � procura de inimigos. N�o tem ningu�m, mas voc� ouve sons de flechas\n"
								+ "batendo na pedra atr�s de voc�, e quando se vira, v� v�rias flechas no ch�o. Espiando pela\n"
								+ "porta, voc� entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no\n"
								+ "teto, mas por sorte voc� entrou correndo e conseguiu escapar desse ataque surpresa.\n");
			
		} else if(escolha2 == "Saltando") {
			System.out.println("Voc� se concentra e pula em dire��o � luz, saltando de antes da porta at� o interior da sala.");
			
		}
		System.out.println("\n");
		System.out.println("Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas\n"
							+ " foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A\n"
							+ "porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc�\n"
							+ "n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima\n"
							+ "da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que\n"
							+ "precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\n"
							+ "enfrentar o l�der.\n");

		System.out.println("Voc� se dirige para a porta � direita.\n");
		
		System.out.println("Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada.\n"
							+ "Segura com mais for�a sua arma com uma m�o, enquanto empurra a porta com a\n"
							+ "outra. Ao entrar, voc� se depara com uma sala espa�osa, com v�rios equipamentos de batalha\n"
							+ "pendurados nas paredes e dispostos em arm�rios e mesas. Voc� imagina que este seja o arsenal\n"
							+ "do inimigo, onde est�o guardados os equipamentos que seus soldados utilizam quando saem\n"
							+ "para espalhar o terror nas cidades e vilas da regi�o.\n");
		System.out.println("Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar\n"
							+ "para tr�s. Ali, de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um\n"
							+ "dos capit�es do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\n"
							+ "posi��o de combate. Ele avan�a em sua dire��o.\n");
		
		// Criar Inimigo
		Orque inimigo = new Orque();
		Arma arma_inimigo = new Espada("Espada",13);
		//[entra no loop de combate]
		boolean game = combateTurno(personagem, inimigo, arma_personagem, arma_inimigo, motiv, sexo1, nivel);
		if(!game) {
			return;
		}
		
		System.out.println("Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha\n"
							+ "em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
		
		//[jogador escolhe pegar ou n�o as armaduras novas]
		boolean escolha3 = menu.menuEscolha3();
		if(escolha3) {
			personagem.setDefesa(5);
		}
		
		System.out.println("Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras\n"
							+ " da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto.\n");
		System.out.println("Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, tentando\n"
							+ "ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais for�a sua\n"
							+ "arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara\n"
							+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem v�rios potes e\n"
							+ "garrafas de vidro com conte�dos misteriosos e de cores diversas, e voc� entende que o capit�o\n"
							+ "que vive ali, realiza experimentos com diversos ingredientes, criando po��es utilizadas pelos\n"
							+ "soldados para aterrorizar a regi�o.\n"
							+ "No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo. Um orque\n"
							+ "horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a em sua dire��o.\n");
		
		// Criar Inimigo
		Orque inimigo2 = new Orque();
		Arma arma_inimigo2 = new Cajado();
		//[entra no loop de combate]
		game = combateTurno(personagem, inimigo2, arma_personagem, arma_inimigo2, motiv, sexo1, nivel1);
		if(!game) {
			return;
		}
		
		System.out.println("Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque\n"
							+ "do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido\n"
							+ "levemente rosado, pega a garrafa e pondera se deve beber um gole.\n");
		
		//[jogador escolhe entre beber ou n�o]
		boolean escolha4 = menu.menuEscolha4();
		if(escolha4) {
			personagem.setRecupervida(100);
		}
				
		System.out.println("Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave\n"
							+ "abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa\n"
							+ "que leva presa ao cinto.\n");
		System.out.println("De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a\n"
							+ "porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc�\n"
							+ "percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca\n"
							+ "no combate que voc� sabe que ir� se seguir, e adentra a porta.\n");
		System.out.println("L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\n"
							+ "prisioneiros acorrentados �s paredes.\n");
		System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.");
		
		//[jogador deve decidir se ataca ou espera]
		boolean escolha5 = menu.menuEscolha5();
		
		// Criar Inimigo
		Orque inimigo3 = new Orque();
		Arma arma_inimigo3 = new Machado();
		//[entra no loop de combate]
		
		game = combateTurno(personagem, inimigo3, arma_personagem, arma_inimigo3, escolha5, motiv, sexo1, nivel1);
		if(!game) {
			return;
		}
		System.out.println("Voc� conseguiu!");
		
		//[MENSAGEM DE VIT�RIA DE ACORDO COM A MOTIVA��O]
		System.out.println(motivacao.motivacaoParte2(motiv));
		System.out.println("Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em\n"
							+ "dire��o � noite, retornando � cidade. Seu dever est� cumprido.");	
	}	

	public void combateTurno(Guerreiro personagem) {
		// Criando Combate
		Combate combate = new Combate();
		int dano = combate.rolamentoDado(10);
		if(dano == 1) {
				System.out.println("Voc� n�o sofreu dano.");
		} else {
				personagem.setDanos(dano);
				System.out.printf("Voc� sofreu %d de dano e agora possui %d pontos vida.", dano, personagem.getVida());
		}
	}
	
	//Combate em Turno 1
	public boolean combateTurno(Guerreiro personagem, Orque inimigo, Arma arma_personagem, Arma arma_inimigo, String motivacao, String sexo, String nivel) {
		
		boolean batalha = true;
		
		// Nivel do Game
		Niveldogame nivel_game = new Niveldogame(nivel); 
		
		// Criando Motiva��o
		
		Motivacao motiv = new Motivacao();
		
		// Criando Combate
		Combate combate = new Combate();
		
		// Criando Menu
		Menu menu = new Menu();
		while(personagem.getVida() > 0 && inimigo.getVida() > 0) {
			String partida = menu.menuPartida();
			if (partida == "Fugir") {
				personagem.setDanos(personagem.getVida());
				System.out.println("Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
				return  batalha = false;
			} else {
				int dano = combate.rolamentoDado(20);
				if(dano == 1) {	
						System.out.println("Voc� errou seu ataque! O inimigo n�o sofreu dano algum.");
				} else if(dano == 20) {
						dano += arma_personagem.getAtaque();
						dano += personagem.getAtaque();
						if(nivel_game.getNivel() == 10) {
							   dano -= (int)((dano*10)/100);	
						}
						inimigo.setDanos(dano);
						switch(arma_personagem.getNome()) {
						case "Espada":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Machado":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Martelo":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;		
						case "Clava":	
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Arco":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Besta":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Cajado":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s lan�ando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Livro":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s absorvendo energia do livro com uma m�o e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Po��es":
										System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s lan�ando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;			
						default:
										System.out.println("Opc�o de arma invalido!");
						}
				} else {
						dano += arma_personagem.getAtaque();
						dano += personagem.getAtaque();
					    dano -= inimigo.getDefesa();
					    if(nivel_game.getNivel() == 10) {
							   dano -= (int)((dano*10)/100);	
						}
						inimigo.setDanos(dano);
						switch(arma_personagem.getNome()) {
						case "Espada":
										System.out.printf("Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Machado":
										System.out.printf("Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Martelo":
										System.out.printf("Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;		
						case "Clava":	
										System.out.printf("Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Arco":
										System.out.printf("Voc� atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Besta":
										System.out.printf("Voc� atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Cajado":
										System.out.printf("Voc� atacou com seu %s lan�ando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Livro":
										System.out.printf("Voc� atacou com seu %s absorvendo energia do livro com uma m�o e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Po��es":
										System.out.printf("Voc� atacou com sua %s lan�ando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;			
						default:
										System.out.println("Opc�o de arma invalido!");
						}	
				}
				if(inimigo.getVida() > 0) {
							dano = combate.rolamentoDado(20);
							if(dano == 1) {
								System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");
							} else if(dano == 20) {
								dano += arma_inimigo.getAtaque();
								dano += inimigo.getAtaque();
								if(nivel_game.getNivel() == 20) {
								   dano -= (int)((dano*20)/100);	
								}
								personagem.setDanos(dano);
								
								System.out.printf("Voc� tomou um ataque cr�tico! Voc� sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
							} else {
								dano += arma_inimigo.getAtaque();
								dano += inimigo.getAtaque();
							    dano -= personagem.getDefesa();
							    if(nivel_game.getNivel() == 20) {
									   dano -= (int)((dano*20)/100);	
								}
								personagem.setDanos(dano);
								System.out.printf("O inimigo atacou! Voc� sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
							}
							
							if(personagem.getVida() <= 0) {
								motiv.motivacaoParte3(motivacao, sexo);
								
								batalha = false;
							}
				} else {
					System.out.println("O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.");
					batalha = true;
				}
			}
		}
		return batalha;
	}
	
	//Combate em Turno 2
		public boolean combateTurno(Guerreiro personagem, Orque inimigo, Arma arma_personagem, Arma arma_inimigo, boolean escolha, String motivacao, String sexo, String nivel) {
			boolean batalha = true;
			
			// Criando Motiva��o
			
			Motivacao motiv = new Motivacao();
			
			// Nivel do Game
			Niveldogame nivel_game = new Niveldogame(nivel);
			
			// Criando Combate
			Combate combate = new Combate();
				
			// Criando Menu
			Menu menu = new Menu();
			
			if (!escolha) {
				int dano = combate.rolamentoDado(20);
				if(dano == 1) {
					System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");
				} else if(dano == 20) {
					dano += arma_inimigo.getAtaque();
					dano += inimigo.getAtaque();
					if(nivel_game.getNivel() == 20) {
						   dano -= (int)((dano*20)/100);	
					}
					personagem.setDanos(dano);
					System.out.printf("Voc� tomou um ataque cr�tico! Voc� sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
				} else {
					dano += arma_inimigo.getAtaque();
					dano += inimigo.getAtaque();
				    dano -= personagem.getDefesa();
				    if(nivel_game.getNivel() == 20) {
						   dano -= (int)((dano*20)/100);	
					}
					personagem.setDanos(dano);
					System.out.printf("O inimigo atacou! Voc� sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
				}
			}
			while(personagem.getVida() > 0 && inimigo.getVida() > 0) {
				String partida = menu.menuPartida();
				if (partida == "Fugir") {
					personagem.setDanos(personagem.getVida());
					System.out.println("Voc� n�o estava preparado para a for�a do inimigo, e decide fugir para que possa tentar novamente em uma pr�xima vez.");
					return  batalha = false;
				} else {
					int dano = combate.rolamentoDado(20);
					if(dano == 1) {	
							System.out.println("Voc� errou seu ataque! O inimigo n�o sofreu dano algum.");
					} else if(dano == 20) {
							dano += arma_personagem.getAtaque();
							dano += personagem.getAtaque();
							if(nivel_game.getNivel() == 10) {
								   dano -= (int)((dano*10)/100);	
								}
							inimigo.setDanos(dano);
							switch(arma_personagem.getNome()) {
							case "Espada":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Machado":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Martelo":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;		
							case "Clava":	
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Arco":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Besta":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Cajado":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s lan�ando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Livro":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com seu %s absorvendo energia do livro com uma m�o e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Po��es":
											System.out.printf("Voc� acertou um ataque cr�tico! Voc� atacou com sua %s lan�ando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;			
							default:
											System.out.println("Opc�o de arma invalido!");
							}
					} else {
							dano += arma_personagem.getAtaque();
							dano += personagem.getAtaque();
						    dano -= inimigo.getDefesa();
						    if(nivel_game.getNivel() == 10) {
								   dano -= (int)((dano*10)/100);	
								}
							inimigo.setDanos(dano);
							switch(arma_personagem.getNome()) {
							case "Espada":
											System.out.printf("Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Machado":
											System.out.printf("Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Martelo":
											System.out.printf("Voc� atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;		
							case "Clava":	
											System.out.printf("Voc� atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Arco":
											System.out.printf("Voc� atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Besta":
											System.out.printf("Voc� atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Cajado":
											System.out.printf("Voc� atacou com seu %s lan�ando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Livro":
											System.out.printf("Voc� atacou com seu %s absorvendo energia do livro com uma m�o e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Po��es":
											System.out.printf("Voc� atacou com sua %s lan�ando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;			
							default:
											System.out.println("Opc�o de arma invalido!");
							}	
					}
					if(inimigo.getVida() > 0) {
						dano = combate.rolamentoDado(20);
						if(dano == 1) {
							System.out.println("O inimigo errou o ataque! Voc� n�o sofreu dano.");
						} else if(dano == 20) {
							dano += arma_inimigo.getAtaque();
							dano += inimigo.getAtaque();
							if(nivel_game.getNivel() == 20) {
								   dano -= (int)((dano*20)/100);	
								}
							personagem.setDanos(dano);
							System.out.printf("Voc� tomou um ataque cr�tico! Voc� sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
						} else {
							dano += arma_inimigo.getAtaque();
							dano += inimigo.getAtaque();
						    dano -= personagem.getDefesa();
						    if(nivel_game.getNivel() == 20) {
								   dano -= (int)((dano*20)/100);	
								}
							personagem.setDanos(dano);
							System.out.printf("O inimigo atacou! Voc� sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
						}
						if(personagem.getVida() <= 0) {
							motiv.motivacaoParte3(motivacao, sexo);
							batalha = false;
						}	
					} else {
						System.out.println("O inimigo n�o � p�reo para o seu hero�smo, e jaz im�vel aos seus p�s.");
						batalha = true;
					}
				}
			}
			return batalha;
		}	
}
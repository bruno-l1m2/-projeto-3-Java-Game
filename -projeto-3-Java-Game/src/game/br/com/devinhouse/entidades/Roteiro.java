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
		case "Bárbaro":	
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
					case "Poções":
									arma_personagem = new Pocoes("Poções", 13);
									break;			
					default:
									arma_personagem = new Espada("Espada", 15);
						
		}	
		
		// Criando Motivação
		Motivacao motivacao = new Motivacao();
		
		// Sexo do Personagem
		String sexo1 = sexo;
		
		//Nivel do game
		String nivel1 = nivel;
		
		// Criando Menu
		Menu menu = new Menu();
		
		// Iniciado o Roteiro
		System.out.println("\n");
		System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo\n"
				           +"você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e\n"
				           +"sabe que a partir desse ponto, sua vida mudará para sempre.\n");
		System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de\n"
							+ "todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu\n"
							+ "equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um\n"
							+ "passo de encerrar para sempre esse mal.\n");
		System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.\n");
		
		// Motivação
		String motiv = menu.menuMotivacao();
		motivacao.setMotivacao(motiv);
		System.out.println(motivacao.motivacaoParte1(motiv));
		
		System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas\n"
							+ "mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\n"
							+ "Você avança pelo portal.\n");
		System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua\n"
							+ "frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à\n"
							+ "frente, ou desistir.\n");
		
		// Escolha Seguir ou Fugir
		String escolha1 = menu.menuEscolha1();
		if(escolha1 == "Seguir") {
			System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\n"
								+ "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\n"
								+ "aberta.\n");
		} else {
			System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.\n"
								+ "Você se volta para a noite lá fora e corre em direção à segurança.\n");
			return;
		}
		
		System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\n"
						  + "sobre como passar pela porta.\n");
		
		// Escolha Andar, Correr ou Saltar
		String escolha2 = menu.menuEscolha2();
		if(escolha2 == "Andando") {
			System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\n"
								+ "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\n"
								+ "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\n"
								+ "abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta\n"
								+ "para dentro da sala, porém uma delas te acerta na perna.\n");
			
			//Dano de Flecha [O rolamento de dados é só de 1-10]
			combateTurno(personagem);
			
		} else if(escolha2 == "Correndo") {
			System.out.println("Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\n"
								+ "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\n"
								+ "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas\n"
								+ "batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela\n"
								+ "porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no\n"
								+ "teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.\n");
			
		} else if(escolha2 == "Saltando") {
			System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
			
		}
		System.out.println("\n");
		System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas\n"
							+ " foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A\n"
							+ "porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você\n"
							+ "não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima\n"
							+ "da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que\n"
							+ "precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\n"
							+ "enfrentar o líder.\n");

		System.out.println("Você se dirige para a porta à direita.\n");
		
		System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
							+ "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a\n"
							+ "outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha\n"
							+ "pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal\n"
							+ "do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\n"
							+ "para espalhar o terror nas cidades e vilas da região.\n");
		System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar\n"
							+ "para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um\n"
							+ "dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\n"
							+ "posição de combate. Ele avança em sua direção.\n");
		
		// Criar Inimigo
		Orque inimigo = new Orque();
		Arma arma_inimigo = new Espada("Espada",13);
		//[entra no loop de combate]
		boolean game = combateTurno(personagem, inimigo, arma_personagem, arma_inimigo, motiv, sexo1, nivel);
		if(!game) {
			return;
		}
		
		System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha\n"
							+ "em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
		
		//[jogador escolhe pegar ou não as armaduras novas]
		boolean escolha3 = menu.menuEscolha3();
		if(escolha3) {
			personagem.setDefesa(5);
		}
		
		System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras\n"
							+ " da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.\n");
		System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando\n"
							+ "ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua\n"
							+ "arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara\n"
							+ "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e\n"
							+ "garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão\n"
							+ "que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos\n"
							+ "soldados para aterrorizar a região.\n"
							+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\n"
							+ "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.\n");
		
		// Criar Inimigo
		Orque inimigo2 = new Orque();
		Arma arma_inimigo2 = new Cajado();
		//[entra no loop de combate]
		game = combateTurno(personagem, inimigo2, arma_personagem, arma_inimigo2, motiv, sexo1, nivel1);
		if(!game) {
			return;
		}
		
		System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque\n"
							+ "do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido\n"
							+ "levemente rosado, pega a garrafa e pondera se deve beber um gole.\n");
		
		//[jogador escolhe entre beber ou não]
		boolean escolha4 = menu.menuEscolha4();
		if(escolha4) {
			personagem.setRecupervida(100);
		}
				
		System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave\n"
							+ "abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa\n"
							+ "que leva presa ao cinto.\n");
		System.out.println("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a\n"
							+ "porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você\n"
							+ "percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca\n"
							+ "no combate que você sabe que irá se seguir, e adentra a porta.\n");
		System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\n"
							+ "prisioneiros acorrentados às paredes.\n");
		System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");
		
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
		System.out.println("Você conseguiu!");
		
		//[MENSAGEM DE VITÓRIA DE ACORDO COM A MOTIVAÇÃO]
		System.out.println(motivacao.motivacaoParte2(motiv));
		System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em\n"
							+ "direção à noite, retornando à cidade. Seu dever está cumprido.");	
	}	

	public void combateTurno(Guerreiro personagem) {
		// Criando Combate
		Combate combate = new Combate();
		int dano = combate.rolamentoDado(10);
		if(dano == 1) {
				System.out.println("Você não sofreu dano.");
		} else {
				personagem.setDanos(dano);
				System.out.printf("Você sofreu %d de dano e agora possui %d pontos vida.", dano, personagem.getVida());
		}
	}
	
	//Combate em Turno 1
	public boolean combateTurno(Guerreiro personagem, Orque inimigo, Arma arma_personagem, Arma arma_inimigo, String motivacao, String sexo, String nivel) {
		
		boolean batalha = true;
		
		// Nivel do Game
		Niveldogame nivel_game = new Niveldogame(nivel); 
		
		// Criando Motivação
		
		Motivacao motiv = new Motivacao();
		
		// Criando Combate
		Combate combate = new Combate();
		
		// Criando Menu
		Menu menu = new Menu();
		while(personagem.getVida() > 0 && inimigo.getVida() > 0) {
			String partida = menu.menuPartida();
			if (partida == "Fugir") {
				personagem.setDanos(personagem.getVida());
				System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
				return  batalha = false;
			} else {
				int dano = combate.rolamentoDado(20);
				if(dano == 1) {	
						System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
				} else if(dano == 20) {
						dano += arma_personagem.getAtaque();
						dano += personagem.getAtaque();
						if(nivel_game.getNivel() == 10) {
							   dano -= (int)((dano*10)/100);	
						}
						inimigo.setDanos(dano);
						switch(arma_personagem.getNome()) {
						case "Espada":
										System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Machado":
										System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Martelo":
										System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;		
						case "Clava":	
										System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Arco":
										System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Besta":
										System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Cajado":
										System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s lançando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Livro":
										System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Poções":
										System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s lançando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;			
						default:
										System.out.println("Opcão de arma invalido!");
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
										System.out.printf("Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Machado":
										System.out.printf("Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Martelo":
										System.out.printf("Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;		
						case "Clava":	
										System.out.printf("Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Arco":
										System.out.printf("Você atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Besta":
										System.out.printf("Você atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
										break;
						case "Cajado":
										System.out.printf("Você atacou com seu %s lançando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Livro":
										System.out.printf("Você atacou com seu %s absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;
						case "Poções":
										System.out.printf("Você atacou com sua %s lançando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
										break;			
						default:
										System.out.println("Opcão de arma invalido!");
						}	
				}
				if(inimigo.getVida() > 0) {
							dano = combate.rolamentoDado(20);
							if(dano == 1) {
								System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
							} else if(dano == 20) {
								dano += arma_inimigo.getAtaque();
								dano += inimigo.getAtaque();
								if(nivel_game.getNivel() == 20) {
								   dano -= (int)((dano*20)/100);	
								}
								personagem.setDanos(dano);
								
								System.out.printf("Você tomou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
							} else {
								dano += arma_inimigo.getAtaque();
								dano += inimigo.getAtaque();
							    dano -= personagem.getDefesa();
							    if(nivel_game.getNivel() == 20) {
									   dano -= (int)((dano*20)/100);	
								}
								personagem.setDanos(dano);
								System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
							}
							
							if(personagem.getVida() <= 0) {
								motiv.motivacaoParte3(motivacao, sexo);
								
								batalha = false;
							}
				} else {
					System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
					batalha = true;
				}
			}
		}
		return batalha;
	}
	
	//Combate em Turno 2
		public boolean combateTurno(Guerreiro personagem, Orque inimigo, Arma arma_personagem, Arma arma_inimigo, boolean escolha, String motivacao, String sexo, String nivel) {
			boolean batalha = true;
			
			// Criando Motivação
			
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
					System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
				} else if(dano == 20) {
					dano += arma_inimigo.getAtaque();
					dano += inimigo.getAtaque();
					if(nivel_game.getNivel() == 20) {
						   dano -= (int)((dano*20)/100);	
					}
					personagem.setDanos(dano);
					System.out.printf("Você tomou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
				} else {
					dano += arma_inimigo.getAtaque();
					dano += inimigo.getAtaque();
				    dano -= personagem.getDefesa();
				    if(nivel_game.getNivel() == 20) {
						   dano -= (int)((dano*20)/100);	
					}
					personagem.setDanos(dano);
					System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
				}
			}
			while(personagem.getVida() > 0 && inimigo.getVida() > 0) {
				String partida = menu.menuPartida();
				if (partida == "Fugir") {
					personagem.setDanos(personagem.getVida());
					System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
					return  batalha = false;
				} else {
					int dano = combate.rolamentoDado(20);
					if(dano == 1) {	
							System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
					} else if(dano == 20) {
							dano += arma_personagem.getAtaque();
							dano += personagem.getAtaque();
							if(nivel_game.getNivel() == 10) {
								   dano -= (int)((dano*10)/100);	
								}
							inimigo.setDanos(dano);
							switch(arma_personagem.getNome()) {
							case "Espada":
											System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Machado":
											System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Martelo":
											System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;		
							case "Clava":	
											System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Arco":
											System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Besta":
											System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Cajado":
											System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s lançando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Livro":
											System.out.printf("Você acertou um ataque crítico! Você atacou com seu %s absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Poções":
											System.out.printf("Você acertou um ataque crítico! Você atacou com sua %s lançando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;			
							default:
											System.out.println("Opcão de arma invalido!");
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
											System.out.printf("Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Machado":
											System.out.printf("Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Martelo":
											System.out.printf("Você atacou com seu %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;		
							case "Clava":	
											System.out.printf("Você atacou com sua %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Arco":
											System.out.printf("Você atacou com seu %s, a %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Besta":
											System.out.printf("Você atacou com sua %s, o %s e causou %d de dano no inimigo!\n", arma_personagem.getNome(), arma_personagem.getMunicao(), dano);
											break;
							case "Cajado":
											System.out.printf("Você atacou com seu %s lançando uma bola de fogo e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Livro":
											System.out.printf("Você atacou com seu %s absorvendo energia do livro com uma mão e liberando com a outra e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;
							case "Poções":
											System.out.printf("Você atacou com sua %s lançando uma veneno e causou %d de dano no inimigo!\n", arma_personagem.getNome(), dano);
											break;			
							default:
											System.out.println("Opcão de arma invalido!");
							}	
					}
					if(inimigo.getVida() > 0) {
						dano = combate.rolamentoDado(20);
						if(dano == 1) {
							System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
						} else if(dano == 20) {
							dano += arma_inimigo.getAtaque();
							dano += inimigo.getAtaque();
							if(nivel_game.getNivel() == 20) {
								   dano -= (int)((dano*20)/100);	
								}
							personagem.setDanos(dano);
							System.out.printf("Você tomou um ataque crítico! Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
						} else {
							dano += arma_inimigo.getAtaque();
							dano += inimigo.getAtaque();
						    dano -= personagem.getDefesa();
						    if(nivel_game.getNivel() == 20) {
								   dano -= (int)((dano*20)/100);	
								}
							personagem.setDanos(dano);
							System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.\n", dano, personagem.getVida());
						}
						if(personagem.getVida() <= 0) {
							motiv.motivacaoParte3(motivacao, sexo);
							batalha = false;
						}	
					} else {
						System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
						batalha = true;
					}
				}
			}
			return batalha;
		}	
}
package game.br.com.devinhouse.entidades;

import java.util.Scanner;


public class Menu {
	
	Scanner entrada = new Scanner(System.in);
	
	public Menu(){	
	}
	
	// Menu - n�vel de dificuldade
	public String menuNivel() {
		int opcao;
		String nivel = "";
		String menu_nivel =  " _______________________________________\n";
			   menu_nivel += "|Escolha o n�vel de dificuldade do game:|\n";
			   menu_nivel += "|                                       |\n";
			   menu_nivel += "| 1 - N�vel F�cil                       |\n";
			   menu_nivel += "| 2 - N�vel Normal.                     |\n";
			   menu_nivel += "| 3 - N�vel Dif�cil.                    |\n";
			   menu_nivel += "|_______________________________________|\n";
		// Definir o n�vel de dificuldade
		do {
			System.out.println(menu_nivel);
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1: 
						nivel = "F�cil";
						opcao = 9999;
						break;
				case 2:	
						nivel = "Normal";
						opcao = 9999;
						break;
				case 3:
						nivel = "Dif�cil";
						opcao = 9999;
						break;
				default:
						System.out.println("Op��o do n�vel inv�lida, tente novamente.");
			}
		} while(opcao != 9999);
		return nivel;
	}
	
	// Definir o nome do personagem
	public String menuNome() {
		
				System.out.println(" ________________________________");
				System.out.println("|                                |");
				System.out.println("|  Digite o nome do personagem:  |");
				System.out.println("|________________________________|");
				String nome = entrada.next();
				return nome;
	}
	
	// Menu - tipo de sexo
	public String menuSexo() {
				int opcao;
				String sexo ="";
				 String  menu_sexo = " _____________________________\n";
						menu_sexo += "|Escolha o sexo do personagem:|\n";
						menu_sexo += "|                             |\n";
						menu_sexo += "| 1 - Masculino.              |\n";
						menu_sexo += "| 2 - Feminino.               |\n";
						menu_sexo += "|_____________________________|\n";
				// Definir o sexo do personagem
				do {
					System.out.println(menu_sexo);
					opcao = entrada.nextInt();
					switch (opcao) {
						case 1:
							   sexo = "Masculino";
							   opcao=9999;
							   break;
						case 2:
							   sexo = "Feminino";
							   opcao=9999;
							   break;
						default:
							   System.out.println("Op��o do sexo inv�lida, tente novamente.");
					}	
				} while(opcao != 9999);
				return sexo;
	}
	
	// Menu - classe de combate
	public String menuClasse() {
		        int opcao;
		        String classe = "";
				String menu_personagem = " ______________________________\n";
					  menu_personagem += "|Escolha uma classe de combate:|\n";
					  menu_personagem += "|                              |\n";
					  menu_personagem += "| 1 - Cavaleiro.               |\n";
					  menu_personagem += "| 2 - Arqueiro.                |\n";
					  menu_personagem += "| 3 - Mago.                    |\n";
					  menu_personagem += "| 4 - B�rbaro.                 |\n";
					  menu_personagem += "| 5 - Alquimista.              |\n";
					  menu_personagem += "|______________________________|\n";
				
				// Definir a classe de combate
				do {
					System.out.println(menu_personagem);
					opcao = entrada.nextInt();
					switch (opcao) {
						case 1: 
								classe = "Cavaleiro";
								opcao = 9999;
								break;
						case 2:
								classe = "Arqueiro";
								opcao = 9999;
								break;
						case 3:
								classe = "Mago";
								opcao = 9999;
								break;
								
						case 4:
								classe = "B�rbaro";
								opcao = 9999;
								break;
							   
						case 5:
								classe = "Alquimista";
							    opcao = 9999;
							    break;
						default:
							    System.out.println("Op��o da Classe de Combate inv�lida, tente novamente.");
					}		
				} while(opcao != 9999);
				return classe;
	}
	
	// Menu - Arma
	public String menuArma(String classe) {
		
		String opcao = classe;
		int opcao2;
		int opcao3=0;
		String arma = "";
		
		// Menu - Arma Cavaleiro
		  String menu_arma_c = " __________________________\n";
				menu_arma_c += "|Escolha arma do Cavaleiro:|\n";
				menu_arma_c += "|                          |\n";
				menu_arma_c += "|  1 - Espada.             |\n";
				menu_arma_c += "|  2 - Lan�a.              |\n";
				menu_arma_c += "|__________________________|\n";
		
		// Menu - Arma Arqueiro
		  String menu_arma_a = " _________________________\n";
				menu_arma_a += "|Escolha arma do Arqueiro:|\n";
				menu_arma_a += "|                         |\n";
				menu_arma_a += "| 1 - Arco e Flecha.      |\n";
				menu_arma_a += "| 2 - Besta e Virote.     |\n";
				menu_arma_a += "|_________________________|\n";
		
		// Menu - Arma Mago
		  String menu_arma_m = " _____________________\n";
				menu_arma_m += "|Escolha arma do Mago:|\n";
				menu_arma_m += "|                     |\n";
				menu_arma_m += "|  1 - Cajado.        |\n";
				menu_arma_m += "|  2 - Livro.         |\n";
				menu_arma_m += "|_____________________|\n";
		
		// Menu - Arma B�rbaro
		  String menu_arma_b = " ________________________\n";
				menu_arma_b += "|Escolha arma do B�rbaro:|\n";
				menu_arma_b += "|                        |\n";
				menu_arma_b += "|  1 - Machado.          |\n";
				menu_arma_b += "|  2 - Martelo.          |\n";
				menu_arma_b += "|  3 - Clava.            |\n";
				menu_arma_b += "|________________________|\n";
		
		// Menu - Arma Alquimista
		  String menu_arma_al = " ___________________________\n";
				menu_arma_al += "|Escolha arma do Alquimista:|\n";
				menu_arma_al += "|                           |\n";
				menu_arma_al += "|  1 - Livro.               |\n";
				menu_arma_al += "|  2 - Po��es.              |\n";
				menu_arma_al += "|___________________________|\n";
		
		do {
		switch(opcao) {
				case "Cavaleiro":	
								// Definir arma do Cavaleiro
								do {
									System.out.println(menu_arma_c);
									opcao2 = entrada.nextInt();
									switch (opcao2) {
										case 1:
											   arma = "Espada";
											   opcao2 = 999;
											   break;
										case 2:
											   arma = "Lan�a";
											   opcao2 = 999;
											   break;
										default:
											System.out.println("Op��o da arma inv�lida, tente novamente.");
									}
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				case "Arqueiro":	
								// Definir arma do Arqueiro
								do {
									System.out.println(menu_arma_a);
									opcao2 = entrada.nextInt();
									switch (opcao2) {
											case 1:
												   arma = "Arco";
												   opcao2 = 999;
												   break;
											case 2:
												   arma = "Besta";
												   opcao2 = 999;
												   break;
											default:
												   System.out.println("Op��o da arma inv�lida, tente novamente.");
									}		
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				case "Mago":
								// Definir arma do Mago
								do {
									System.out.println(menu_arma_m);
									opcao2 = entrada.nextInt();
									switch (opcao2) {
										case 1:
											   arma = "Cajado";
											   opcao2 = 999;
											   break;
										case 2:
											   arma = "Livro";
											   opcao2 = 999;
											   break;
										default:
											   System.out.println("Op��o da arma inv�lida, tente novamente.");
									}
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				case "B�rbaro":	
								// Definir arma do B�rbaro
								do {
									System.out.println(menu_arma_b);
									opcao2 = entrada.nextInt();
									switch (opcao2) {
										case 1:
											   arma = "Machado";
											   opcao2 = 999;
											   break;
										case 2:
											   arma = "Martelo";
											   opcao2 = 999;
											   break;
										case 3:
											   arma = "Clava";
											   opcao2 = 999;
											   break;
										default:
											   System.out.println("Op��o da arma inv�lida, tente novamente.");
									}
									
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				case "Alquimista":	
								// Definir arma do Alquimista
								do {
									System.out.println(menu_arma_al);
									opcao2 = entrada.nextInt();
									switch (opcao2) {
										case 1:
											   arma = "Livro";
											   opcao2 = 999;
											   break;
										case 2:
											   arma = "Po��es";
											   opcao2 = 999;
											   break;
										default:
											System.out.println("Op��o da arma � inv�lida, tente novamente.");
									}
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				default:
					System.out.println("Op��o da classe � inv�lida, tente novamente.");	
		   }
		 } while(opcao3 != 9999);	
		return arma;	
	}
	
	// Menu - Motiva��o
	public String menuMotivacao() {
		String motivacao = "";
		int opcao;
		  String menu_motivacao = " ________________________\n";
				menu_motivacao += "|Escolha a sua motiva��o:|\n";
				menu_motivacao += "|                        |\n";
				menu_motivacao += "|  1 - VINGAN�A.         |\n";
				menu_motivacao += "|  2 - GL�RIA.           |\n";
				menu_motivacao += "|________________________|\n";
		// Definir a sua motiva��o
		do {
			System.out.println(menu_motivacao);
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1:
					   motivacao = "VINGAN�A";
					   opcao = 9999;
					   break;
				case 2:
					   motivacao = "GL�RIA";
					   opcao = 9999;
					   break;
				default:
					   System.out.println("Op��o da motiva��o � inv�lida, tente novamente.");
			}	
		} while(opcao != 9999);		
		return motivacao; 
	}
	
	// Menu - Escolha 1 
		public String menuEscolha1() {
			String escolha1 = "";
			int opcao;
			  String menu_es = " _____________________\n";
					menu_es += "|  Escolha uma op��o: |\n";
					menu_es += "|                     |\n";
					menu_es += "|1 - Seguir em frente.|\n";
					menu_es += "|2 - Desistir.        |\n";
					menu_es += "|_____________________|\n";
			// Definir a sua escolha
			do {
				System.out.println(menu_es);
				opcao = entrada.nextInt();
				switch (opcao) {
					case 1:
						   escolha1 = "Seguir";
						   opcao = 9999;
						   break;
					case 2:
						   escolha1 = "Desistir";
						   opcao = 9999;
						   break;
					default:
						   System.out.println("Op��o est� inv�lida, tente novamente.");
				}	
			} while(opcao != 9999);		
			return escolha1; 
		}
		
		// Menu - Escolha 2 
				public String menuEscolha2() {
					String escolha2 = "";
					int opcao;
					  String menu_es = " ___________________________\n";
							menu_es += "|    Escolha uma op��o:     |\n";
							menu_es += "|                           |\n";
							menu_es += "|1 - Andando cuidadosamente.|\n";
							menu_es += "|2 - Correndo.              |\n";
							menu_es += "|3 - Saltando.              |\n";
							menu_es += "|___________________________|\n";
					// Definir a sua escolha 2
					do {
						System.out.println(menu_es);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha2 = "Andando";
								   opcao = 9999;
								   break;
							case 2:
								   escolha2 = "Correndo";
								   opcao = 9999;
								   break;
							case 3:
								   escolha2 = "Saltando";
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Op��o est� inv�lida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha2; 
				}
				
				// Menu - Escolha 3 
				public boolean menuEscolha3() {
					boolean escolha = true;
					int opcao;
					  String menu_es = " ______________________\n";
							menu_es += "|Deseja pegar Armadura:|\n";
							menu_es += "|                      |\n";
							menu_es += "| 1 - Sim              |\n";
							menu_es += "| 2 - N�o              |\n";
							menu_es += "|______________________|\n";
					// Definir a sua escolha 3
					do {
						System.out.println(menu_es);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha = true;
								   System.out.println("Voc� resolve usar os equipamentos inimigo contra ele, e trocar algumas pe�as suas, que\n"
										   			+" estavam danificadas, pelas pe�as de armaduras existentes na sala. De armadura nova,\n"
										   			+ " voc� se sente mais protegido para os desafios � sua frente.\n");
								   opcao = 9999;
								   break;
							case 2:
								   escolha = false;
								   System.out.println("Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Op��o est� inv�lida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha; 
				}
				
				// Menu - Escolha 4 
				public boolean menuEscolha4() {
					boolean escolha = true;
					int opcao;
					  String menu_es = " __________________________________\n";
							menu_es += "|Deseja beber a liquido da garrafa:|\n";
							menu_es += "|                                  |\n";
							menu_es += "|  1 - Sim                         |\n";
							menu_es += "|  2 - N�o                         |\n";
							menu_es += "|__________________________________|\n";
					// Definir a sua escolha 4
					do {
						System.out.println(menu_es);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha = true;
								   System.out.println("Voc� se sente revigorado para seguir adiante!");
								   opcao = 9999;
								   break;
							case 2:
								   escolha = false;
								   System.out.println("Voc� fica receoso de beber algo produzido pelo inimigo.");
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Op��o est� inv�lida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha; 
				}
				
				// Menu - Escolha 5 
				public boolean menuEscolha5() {
					boolean escolha = true;
					int opcao;
					  String menu_es = " ___________________________\n";
							menu_es += "|Escolha de ataca ou espera:|\n";
							menu_es += "|                           |\n";
							menu_es += "|  1 - Ataca                |\n";
							menu_es += "|  2 - Espera               |\n";
							menu_es += "|___________________________|\n";
					// Definir a sua escolha 4
					do {
						System.out.println(menu_es);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha = true;
								   opcao = 9999;
								   break;
							case 2:
								   escolha = false;
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Op��o est� inv�lida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha; 
				}
				
				// Menu - Inicio da Partida 
				public String menuPartida() {
					String escolha = "";
					int opcao;
						  String menu_pa = " __________________\n";
								menu_pa += "|Escolha uma op��o:|\n";
								menu_pa += "|                  |\n";
								menu_pa += "|1 - Deseja atacar.|\n";
								menu_pa += "|2 - Fugir.        |\n";
								menu_pa += "|__________________|\n";
					// Definir a sua escolha
					do {
						System.out.println(menu_pa);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha = "Deseja atacar";
								   opcao = 9999;
								   break;
							case 2:
								   escolha = "Fugir";
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Op��o est� inv�lida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha; 
				}	
}

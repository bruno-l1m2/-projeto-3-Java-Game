package game.br.com.devinhouse.entidades;

import java.util.Scanner;


public class Menu {
	
	Scanner entrada = new Scanner(System.in);
	
	public Menu(){	
	}
	
	// Menu - nível de dificuldade
	public String menuNivel() {
		int opcao;
		String nivel = "";
		String menu_nivel =  " _______________________________________\n";
			   menu_nivel += "|Escolha o nível de dificuldade do game:|\n";
			   menu_nivel += "|                                       |\n";
			   menu_nivel += "| 1 - Nível Fácil                       |\n";
			   menu_nivel += "| 2 - Nível Normal.                     |\n";
			   menu_nivel += "| 3 - Nível Difícil.                    |\n";
			   menu_nivel += "|_______________________________________|\n";
		// Definir o nível de dificuldade
		do {
			System.out.println(menu_nivel);
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1: 
						nivel = "Fácil";
						opcao = 9999;
						break;
				case 2:	
						nivel = "Normal";
						opcao = 9999;
						break;
				case 3:
						nivel = "Difícil";
						opcao = 9999;
						break;
				default:
						System.out.println("Opção do nível inválida, tente novamente.");
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
							   System.out.println("Opção do sexo inválida, tente novamente.");
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
					  menu_personagem += "| 4 - Bárbaro.                 |\n";
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
								classe = "Bárbaro";
								opcao = 9999;
								break;
							   
						case 5:
								classe = "Alquimista";
							    opcao = 9999;
							    break;
						default:
							    System.out.println("Opção da Classe de Combate inválida, tente novamente.");
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
				menu_arma_c += "|  2 - Lança.              |\n";
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
		
		// Menu - Arma Bárbaro
		  String menu_arma_b = " ________________________\n";
				menu_arma_b += "|Escolha arma do Bárbaro:|\n";
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
				menu_arma_al += "|  2 - Poções.              |\n";
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
											   arma = "Lança";
											   opcao2 = 999;
											   break;
										default:
											System.out.println("Opção da arma inválida, tente novamente.");
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
												   System.out.println("Opção da arma inválida, tente novamente.");
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
											   System.out.println("Opção da arma inválida, tente novamente.");
									}
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				case "Bárbaro":	
								// Definir arma do Bárbaro
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
											   System.out.println("Opção da arma inválida, tente novamente.");
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
											   arma = "Poções";
											   opcao2 = 999;
											   break;
										default:
											System.out.println("Opção da arma é inválida, tente novamente.");
									}
								} while(opcao2 != 999);
								opcao3 = 9999;
								break;
				default:
					System.out.println("Opção da classe é inválida, tente novamente.");	
		   }
		 } while(opcao3 != 9999);	
		return arma;	
	}
	
	// Menu - Motivação
	public String menuMotivacao() {
		String motivacao = "";
		int opcao;
		  String menu_motivacao = " ________________________\n";
				menu_motivacao += "|Escolha a sua motivação:|\n";
				menu_motivacao += "|                        |\n";
				menu_motivacao += "|  1 - VINGANÇA.         |\n";
				menu_motivacao += "|  2 - GLÓRIA.           |\n";
				menu_motivacao += "|________________________|\n";
		// Definir a sua motivação
		do {
			System.out.println(menu_motivacao);
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1:
					   motivacao = "VINGANÇA";
					   opcao = 9999;
					   break;
				case 2:
					   motivacao = "GLÓRIA";
					   opcao = 9999;
					   break;
				default:
					   System.out.println("Opção da motivação é inválida, tente novamente.");
			}	
		} while(opcao != 9999);		
		return motivacao; 
	}
	
	// Menu - Escolha 1 
		public String menuEscolha1() {
			String escolha1 = "";
			int opcao;
			  String menu_es = " _____________________\n";
					menu_es += "|  Escolha uma opção: |\n";
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
						   System.out.println("Opção está inválida, tente novamente.");
				}	
			} while(opcao != 9999);		
			return escolha1; 
		}
		
		// Menu - Escolha 2 
				public String menuEscolha2() {
					String escolha2 = "";
					int opcao;
					  String menu_es = " ___________________________\n";
							menu_es += "|    Escolha uma opção:     |\n";
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
								   System.out.println("Opção está inválida, tente novamente.");
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
							menu_es += "| 2 - Não              |\n";
							menu_es += "|______________________|\n";
					// Definir a sua escolha 3
					do {
						System.out.println(menu_es);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha = true;
								   System.out.println("Você resolve usar os equipamentos inimigo contra ele, e trocar algumas peças suas, que\n"
										   			+" estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova,\n"
										   			+ " você se sente mais protegido para os desafios à sua frente.\n");
								   opcao = 9999;
								   break;
							case 2:
								   escolha = false;
								   System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Opção está inválida, tente novamente.");
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
							menu_es += "|  2 - Não                         |\n";
							menu_es += "|__________________________________|\n";
					// Definir a sua escolha 4
					do {
						System.out.println(menu_es);
						opcao = entrada.nextInt();
						switch (opcao) {
							case 1:
								   escolha = true;
								   System.out.println("Você se sente revigorado para seguir adiante!");
								   opcao = 9999;
								   break;
							case 2:
								   escolha = false;
								   System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
								   opcao = 9999;
								   break;
							default:
								   System.out.println("Opção está inválida, tente novamente.");
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
								   System.out.println("Opção está inválida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha; 
				}
				
				// Menu - Inicio da Partida 
				public String menuPartida() {
					String escolha = "";
					int opcao;
						  String menu_pa = " __________________\n";
								menu_pa += "|Escolha uma opção:|\n";
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
								   System.out.println("Opção está inválida, tente novamente.");
						}	
					} while(opcao != 9999);		
					return escolha; 
				}	
}

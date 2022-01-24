package br.com.devinhouse.main;

import java.util.Scanner;
import game.br.com.devinhouse.entidades.Menu;
import game.br.com.devinhouse.entidades.Roteiro;

public class Main {
	
	Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nivel;
		String nome;
		String sexo;
		String classe;
		String arma;
		
		Menu menu = new Menu();
		Roteiro roteiro = new Roteiro();		
		
		System.out.println("Seja bem vindo(a) à BATALHA FINAL!");
		
		// Menus
		nivel = menu.menuNivel();		
		nome = menu.menuNome();
		sexo = menu.menuSexo();
		classe = menu.menuClasse();
		arma = menu.menuArma(classe);
		
		//Roteiro
		roteiro.startRoteiro(nivel, nome, sexo, classe, arma);
		
		// Fim do Game
		System.out.println("Jogo encerrado!");
	}
		
}

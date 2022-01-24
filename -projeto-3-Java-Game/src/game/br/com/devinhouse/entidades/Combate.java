package game.br.com.devinhouse.entidades;

public class Combate {
	Combate(){	
	}
	public int rolamentoDado(int valor) {
		int valor_maximo = valor;
		int dado = (int) (Math.random() * valor_maximo + 1);
		return dado;		
	}	
}

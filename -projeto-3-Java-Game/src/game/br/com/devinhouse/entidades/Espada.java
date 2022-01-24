package game.br.com.devinhouse.entidades;

public class Espada extends Arma{
	
	private final int ataquearma = 15;
	private final String nomearma = "Espada";
	
	public Espada() {
		
	}
	
	public Espada(String nome, int ataque) {
		super(nome, ataque);
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
	}
}
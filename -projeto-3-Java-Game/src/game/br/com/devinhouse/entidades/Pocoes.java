package game.br.com.devinhouse.entidades;

public class Pocoes extends Arma {
	private final int ataquearma = 13;
	private final String nomearma = "Poções";
	
	public Pocoes() {
	}
	
	public Pocoes(String nome, int ataque) {
		super(nome, ataque);
		
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
    } 
}

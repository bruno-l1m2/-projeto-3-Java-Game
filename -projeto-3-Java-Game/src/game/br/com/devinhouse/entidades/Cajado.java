package game.br.com.devinhouse.entidades;

public class Cajado extends Arma {
	private final int ataquearma = 15;
	private final String nomearma = "Cajado";
	
	public Cajado() {
	}
	
	public Cajado(String nome, int ataque) {
		super(nome, ataque);
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
    } 
}

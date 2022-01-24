package game.br.com.devinhouse.entidades;

public class Martelo extends Arma {
	private final int ataquearma = 17;
	private final String nomearma = "Martelo";
	
	public Martelo() {
	}
	
	public Martelo(String nome, int ataque) {
		super(nome, ataque);
		
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
    } 
}

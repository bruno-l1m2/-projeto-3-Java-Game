package game.br.com.devinhouse.entidades;

public class Machado extends Arma {
	private final int ataquearma = 18;
	private final String nomearma = "Machado";
	
	public Machado() {
	}
	
	public Machado(String nome, int ataque) {
		super(nome, ataque);
		
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
    } 
}

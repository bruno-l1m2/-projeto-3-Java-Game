package game.br.com.devinhouse.entidades;

public class Clava extends Arma {
	private final int ataquearma = 17;
	private final String nomearma = "Clava";
	
	public Clava() {
	}
	
	public Clava(String nome, int ataque) {
		super(nome, ataque);
		
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
    } 
}

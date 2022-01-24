package game.br.com.devinhouse.entidades;

public class Cavaleiro extends Guerreiro {
	
	private final int vida = 100;
	private final int ataque = 15;
	private final int defesa = 10;
	
	
	public Cavaleiro(String nome, String sexo) {
		super(nome, sexo);
		
		this.setVida(vida);
		this.setAtaque(ataque);
		this.setDefesa(defesa);
	}	
}
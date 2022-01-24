package game.br.com.devinhouse.entidades;

public class Orque extends Guerreiro{
	
	private final int vida = 45;
	private final int ataque = 7;
	private final int defesa = 3;
	
	public Orque() {
		super();
		this.setVida(vida);
		this.setAtaque(ataque);
		this.setDefesa(defesa);
	}
	
	public Orque(String nome) {
		super(nome);
		
		this.setVida(vida);
		this.setAtaque(ataque);
		this.setDefesa(defesa);
	}	
}

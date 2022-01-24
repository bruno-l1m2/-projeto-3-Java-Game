package game.br.com.devinhouse.entidades;

public class Livro extends Arma {
	private final int ataquearma = 15;
	private final String nomearma = "Livro";
	
	public Livro() {
	}
	
	public Livro(String nome, int ataque) {
		super(nome, ataque);
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
    } 
}

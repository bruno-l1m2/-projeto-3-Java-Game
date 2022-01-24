package game.br.com.devinhouse.entidades;

public class Guerreiro {
	
	private String nome;
	private String sexo;
	private int vida;	
	private int defesa;
	private int ataque;
	
	public Guerreiro() {
	}
	
	public Guerreiro(String nome) {
		this.nome = nome;
	}
	
	public Guerreiro(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getVida() {
		if(vida < 0) {
			return 0;
		} else {
			return vida;
		}
		
	}

	public void setVida(int vida) {
		this.vida += vida;
	}
	public void setRecupervida(int vida) {
		this.vida = vida;
	}
	
	public void setDanos(int vida) {
		this.vida -= vida;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa += defesa;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
}

package negocio;

public abstract class Pessoa<E> {

	private E nome;
	private E idade;

	public Pessoa(E nome, E idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	/**
	 * 
	 * @return nome
	 */
	public E getNome() {
		return nome;
	}

	/**
	 * 
	 * @return email
	 */

	/**
	 * 
	 * @return idade
	 */
	public E getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "" + getNome() + "" + "" + getIdade();
	}
}

package negocio;

public class Usuario<E> extends Pessoa<E> {

	/**
	 * Variáveis
	 */
	private E email;
	private E senha;

	/**
	 * 
	 * @param nome
	 * @param idade
	 * @param email
	 * @param senha
	 */
	public Usuario(E nome, E idade, E email, E senha) {
		super(nome, idade);
		this.email = email;
		this.senha = senha;
	}

	/**
	 * 
	 * @return email
	 */
	public E getEmail() {
		return email;
	}

	/**
	 * 
	 * @return senha
	 */
	public E getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return super.toString() + getEmail() + "" + getSenha();
	}
}

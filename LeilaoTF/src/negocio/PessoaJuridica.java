package negocio;

public class PessoaJuridica<E> extends Pessoa<E> {

	/**
	 * Variáveis
	 */
	private E cnpj;

	/**
	 * 
	 * @param nome
	 * @param idade
	 * @param cnpj
	 */
	public PessoaJuridica(E nome, E idade, E cnpj) {
		super(nome, idade);
		this.cnpj = cnpj;
	}

	/**
	 * 
	 * @return cnpj
	 */
	public E getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + "" + getCnpj();
	}
}

package negocio;

public class PessoaFisica<E> extends Pessoa<E>{
	/**
	 * Vari�veis
	 */
	private E cpf;

	/**
	 * 
	 * @param nome
	 * @param idade
	 * @param cpf
	 */
	public PessoaFisica(E nome, E idade, E cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return cnpj
	 */
	public E getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return super.toString() + "" + getCpf();
	}
}

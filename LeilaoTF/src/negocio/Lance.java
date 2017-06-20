package negocio;

public class Lance<E> {
	
	private E data;
	private E hora;
	private E valor;
	private E usuario;
	
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public E getHora() {
		return hora;
	}
	public void setHora(E hora) {
		this.hora = hora;
	}
	public E getValor() {
		return valor;
	}
	public void setValor(E valor) {
		this.valor = valor;
	}
	public E getUsuario() {
		return usuario;
	}
	public void setUsuario(E usuario) {
		this.usuario = usuario;
	}

}

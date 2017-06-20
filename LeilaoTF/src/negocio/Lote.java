package negocio;

import java.awt.List;
import java.util.ArrayList;

public class Lote<E> {
	
	private E nome;		//nome eh uma descricao curta
	private E descricao;	//descricao eh uma descricao longa
	private E categoria;	//categoria
	ArrayList lances; //lances dados para esse lote
		
	
	public Lote(E nome, E descricao, E categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		lances = new ArrayList();
	}

	public E getNome() {
		return nome;
	}

	public void setNome(E nome) {
		this.nome = nome;
	}

	public E getDescricao() {
		return descricao;
	}

	public void setDescricao(E descricao) {
		this.descricao = descricao;
	}

	public E getCategoria() {
		return categoria;
	}

	public void setCategoria(E categoria) {
		this.categoria = categoria;
	}

	public ArrayList getLances() {
		return lances;
	}

	public void addLance(E lance){
		lances.add(lance);
	}
	
	public E retornaLance(Lance lance){
		for(int i=0;i<lances.size();i++){
			if (lances.get(i).equals(lance)){
				return (E) lances.get(i);
			}
		}
		return null;
	}
}

package negocio;

import java.util.ArrayList;

public class Lote {
	
	private String nome;		//nome eh uma descricao curta
	private String descricao;	//descricao eh uma descricao longa
	private String categoria;	//categoria
	ArrayList<Lance> lances = new ArrayList<>();
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Lance> getLances() {
		return lances;
	}

	public void addLance(Lance lance){
		lances.add(lance);
	}
	
	public Lance retornaLance(Lance lance){
		for(int i=0;i<lances.size();i++){
			if (lances.get(i).equals(lance)){
				return lances.get(i);
			}
		}
		return null;
	}
	

}

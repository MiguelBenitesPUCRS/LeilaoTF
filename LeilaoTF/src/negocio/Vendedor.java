package negocio;

import java.awt.List;
import java.util.ArrayList;

public class Vendedor<E> extends Usuario<E>{

	ArrayList<Lote> lote;
	public Vendedor(E nome, E idade, E email, E senha) {
		super(nome, idade, email, senha);
		lote = new ArrayList<Lote>();
	}

	
}

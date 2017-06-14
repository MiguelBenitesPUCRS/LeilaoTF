package negocio;

import java.util.ArrayList;

public interface Leilao<E> {
	public E getData();		   //data do leilao
	public E getHoraInicial();    //hora inicial do leilao
	public E getHoraFinal();	   //hora final do leilao
	public E getStatus();		   //encerrado ou em andamento
	public E getTipoLeilao();	   //retorna se é Aberto ou fechado
	public ArrayList<Lote> getLotes(); //retorna o array de lotes
}

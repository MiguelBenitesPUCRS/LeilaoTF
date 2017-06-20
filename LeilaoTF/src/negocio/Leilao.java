package negocio;

import java.awt.List;


public interface Leilao<E> {
	public E getData();		   //data do leilao
	public E getHoraInicial();    //hora inicial do leilao
	public E getHoraFinal();	   //hora final do leilao
	public E getStatus();		   //encerrado ou em andamento
	public E getNaturezaLeilao(); // retorna a natureza do leilão
	public E getTipoLance();	   //retorna se o lance é Aberto ou fechado
	public List getLotes(); //retorna o array de lotes
	public E adicionaLote(E lote); //adiciona lote a um leilão
	public E removerLote(E lote); //remove lote a um leilão
 
	
}

package negocio;

import java.util.ArrayList;

public interface Leilao {
	public double getData();		   //data do leilao
	public double getHoraInicial();    //hora inicial do leilao
	public double hetHoraFinal();	   //hora final do leilao
	public boolean status();		   //encerrado ou em andamento
	public int abertoOuFechado();	   //retorna se é Aberto ou fechado
	public ArrayList<Lote> getLotes(); //retorna o array de lotes
}

package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;  

public class Giocatore {

	static final private int CFU_INIZIALI = 20;
	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa();
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}
	
	public Borsa getBorsa() {
		return borsa;
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		return borsa.addAttrezzo(attrezzo);
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return borsa.hasAttrezzo(nomeAttrezzo);
	}
	
	public boolean removeAttrezzo(String nomeAttrezzo) {
		return borsa.removeAttrezzo(nomeAttrezzo)!=null;
	}

}

package it.shop;

import java.util.Random;

public class BonusProdotto {

	/*
	 * alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
Il codice sia accessibile solo in lettura
Gli altri attributi siano accessibili sia in lettura che in scrittura 
Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
	 * 
	 */


	////////////  PROPRIETA ///////////////////////////////////

	
	private String nome;
	private String descrizione;
	private int codice;
	private int prezzo;
	private int iva;

	/////////////// COSTRUTTORE ///////////////////////////////

	public BonusProdotto(String nome, String descrizione){
		
		this.codice = codiceRandom();
		this.prezzo = prezzoRandom();
		this.iva = 22;
		this.nome = nome;
		this.descrizione = descrizione;
	}


	///////////// SGETTER /////////////////////////////////	

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public int getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


	public int getIva() {
		return iva;
	}


	public void setIva(int iva) {
		this.iva = iva;
	}


	public int getCodice() {
		return codice;
	}

	

	////////////////// METODI //////////////////////////////
	
	
	
	////////////////// PREZZO BASE + PREZZO IVA
	int prezzoRandom() {
		Random p = new Random ();
		return p.nextInt(101) + 20;
	}
	
	int prezzoIva() {
		return (prezzo * iva)/100 + prezzo;
	}
	
	//////CREAZIONE CODICE 
	int codiceRandom() {
		Random c = new Random ();
		return c.nextInt(501) + 1 ;
	}

/////////////////NOME+CODICE
	public String nomeCodice() {
		return (nome + "-" + codice);
	}
}

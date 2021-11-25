package it.shop;

import java.util.Random;

public class Prodotto {

	/*
	 * alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
Il codice sia accessibile solo in lettura
Gli altri attributi siano accessibili sia in lettura che in scrittura 
Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
	 * 
	 */


	////////////  PROPRIETA ///////////////////////////////////

	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;

	/////////////// COSTRUTTORE ///////////////////////////////

	public Prodotto (int prezzo, String nome, String descrizione, int iva) {

		this.codice = generaCodice();	
		setIva(22);		
		setPrezzo(prezzo);
		setNome(nome);
		setDescrizione(descrizione);

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

	//////CREAZIONE CODICE 
	private int generaCodice() {
		Random c = new Random ();
		return c.nextInt(501);
	}

	////////////////// PREZZO BASE + PREZZO IVA
	public int prezzoIva() {
		return (prezzo * iva)/100 + prezzo;
	}
	/////////////////NOME+CODICE
	public String nomeCodice() {
		return (nome + codice);
	}

}

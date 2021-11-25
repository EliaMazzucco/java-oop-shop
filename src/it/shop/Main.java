package it.shop;

public class Main {

	public static void main(String[] args) {

		String nome = "Maglietta";
		String descrizione = "Bella e Calda";
		int prezzo = 30;
		int iva = 22;

		Prodotto prodotto = new Prodotto(prezzo, nome, descrizione, iva);

		System.out.println("Il prodotto è: " + prodotto.nomeCodice() + "\nLa sua descrizione è: " + prodotto.getDescrizione() + "\nIl suo prezzo è: "
				+ prodotto.getPrezzo() + "\nIl prezzo con l'IVA è: " + prodotto.prezzoIva());
	}
}
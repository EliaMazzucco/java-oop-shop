package it.shop;

import java.util.Scanner;

public class BonusMain {

	public static void main(String[] args) {		
		String nome = "";
		String descrizione = "";
		Scanner scan = new Scanner(System.in);
		String session = "";
		
		while(!session.equalsIgnoreCase("si")) {
		
		
		
		System.out.println("Nome del prodotto: ");
		nome = scan.nextLine();
		
		System.out.println("Descrizione del prodotto: ");
		descrizione = scan.nextLine();
		
		
		BonusProdotto prodotto = new BonusProdotto(nome, descrizione);
		
		
		System.out.println("Il prodotto costa: " + prodotto.prezzoIva());
		
		System.out.println("Il codice del tuo prodotto è: " + prodotto.nomeCodice());
		
		System.out.println("Vuoi uscire dalla sessione? Si per uscire o No per continuare");
		session = scan.nextLine();
		
		}
		scan.close();
	}

}

package com.quisqo.KermisApp;

public class Hawai extends Attractie {
	double entree= 2.90;
	int aantalTickets= 20;
	double omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal aantal kaartjes Hawai verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Hawai: "+ omzet);
		
		
	}

}


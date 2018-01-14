package com.quisqo.KermisApp;

public class Hawai extends Attractie {
	double entree= 2.90;
	int aantalTickets= 20;
	double Omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal kaartjes Hawai verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Hawai: "+ Omzet);
		
		
	}

}


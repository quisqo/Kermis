package com.quisqo.KermisApp;

public class Spiegelpaleis extends Attractie {	
	double entree= 2.75;
	int aantalTickets= 20;
	double omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal aantal kaartjes Spiegelpaleis verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Spiegelpaleis: "+ omzet);
	}
	

}


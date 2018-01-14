package com.quisqo.KermisApp;

public class Spiegelpaleis extends Attractie {	
	double entree= 2.75;
	int ticket= 20;


	public void aantalKWeergeven() {
		System.out.println("Totaal kaartjes Spiegelpaleis verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Spiegelpaleis: "+ omzet);
	}

}


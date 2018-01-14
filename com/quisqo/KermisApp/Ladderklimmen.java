package com.quisqo.KermisApp;

public class Ladderklimmen extends Attractie {
	double entree= 5.00;
	int aantalTickets= 20;
	double Omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal kaartjes Ladderklimmen verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Ladderklimmen: "+ Omzet);
		
		
	}

}

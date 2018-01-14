package com.quisqo.KermisApp;

public class Spookhuis extends Attractie {
	double entree= 3.20;
	int aantalTickets= 20;
	double omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal aantal kaartjes Spookhuis verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Spookhuis: "+ omzet);
		
		
	}
}

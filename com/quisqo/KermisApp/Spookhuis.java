package com.quisqo.KermisApp;

public class Spookhuis extends Attractie {
	double entree= 3.20;
	int aantalTickets= 20;
	double Omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal kaartjes Spookhuis verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Spookhuis: "+ Omzet);
		
		
	}
}

package com.quisqo.KermisApp;

public class Botsauto extends Attractie {
	double entree= 2.50;
	int aantalTickets= 20;
	double Omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal kaartjes Botsauto verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Botsauto: "+ Omzet);
	}

}


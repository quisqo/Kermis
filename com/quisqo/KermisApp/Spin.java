package com.quisqo.KermisApp;

public class Spin extends Attractie {
	double entree= 2.25;
	int aantalTickets= 20;
	double Omzet = entree * aantalTickets;


	public void aantalKWeergeven() {
		System.out.println("Totaal kaartjes Spin verkocht: "+ aantalTickets);
	}
	public void omzetOWeergeven() {
		System.out.println("Totale omzet Spin: "+ Omzet);
		
		
	}

}

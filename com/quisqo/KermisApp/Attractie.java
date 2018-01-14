package com.quisqo.KermisApp;

import java.util.Scanner;

public class Attractie {

	public static boolean kermisOpen = true;
	double entree;
	int aantalTickets = 0;
	double omzet = entree * aantalTickets;
	

	

	public static void main(String[] args) {

		System.out.println("Veel plezier op de Kermis");

		
		Botsauto botsauto = new Botsauto();
		Hawai hawai = new Hawai();
		Ladderklimmen ladderklimmen = new Ladderklimmen();
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
		Spin spin = new Spin();
		Spookhuis spookhuis = new Spookhuis();

		Scanner scanner = new Scanner(System.in);

		while (kermisOpen) {
			String keuze = scanner.nextLine();
			switch (keuze) {
			case "1":
				botsauto.aantalTickets();
				botsauto.Omzet();
				System.out.println("Attractie Botsauto in full swing");
				break;
			case "2":
				hawai.aantalTickets();
				hawai.Omzet();
				System.out.println("Attractie Hawai in full swing");
				break;
			case "3":
				ladderklimmen.aantalTickets();
				ladderklimmen.Omzet();
				System.out.println("Attractie Ladderklimmen in full swing");
				break;
			case "4":
				spiegelpaleis.aantalTickets();
				spiegelpaleis.Omzet();
				System.out.println("Attractie Spiegelpaleis in full swing");
				break;
			case "5":
				spin.aantalTickets();
				spin.Omzet();
				System.out.println("Attractie Spin in full swing");
				break;
			case "6":
				spookhuis.aantalTickets();
				spookhuis.Omzet();
				System.out.println("Attractie Spookhuis in full swing");
				break;
			 case "o":
				botsauto.omzetOWeergeven();
				hawai.omzetOWeergeven();
				ladderklimmen.omzetOWeergeven();
				spiegelpaleis.omzetOWeergeven();
				spin.omzetOWeergeven();
				spookhuis.omzetOWeergeven();
				break;
			case "k":
				botsauto.aantalKWeergeven();
				hawai.aantalKWeergeven();
				ladderklimmen.aantalKWeergeven();
				spiegelpaleis.aantalKWeergeven();
				spin.aantalKWeergeven();
				spookhuis.aantalKWeergeven();
				break;
		
			default:
				System.out.println("Attractie is defect");
				break;
			}
		}

	}

}

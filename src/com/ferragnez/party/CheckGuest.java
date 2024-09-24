package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String[] invitedList = {"Dua Lipa","Alessandro Scarlatti","Paris Hilton","Manuel Agnelli",
				"J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei",
				"Martina Maccherone","Rachel Zeilic"};
		
		Scanner scan = new Scanner(System.in);
		String name;
		//int i=0;
		int flag=0;
		System.out.println("Inserisci il tuo nome e cognome");
		name = scan.nextLine();
		
		for (int i = 0; i < invitedList.length; i++) {
			if (name==invitedList[i]) {
				flag=1;	
			} 
			
			//do {
				//if (name==invitedList[i]) {
					//flag=1;	
					//i++;
				//}
			//} while (i< invitedList.length);
			
		}
		if(flag==1) {
			System.out.println(name + " Benvenuto al Ferragnez Party!");
		}
		else {
			System.out.println("Mi dispiace " + name + " non sei nella lista perciò tornatene da dove sei venuto.");
		}
			//System.out.println(flag);
			//System.out.println(name);
			//System.out.println(invitedList[0]);
	}

}

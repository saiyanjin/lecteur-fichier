package main;

import lecteurs.*;

public class FileReader {

	public static void main(String[] args) {
		//JSONFileReader lecteur1 = new JSONFileReader("C:\\Users\\flame\\Desktop\\Cours\\Licence Pro\\Cours Java\\fichiers lecteur\\exempleJSON.json");
		//CSVFileReader lecteur1 = new CSVFileReader("C:\\Users\\flame\\Desktop\\Cours\\Licence Pro\\Cours Java\\fichiers lecteur\\exempleCSV.csv");
		TextFileReader lecteur1 = new TextFileReader("C:\\Users\\flame\\Desktop\\Cours\\Licence Pro\\Cours Java\\fichiers lecteur\\exemple1.txt");
		lecteur1.lireFichier();

		System.out.println("\n-------- Affichage normal --------");
		lecteur1.afficherNormal();

		System.out.println("\n-------- Affichage inversé --------");
		lecteur1.afficherInverse();

		System.out.println("\n-------- Affichage palindrome --------");
		lecteur1.afficherPalindromique();

		TextFileReader lecteur2 = new TextFileReader("C:\\Users\\flame\\Desktop\\Cours\\Licence Pro\\Cours Java\\fichiers lecteur\\exemple2.txt");
		//JSONFileReader lecteur1 = new JSONFileReader("C:\\Users\\flame\\Desktop\\Cours\\Licence Pro\\Cours Java\\fichiers lecteur\\exempleJSON.json");
		//CSVFileReader lecteur1 = new CSVFileReader("C:\\Users\\flame\\Desktop\\Cours\\Licence Pro\\Cours Java\\fichiers lecteur\\exempleCSV.csv");
		boolean identiques = lecteur1.comparer(lecteur2);

		System.out.println("\n-------- Les deux fichiers sont identiques ? -------- \n" + identiques);
	}

}

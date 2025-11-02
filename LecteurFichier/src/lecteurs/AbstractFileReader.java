package lecteurs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.ArrayList;

public abstract class AbstractFileReader implements IFileReader {
	
	protected String cheminFichier;
	protected ArrayList<String> contenu;

	public AbstractFileReader(String cheminFichier) {
	    this.cheminFichier = cheminFichier;
	}

	@Override
	public void lireFichier() {
		this.contenu = lireToutesLesLignes();
	}

	@Override
	public void afficherNormal() {
		if (contenu == null) {
			lireFichier();
		}
	    //System.out.println("Contenu du fichier :");
	    for (String ligne : contenu) {
	        System.out.println(ligne);
	    }
	}

	@Override
	public void afficherInverse() {
		if (contenu == null) {
			lireFichier();
		}
		//System.out.println("Contenu à l’envers :");
		Collections.reverse(contenu);
		for (String ligne : contenu) {
			System.out.println(ligne);
		}
		Collections.reverse(contenu);
	}

	@Override
	public void afficherPalindromique() {
		if (contenu == null) {
			lireFichier();
		}
		//System.out.println("Contenu palindrome :");
		for (String ligne : contenu) {
			System.out.println(new StringBuilder(ligne).reverse());
		}
	}

	@Override
	public boolean comparer(IFileReader autre) {
		if (!(autre instanceof AbstractFileReader)) {
			return false;
		}
		AbstractFileReader o = (AbstractFileReader) autre;
		if (this.contenu == null) { 
			lireFichier();
		}
		if (o.contenu == null) {
			o.lireFichier();
		}
		return this.contenu.equals(o.contenu);
	}

	protected ArrayList<String> lireToutesLesLignes() {
		ArrayList<String> lignes = new ArrayList<>();
		try {
			lignes.addAll(Files.readAllLines(Paths.get(cheminFichier)));
		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}
		return lignes;
	}

}

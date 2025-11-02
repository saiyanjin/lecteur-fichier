package lecteurs;

public interface IFileReader {
	
	void lireFichier();
	void afficherNormal();
	void afficherInverse();
    void afficherPalindromique();
    boolean comparer(IFileReader autre);
}

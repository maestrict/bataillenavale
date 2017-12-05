/**
 * 
 */
package model;

/**
 * Groupe 10
 * sous classe h�rit�e de bateaux
 * @author Nathan Voss
 * @param bId - repr�sentation "graphique" d'un bateau dans le mode console
 *
 */
public class Croiseur extends Bateaux {
	
	public static int taille = 4;
	public static String nomBateau = "Croiseur";
	public static char bId = 'C';
	public static int vieBateau = 4;
	public static boolean coule = true;
	
	public Croiseur() {
		super(taille, bId, nomBateau,vieBateau, coule);
		
	}


	


}
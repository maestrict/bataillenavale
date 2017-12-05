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
public class PorteAvion extends Bateaux {
	public static final int taille = 5;
	public static String nomBateau = "Porte-Avion";
	public static final char bId = 'P';	
	public static int vieBateau = 5;
	public static boolean coule = true;
	
	public PorteAvion() {
		super(taille, bId, nomBateau, vieBateau, coule);
	}

}
package model;

/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD
 * Interface sp�cifique aux d�placements des pions
 */
public interface Pions {
	public boolean isMoveOk(int xFinal,	int yFinal,boolean isCatchOk, boolean isCastlingPossible);
}
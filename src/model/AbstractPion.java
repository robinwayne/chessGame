package model;

/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD*
 */
public abstract class AbstractPion extends AbstractPiece implements Pions  {

	private boolean premierCoup;

	public boolean isPremierCoup() {
		return premierCoup;
	}
	
	/**
	 * @param name
	 * @param couleur_de_piece
	 * @param coord
	 */
	public AbstractPion(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord);
		this.premierCoup = true;
	}

	
	/* (non-Javadoc)
	 * @see model.AbstractPiece#move(int, int)
	 */
	@Override
	public boolean move(int x, int y){

		boolean ret = false;

		if(Coord.coordonnees_valides(x,y)){
			this.premierCoup = false;
			ret = super.move(x, y);
		}
		return ret;
	}



}

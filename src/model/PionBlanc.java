package model;

public class PionBlanc extends AbstractPion{

	public PionBlanc( Couleur couleur, Coord coord) {
		super(couleur, coord);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see model.AbstractPiece#isMoveOk(int, int)
	 */
	@Override
	public boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible) {

		boolean ret = false;

		// Déplacement vertical
		if (!isCatchOk && !isCastlingPossible){

			if ((xFinal == this.getX())
					&& (Math.abs(yFinal - this.getY()) <= 1 || 
					(Math.abs(yFinal - this.getY()) <= 2 && this.isPremierCoup()==true))) {

				if (yFinal - this.getY() < 0) {
					ret = true;
				}
			}
		}
		// Déplacement diagonal
		else {
				if ((yFinal == this.getY()-1 && xFinal == this.getX()+1) 
						|| (yFinal == this.getY()-1 && xFinal == this.getX()-1)) {
					ret = true;
				}
		}

		return ret;
	}

}

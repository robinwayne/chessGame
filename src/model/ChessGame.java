package model;

import java.util.List;
import java.util.Observer;

public class ChessGame implements BoardGames{
	
	private Echiquier echiquier;
	
	public ChessGame() {
		this.echiquier=new Echiquier();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return echiquier.toString()+" Type de deplacement: "+echiquier.getMessage();
	}
	
	public boolean move (int xInit, int yInit, int xFinal, int yFinal){
		boolean ret;
		if(echiquier.isMoveOk(xInit, yInit, xFinal, yFinal)) {
			ret = echiquier.move(xInit, yInit, xFinal, yFinal);
			echiquier.switchJoueur();
		}else {
			ret=false;
		}
		return ret;
	}
	
	public boolean isEnd() {
		// TODO Auto-generated method stub
		return echiquier.isEnd();
	}
	
	public String getMessage() {
		return echiquier.getMessage();
	}
	
	public Couleur getColorCurrentPlayer() {
		return echiquier.getColorCurrentPlayer();
	}
	
	@Override
	public Couleur getPieceColor(int x, int y) {
		// TODO Auto-generated method stub
		return echiquier.getPieceColor(x, y);
	}
	
	public void addObserver(Observer observer){
		
	}
	/*public List<PieceIHM> notifyObservers (){
		
		List<PieceIHM> list = new List<PieceIHM>();
		
		return list;
	}*/
	
	
	

	public static void main(String[] args) {
				
		ChessGame c= new ChessGame();
		boolean isMoveOK = false;
		
		System.out.println("Test classe ChessGame\n");
		
		System.out.println(c);
	
		System.out.print("\n Déplacement de 3,6 vers 3,4 = ");
		isMoveOK = c.move(3, 6, 3, 4);		// true
		System.out.println(c.toString() + "\n");	

		
		System.out.print("\n Déplacement de 3,4 vers 3,6 = ");		
		isMoveOK = c.move(3, 4, 3, 6); 	// false : autre joueur
		System.out.println(c.toString() + "\n");	
		
		
		System.out.print("\n Déplacement de 3,4 vers 3,6 = ");		
		isMoveOK = c.move(3, 4, 3, 6); 	// false : algo KO
		System.out.println(c.toString() + "\n");	

		// ...
	
		
	
		
		
	}

}

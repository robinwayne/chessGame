package launcher.localLauncher;

import java.util.Observer;

import model.BoardGames;
import model.ChessGame;
import vue.ChessGameCmdLine;
import controler.ChessGameControler;
import controler.ChessGameControlers;




/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode console.
 */
public class LauncherCmdLine {
	
	public static void main(String[] args) {		
		
		BoardGames model;
		ChessGameControlers controler;	
		ChessGameCmdLine vue;
		
		model = new ChessGame();	
		controler = new ChessGameControler(model);
		
		new ChessGameCmdLine(controler);	
		
		vue = new ChessGameCmdLine(controler);
	
		vue.go();
	}

}

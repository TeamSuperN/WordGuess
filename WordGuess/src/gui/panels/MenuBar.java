package gui.panels;

import javax.swing.JMenuBar;
import gui.panels.menubar.GameMenu;
import gui.panels.menubar.WindowMenu;

public class MenuBar extends JMenuBar
{
	private GameMenu gameMenu;
	private WindowMenu windowMenu;
	/*
	 * 	This creates the custom MenuBar 
	 * 	In the Future it would probably 
	 * 	be smart to find a way to 
	 * 	seperate this into its own class
	 */
	public MenuBar()														
	{
		//Initialize main menu bar objects
		gameMenu = new GameMenu("Game");
		windowMenu = new WindowMenu("Window");
		
		//******setMnemonicsKeys********//
		//TODO: Fix
		//gameMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));		//CTRL+G
		//windowMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));	//CTRL+W
	
		//Add them to main menu bar
		add(gameMenu);
		add(windowMenu);
	}		
}

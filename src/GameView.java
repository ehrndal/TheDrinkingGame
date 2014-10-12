import java.awt.Color;

import javax.swing.*;

public class GameView extends JPanel{
	private JButton quit = new JButton("Quit");
	
	public GameView(){
		this.setBackground(Color.blue);
		this.add(quit);
	}
	
	public JButton getQuitBtn(){
		return quit;
	}
}

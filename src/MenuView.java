import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuView extends JPanel{
	private JButton start = new JButton("Start game");
	private JButton settings = new JButton("Settings");
	private JButton about = new JButton("About DkG");
	
	public MenuView(){
		this.setLayout(null);
		this.setBackground(Color.black);
		this.add(start);
		this.add(settings);
		this.add(about);
		
		Dimension  sS = Toolkit.getDefaultToolkit().getScreenSize();
		
		start.setBounds((int)(sS.width/2.7), (int)(sS.height/6), 400, 100);
		settings.setBounds((int)(sS.width/2.7), (int) (sS.height/3), 400, 100);
		about.setBounds((int)(sS.width/2.7), (int) (sS.height/2), 400, 100);
	}
	
	public JButton getStartBtn(){
		return start;
	}
	
}

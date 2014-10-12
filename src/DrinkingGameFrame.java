import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DrinkingGameFrame extends javax.swing.JFrame{
	private CardLayout c;
	private JPanel cards;
	
	private MenuView mV = new MenuView();
	private GameView gV = new GameView();
	
	public DrinkingGameFrame(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		mV.setName("menuView");
		gV.setName("gameView");
		
		initComponents();	
		
		this.add(cards);
		
		c.show(cards, mV.getName());
	}
	
	private void initComponents(){
		c = new CardLayout();
		cards = new JPanel();
		
		cards.setLayout(c);
		cards.add(mV, mV.getName());
		cards.add(gV, gV.getName());
		
		mV.getStartBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.show(cards, gV.getName());
			}
		});
		
		gV.getQuitBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.show(cards, mV.getName());
			}
		});
	}                
}

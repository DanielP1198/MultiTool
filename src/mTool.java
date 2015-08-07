import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mTool extends JFrame {
	
	public static String Tool; 
	
 
	public static void main(String args[]){
		
		//Window characteristics
		mTool frame = new mTool();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setTitle("MultiTool");
		frame.setResizable(false);
		
		//THIS IS THE MENU PANEL
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		JButton tCalc = new JButton("Calculator");
		tCalc.addActionListener(new Action());
		JButton tEditor = new JButton("Text Editor");
		tEditor.addActionListener(new Action());
		JButton tGame = new JButton("Game");
		tGame.addActionListener(new Action());
		frame.add(panel,BorderLayout.NORTH);
		panel.add(tCalc,gbc);
		panel.add(tEditor,gbc);
		panel.add(tGame,gbc);
		
	
		
	
		
	}
	// THIS ACTUALLY DOESNT ACTUALLY WORK
	// HAVE TO USE CARD LAYOUT ^^^^
	
	/*
	public static void initUi(){
		
		
		JPanel calcPanel = new JPanel();
		JPanel editPanel = new JPanel();
		JPanel gamePanel = new JPanel();
		calcPanel.setLayout(new GridBagLayout());
		editPanel.setLayout(new GridBagLayout());
		gamePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15,15,15);
		//Calc
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JButton adding = new JButton("Add");
		
		//THESE ARE THE SEPERATE TOOL PANELS
		
		
		
		
		/*if(Tool == "Calculator"){
			frame.add(calcPanel,gbc);
			calcPanel.add(num1,gbc);
			calcPanel.add(num2,gbc);
			calcPanel.add(adding,gbc);
			System.out.println("Hello");
		
		}else{
			frame.remove(calcPanel);
			
		}
		
		
		
		
		if(Tool == "Text Editor"){
			frame.add(editPanel,gbc);
		}
		else{
			frame.remove(editPanel);
		}
		
		
		
		if(Tool == "Game"){
			frame.add(gamePanel,gbc);
		}
		else{
			frame.remove(gamePanel);
		}
	
	
	
		
	}
	*/
	static class Action implements ActionListener{
		
	
		
		@Override
		public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		
		if(name.equals("Calculator")){
			Tool = name;
		}else if(name.equals("Text Editor")){
			Tool = name;
		}else if(name.equals("Game")){
			Tool = name;
		}
		//initUi();
		
		}
		
	}
	
	

	
	

	
	
}

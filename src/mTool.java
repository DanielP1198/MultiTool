import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mTool extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static String Tool; 
	public static float answ;
	
 
	public static void main(String args[]){
		
		//Window characteristics
		mTool frame = new mTool();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		
		frame.setTitle("MultiTool");
		frame.setResizable(false);
		
		//THIS IS THE MENU PANEL
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15,15,15);

		JButton tCalc = new JButton("Calculator");
		JButton tEditor = new JButton("Text Editor");
		JButton tGame = new JButton("Game");
		frame.add(panel,BorderLayout.NORTH);
		panel.add(tCalc,gbc);
		panel.add(tEditor,gbc);
		panel.add(tGame,gbc);
		
		JPanel panelCont = new JPanel();
		CardLayout cl = new CardLayout();
		
		
		JPanel calcPanel = new JPanel();
		JPanel editPanel = new JPanel();
		JPanel gamePanel = new JPanel();
		calcPanel.setLayout(new GridBagLayout());
		editPanel.setLayout(new GridBagLayout());
		gamePanel.setLayout(new GridBagLayout());
		
		panelCont.setLayout(cl);
		
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JButton adding = new JButton("Add");
		JButton subtract = new JButton("Subtract");
		JButton divide = new JButton("Divide");
		JButton multiply = new JButton("Multiply");
		JLabel answer = new JLabel("0.0");
		
		
		//added font size------------------------------------------------------------
		
		answer.setFont(new Font("TimesRoman", Font.PLAIN, 24));;
		//----------------------------------------------------------------------------

		calcPanel.add(num1,gbc);

		calcPanel.add(num2,gbc);
		
	
		calcPanel.add(answer,gbc);
		
		
		//Added these buttons -------------------------------------------------------

		
		//THESE ARE FORMATTED
		gbc.gridx = 0;
		gbc.gridy = 1;		
		calcPanel.add(adding,gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		calcPanel.add(subtract,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		calcPanel.add(divide,gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		calcPanel.add(multiply,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;


		
		
		panelCont.add(calcPanel, "Calculator");
		panelCont.add(editPanel, "Editor");
		panelCont.add(gamePanel, "Game");
		cl.show(panelCont, "Calculator");
		
		
		//This is the panel events
		
		tCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "Calculator");
					
			}
		});
		tEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "Editor");
					
			}
		});
		tGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(panelCont, "Game");
					
			}
		});
		frame.add(panelCont);
		//Calc buttons--------------------------------------------------------------------------------------------------
		
			//Adding PANELS-------------------------------------------------------------------------------------------------
			adding.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					float Num1 = 0;
					float Num2 = 0;
					try {
						Num1 = Float.parseFloat(num1.getText());
						Num2 = Float.parseFloat(num2.getText());
					} catch (NumberFormatException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, "Please enter a valid number.");
					}
					//Adds
					if(Num1 != 0 || Num2 != 0){
					answ = Num1+Num2;				
					answer.setText(""+answ);
					System.out.println(answ);
					}
				}
			});
			//Subtracting
			subtract.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					float Num1 = 0;
					float Num2 = 0;
					try {
						Num1 = Float.parseFloat(num1.getText());
						Num2 = Float.parseFloat(num2.getText());
					} catch (NumberFormatException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, "Please enter a valid number.");
					}
					//Adds
					if(Num1 != 0 || Num2 != 0){
					answ = Num1-Num2;				
					answer.setText(""+answ);
					System.out.println(answ);
					}
				}
			});
			//Dividing
			divide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					float Num1 = 0;
					float Num2 = 0;
					try {
						Num1 = Float.parseFloat(num1.getText());
						Num2 = Float.parseFloat(num2.getText());
					} catch (NumberFormatException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, "Please enter a valid number.");
					}
					//Adds
					if(Num1 != 0 || Num2 != 0){
					answ = Num1/Num2;				
					answer.setText(""+answ);
					System.out.println(answ);
					}
				}
			});
			//Multiplying
			multiply.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					float Num1 = 0;
					float Num2 = 0;
					try {
						Num1 = Float.parseFloat(num1.getText());
						Num2 = Float.parseFloat(num2.getText());
					} catch (NumberFormatException error) {
						error.printStackTrace();
						JOptionPane.showMessageDialog(null, "Please enter a valid number.");
					}
					//Adds
					if(Num1 != 0 || Num2 != 0){
					answ = Num1*Num2;				
					answer.setText(""+answ);
					System.out.println(answ);
					}
				}
			});
		//</Calc buttons>----------------------------------------------------------------------------
		
		
		
		frame.setVisible(true);
		
	}
	
	

	
}

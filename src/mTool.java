import java.awt.BorderLayout;
import java.awt.CardLayout;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mTool extends JFrame {
	
	public static String Tool; 
	public static double answ;
	
 
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
		JLabel answer = new JLabel();
		
		calcPanel.add(num1,gbc);
		calcPanel.add(num2,gbc);
		calcPanel.add(answer, gbc);
		calcPanel.add(adding,gbc);
		
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
		//Calc buttons
		
		//Adding
		adding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Num1 = 0;
				double Num2 = 0;
				try {
					Num1 = Double.parseDouble(num1.getText());
					Num2 = Double.parseDouble(num2.getText());
				} catch (NumberFormatException error) {
					error.printStackTrace();
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}

				if(Num1 != 0 || Num2 != 0){
				answ = Num1+Num2;
				answer.setText(""+(int)answ);
				System.out.println(answ);
				}
			}
		});
		
		
		
	
		
	}
	
	

	
}

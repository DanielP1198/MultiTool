import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class mTool extends JFrame {
	
	public static String Tool; 
	public static double answ;
	
 
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
		gbc.insets = new Insets(10,10,10,10);
//		gbc.fill = GridBagConstraints.HORIZONTAL;
		
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
		JTextArea tf = new JTextArea();
		JScrollPane scroll = new JScrollPane(tf);
		scroll.setPreferredSize(new Dimension(600,450));//600x450
		editPanel.add( scroll, gbc);
		gbc.gridy = gbc.NORTH;		
		gbc.gridy = gbc.CENTER;
		JButton open = new JButton("Open");
		
		JButton save = new JButton("Save");
		gbc.weighty = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		gbc.gridheight = 0;
		gbc.gridwidth = 0;
		gbc.anchor = gbc.LAST_LINE_START;
		editPanel.add(open, gbc);
	 	gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = gbc.LAST_LINE_END;
		editPanel.add(save, gbc);
		final JFileChooser fc = new JFileChooser();
		final JFileChooser fc1 = new JFileChooser();
		fc1.setApproveButtonText("Save");
		fc.setCurrentDirectory(new java.io.File("."));
		fc.setDialogTitle("File Explorer");
		
		
		
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
		// button for opening
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
					BufferedReader br;
					try {
						br = new BufferedReader(new FileReader(fc.getSelectedFile()));
						String line;
						while((line = br.readLine()) != null){
							tf.append(line + "\n");
						}
						br.close();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				System.out.println("You chose: "+fc.getSelectedFile().getAbsolutePath());
				
			}
		});
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fc1.showOpenDialog(save) == JFileChooser.APPROVE_OPTION){
					BufferedWriter bw;
					try {
						if(fc1.getSelectedFile().getName().contains(".txt")){
							bw = new BufferedWriter(new FileWriter(fc1.getSelectedFile()));
						} else {
							bw = new BufferedWriter(new FileWriter(fc1.getSelectedFile()+".txt"));
						}
						bw.write(tf.getText());
						bw.close();
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				System.out.println("You chose: "+fc1.getSelectedFile().getAbsolutePath());
				
			}
		});
		frame.setVisible(true);
	}
	
	

	
}

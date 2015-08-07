import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

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
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		JButton tCalc = new JButton("Calculator");
		JButton t2 = new JButton("Tool2");
		frame.add(panel,BorderLayout.NORTH);
		panel.add(tCalc,gbc);
		panel.add(t2,gbc);
		
		if(Tool != null){initUi();}
		
	}
	
	public static void initUi(){
		if(Tool == "Calculator"){
			
		}
		else{
			
		}
		
		
			
	}
	
	
}

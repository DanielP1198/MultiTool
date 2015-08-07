import javax.swing.JFrame;

public class mTool extends JFrame {
 
	public static void main(String args[]){
		mTool frame = new mTool();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setTitle("MultiTool");
		frame.setResizable(false);
		
	}
}

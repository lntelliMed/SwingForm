import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private JPanel panel = new JPanel();
	private GridBagConstraints constraints = new GridBagConstraints();
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenu editMenu = new JMenu("Edit");
	
	public MainFrame(){
		initComponenets();
	}
	
	public void initComponenets(){
		setTitle("GridBagLayout");
		setSize(new Dimension(500,400));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuBar.add(fileMenu);
		
		menuBar.add(editMenu);
		menuBar.setVisible(true);
		
		
		
		add(panel);
		panel.setLayout(new GridBagLayout());
		JButton buttonZero = new JButton("Button0");
		JButton buttonOne = new JButton("Button1");
		JButton buttonTwo = new JButton("Button2");
		JButton buttonThree = new JButton("Button3");
		JButton buttonFour = new JButton("Button4");
		JButton buttonFive = new JButton("Button5");
		JButton buttonSix = new JButton("Button6");
		JButton buttonSeven = new JButton("Button7");
		JButton buttonEight = new JButton("Button8");
		
		


		setJMenuBar(menuBar);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		panel.add(buttonZero, constraints);
		constraints.gridx++;
		panel.add(buttonOne, constraints);
		constraints.gridx++;
		panel.add(buttonTwo, constraints);
		
		
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=2;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		panel.add(buttonThree, constraints);
		
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=1;
		constraints.gridheight=2;
		constraints.fill=GridBagConstraints.VERTICAL;
		constraints.gridx=2;
		panel.add(buttonFour, constraints);
		
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=1;
		constraints.gridheight=2;
		constraints.fill=GridBagConstraints.VERTICAL;
		panel.add(buttonFive, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		panel.add(buttonSix, constraints);
		
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=3;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;		
		panel.add(buttonSeven, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.insets=new Insets(0,0,0,0);
		constraints.gridwidth=3;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		panel.add(buttonEight, constraints);

	
	}

	
	public static void main(String[] args){
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}

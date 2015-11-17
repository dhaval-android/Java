package SubFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{

	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
	
	
	public LeftPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		
		this.setLayout(new GridLayout(8, 2));
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button10 = new JButton("10");
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(button10);
		JLabel a;
		
		
		
	}
}

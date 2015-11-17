package SubFrame;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftPanel extends JPanel{

	private ImageIcon ic_Circle,ic_Line,ic_Rec,ic_Triangle;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
	
	
	public LeftPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		ic_Circle = new ImageIcon("resource/circle.png");
		ic_Line = new ImageIcon("resource/line.png");
		ic_Rec = new ImageIcon("resource/rec.png");
		ic_Triangle = new ImageIcon("resource/triangle.png");
		
		
		
		button1 = new JButton(ic_Circle);
		button2 = new JButton(ic_Line);
		button3 = new JButton(ic_Rec);
		button4 = new JButton(ic_Triangle);

		
		button1.setSize(50, 50); button1.setBackground(Color.DARK_GRAY);  button1.setBorderPainted(false); button1.setFocusPainted(false);
		button2.setSize(50, 50); button2.setBackground(Color.DARK_GRAY);  button2.setBorderPainted(false); button2.setFocusPainted(false);
		button3.setSize(50, 50); button3.setBackground(Color.DARK_GRAY);  button3.setBorderPainted(false); button3.setFocusPainted(false);
		button4.setSize(50, 50); button4.setBackground(Color.DARK_GRAY);  button4.setBorderPainted(false); button4.setFocusPainted(false);
		

		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);

		JLabel a;
		
		
		
	}
}

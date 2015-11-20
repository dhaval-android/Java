package SubFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Infomation.Infomation;

public class LeftPanel extends JPanel implements ActionListener{

	private ImageIcon ic_Circle,ic_Line,ic_Rec,ic_Triangle,ic_era;
	private JButton button1,button2,button3,button4,button5;
	
	
	public LeftPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		ic_Circle = new ImageIcon("resource/circle.png");
		ic_Line = new ImageIcon("resource/line.png");
		ic_Rec = new ImageIcon("resource/rec.png");
		ic_Triangle = new ImageIcon("resource/triangle.png");
		ic_era = new ImageIcon("resource/era.png");
		
		
		button1 = new JButton(ic_Circle);
		button2 = new JButton(ic_Line);
		button3 = new JButton(ic_Rec);
		button4 = new JButton(ic_Triangle);
		button5 = new JButton(ic_era);
		
		
		button1.setSize(50, 50); button1.setName("circle"); button1.setBackground(Color.DARK_GRAY);  button1.setBorderPainted(false); button1.setFocusPainted(false);
		button2.setSize(50, 50); button2.setName("line"); button2.setBackground(Color.DARK_GRAY);  button2.setBorderPainted(false); button2.setFocusPainted(false);
		button3.setSize(50, 50); button3.setName("rec"); button3.setBackground(Color.DARK_GRAY);  button3.setBorderPainted(false); button3.setFocusPainted(false);
		button4.setSize(50, 50); button4.setName("triangle"); button4.setBackground(Color.DARK_GRAY);  button4.setBorderPainted(false); button4.setFocusPainted(false);
		button5.setSize(50, 50); button5.setName("era"); button5.setBackground(Color.DARK_GRAY);  button5.setBorderPainted(false); button5.setFocusPainted(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		
	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton currentButton = (JButton)e.getSource();
		
		switch(currentButton.getName())
		{
		case "circle" : Infomation.getInstance().setCurrentMode(Infomation.MODE_DRAW_CIRCLE); break;
		case "line" : Infomation.getInstance().setCurrentMode(Infomation.MODE_DRAW_LINE); break;
		case "rec" : Infomation.getInstance().setCurrentMode(Infomation.MODE_DRAW_REC); break;
		case "triangle" : Infomation.getInstance().setCurrentMode(Infomation.MODE_DRAW_TRIANGLE); break;
		case "era" : Infomation.getInstance().setCurrentMode(Infomation.MODE_ERAGE); break;
		
		default : break;
		}
		
		
	}
}

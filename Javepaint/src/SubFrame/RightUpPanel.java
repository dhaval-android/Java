package SubFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.util.EventListener;	//AWT의 event를 담고있는 헤더
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.LayoutManager;

public class RightUpPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	public RightUpPanel()
	{
		this.setBackground(Color.RED);
		this.setLayout(new BorderLayout());	//지금 Panel의 배치형태를 GirdLayout(1,4)형태로 설정한다.
		
		JLabel JL = new JLabel("information");
		JL.setSize(550,50);
	
		JColorChooser JC = new JColorChooser();
		JC.setPreferredSize(new Dimension(550,380));
		this.add(JC,BorderLayout.CENTER);
		this.add(JL, BorderLayout.SOUTH);
	}
}

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

import java.util.EventListener;	//AWT�� event�� ����ִ� ���
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
		this.setLayout(new BorderLayout());	//���� Panel�� ��ġ���¸� GirdLayout(1,4)���·� �����Ѵ�.
		
		JLabel JL = new JLabel("information");
		JL.setSize(550,50);
	
		JColorChooser JC = new JColorChooser();
		JC.setPreferredSize(new Dimension(550,380));
		this.add(JC,BorderLayout.CENTER);
		this.add(JL, BorderLayout.SOUTH);
	}
}

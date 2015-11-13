package Frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import SubFrame.BottomPanel;
import SubFrame.DrawPanel;
import SubFrame.LeftPanel;
import SubFrame.RightDownPanel;
import SubFrame.RightUpPanel;
import SubFrame.TopMenu;
import SubFrame.TopPanel;

public class MainFrame extends JFrame{

	private DrawPanel drawPanel;
	private TopPanel topPanel;
	private LeftPanel leftPanel;
	private RightUpPanel rightUpPanel;
	private RightDownPanel rightDownPanel;
	private BottomPanel bottomPanel;
	private TopMenu menuBar;


	
	public MainFrame()
	{
		//�г� ��ü ����
		drawPanel = new DrawPanel();
		topPanel = new TopPanel();
		leftPanel = new LeftPanel();
		rightUpPanel = new RightUpPanel();
		rightDownPanel = new RightDownPanel();
		bottomPanel = new BottomPanel();
		
		
		//�г� ��ġ�� ����
		this.add(drawPanel,BorderLayout.CENTER);
		this.add(topPanel, BorderLayout.NORTH);
		this.add(leftPanel, BorderLayout.WEST);
		
		JPanel rightMergePanel =new JPanel();
		rightMergePanel.add(rightUpPanel);
		rightMergePanel.add(rightDownPanel);
		
		this.add(rightMergePanel, BorderLayout.EAST);
		this.add(bottomPanel, BorderLayout.SOUTH);
		

		//�޴� ����
		menuBar = new TopMenu();
		this.setJMenuBar(menuBar);

	}
	
}
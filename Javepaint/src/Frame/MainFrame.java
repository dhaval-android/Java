package Frame;

import java.awt.BorderLayout;



import javax.swing.JFrame;
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
	
		//패널 객체 생성
		drawPanel = new DrawPanel();
		topPanel = new TopPanel();
		leftPanel = new LeftPanel();
		rightUpPanel = new RightUpPanel();
		rightDownPanel = new RightDownPanel();
		bottomPanel = new BottomPanel();
		
		
		
		//패널 위치에 배정
		this.add(drawPanel,BorderLayout.CENTER);
		this.add(topPanel, BorderLayout.NORTH);
		this.add(leftPanel, BorderLayout.WEST);
		
		JPanel rightMergePanel =new JPanel();
		rightMergePanel.setLayout( new BorderLayout() );
		rightMergePanel.add(rightUpPanel,BorderLayout.NORTH);
		rightMergePanel.add(rightDownPanel, BorderLayout.SOUTH);
		
		
		this.add(rightMergePanel, BorderLayout.EAST);
		this.add(bottomPanel, BorderLayout.SOUTH);
		
		
		

		//메뉴 생성
		menuBar = new TopMenu();
		this.setJMenuBar(menuBar);

	}
	
}

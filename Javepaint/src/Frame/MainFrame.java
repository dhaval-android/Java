package Frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import SubFrame.BottomLabel;
import SubFrame.LeftPanel;
import SubFrame.TopMenu;



public class MainFrame extends JFrame{

	private LeftPanel leftPanel;
	private BottomLabel bottomLabel;
	private TopMenu menuBar;




	
	public MainFrame()
	{
	
		//패널 객체 생성
		leftPanel = new LeftPanel();
		bottomLabel = new BottomLabel("바닥");
		
		
		
		//패널 위치에 배정
		this.add(leftPanel, BorderLayout.WEST);
		this.add(bottomLabel, BorderLayout.SOUTH);
		

		//메뉴 생성
		menuBar = new TopMenu();
		this.setJMenuBar(menuBar);

		
		
		MainDesktopPane mainDesktopPane= new MainDesktopPane();
		this.add(mainDesktopPane);
	}
	
}

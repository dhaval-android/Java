package Frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import SubFrame.BottomLabel;
import SubFrame.DrawInternalFrame;
import SubFrame.LeftPanel;
import SubFrame.TopMenu;
import SubFrame.TopPanel;



public class MainFrame extends JFrame{

	private LeftPanel leftPanel;
	private BottomLabel bottomLabel;
	private TopPanel topPanel;
	private TopMenu menuBar;	
	private  MainDesktopPane mainDesktopPane;

	
	public MainFrame(String name)
	{
	
		super(name);
		//패널 객체 생성
		leftPanel = new LeftPanel();
		bottomLabel = new BottomLabel("바닥");
		topPanel = new TopPanel();
	

		
		//패널 위치에 배정

		this.add(leftPanel, BorderLayout.WEST);
		this.add(bottomLabel, BorderLayout.SOUTH);
		this.add(topPanel,BorderLayout.NORTH);

		
		//메뉴 생성
		menuBar = new TopMenu();
		this.setJMenuBar(menuBar);

		
		
		mainDesktopPane= new MainDesktopPane();
		this.add(mainDesktopPane);
	}
	
	
	public void addDrawFrame(String name)
	{
		DrawInternalFrame newFrame = new DrawInternalFrame(name);
		newFrame.setSize(500, 500);
		mainDesktopPane.addDrawFrameToSet(name, newFrame);
		mainDesktopPane.add(newFrame);
	}


	
}

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
		//�г� ��ü ����
		leftPanel = new LeftPanel();
		bottomLabel = new BottomLabel("�ٴ�");
		topPanel = new TopPanel();
	

		
		//�г� ��ġ�� ����

		this.add(leftPanel, BorderLayout.WEST);
		this.add(bottomLabel, BorderLayout.SOUTH);
		this.add(topPanel,BorderLayout.NORTH);

		
		//�޴� ����
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

package Frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import Information.Information;
import SubFrame.BottomLabel;
import SubFrame.DrawInternalFrame;
import SubFrame.GetSpecifcColorInternalFrame;
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
		bottomLabel = new BottomLabel("Start");
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

	public void setBottomLabel(String text)
	{
		Color color =Information.getInstance().getCurrentColor();
		String mode = Information.getInstance().getCurrentModeToString();
		bottomLabel.setText("현재 모드 : "+ mode+"   현재 좌표 : "+ text +
				"    R : "+ color.getRed()+" G : "+ color.getGreen()+" B : "+ color.getBlue());
	}
	
	public void setBottomLabel(Color color)
	{
		String mode = Information.getInstance().getCurrentModeToString();
		bottomLabel.setText("현재 모드 : "+ mode+"   현재 좌표 : Out of frame"+ "    R : "+ color.getRed()+" G : "+ color.getGreen()+" B : "+ color.getBlue());
	}

	public void callColorFrame()
	{
		GetSpecifcColorInternalFrame getSpecifcColorInternalFrame = new GetSpecifcColorInternalFrame();
		mainDesktopPane.add(getSpecifcColorInternalFrame);
	}



	
}

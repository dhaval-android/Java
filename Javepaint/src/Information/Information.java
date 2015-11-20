package Information;

import java.awt.Color;

public class Information {

	public static Information instance;
	
	public static Information getInstance()
	{
		if(instance==null)
		{
			instance = new Information();
		}
		return instance;
	}
	
	
	
	public static final String PROGRAM_NAME ="JAVA PAINTER PROJECT";
	public static final int PROGRAM_WIDTH = 1600;
	public static final int PROGRAM_HEIGHT = 900;
	
	public static final int MODE_DRAW_REC=1;
	public static final int MODE_DRAW_TRIANGLE=2;
	public static final int MODE_DRAW_CIRCLE=3;
	public static final int MODE_DRAW_LINE=4;
	public static final int MODE_ERAGE=5;
	
	
	
	
	
	
	
	private int DrawFrame_Count =1;
	private int CurrentMode=0;
	
	private Color currentColor=new Color(0,0,0);
	
	
	public  int getDrawFrame_Count(){return DrawFrame_Count;}
	public  void addDrawFrame_Count(){DrawFrame_Count++;}
	
	public String getCurrentModeToString()
	{
		switch(CurrentMode)
		{
		case MODE_DRAW_REC : return "사각형 그리기";
		case MODE_DRAW_TRIANGLE : return "삼각형 그리기";
		case MODE_DRAW_CIRCLE : return "원 그리기";
		case MODE_DRAW_LINE : return "선 그리기";
		case MODE_ERAGE : return "지우기";
		default : return "선택된 모드가 없습니다.";
		}
		
	}

	public void setCurrentMode(int mode)
	{
		CurrentMode=mode;
	}
	
	public Color getCurrentColor()
	{
		return currentColor;
	}
	public void setCurrentColor(int R, int G, int B)
	{
		Color changeColor = new Color(R,G,B);
		currentColor= changeColor;
	}
}

package Infomation;

public class Infomation {

	public static Infomation instance;
	
	public static Infomation getInstance()
	{
		if(instance==null)
		{
			instance = new Infomation();
		}
		return instance;
	}
	
	
	
	public static final String PROGRAM_NAME ="JAVA PAINTER PROJECT";
	public static final int PROGRAM_WIDTH = 1600;
	public static final int PROGRAM_HEIGHT = 900;
	
	
	public static int DrawFrame_Count =1;
	
	
	public static int getDrawFrame_Count(){return DrawFrame_Count;}
	public static void addDrawFrame_Count(){DrawFrame_Count++;}
	
}

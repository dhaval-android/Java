
import javax.swing.JButton;
import javax.swing.JFrame;


public class GUI extends JFrame   // JFrame�� ��ӹ��� 
{
	
	
	
	public GUI()
	{
		super( "Paint X GUI" );
		
		setLayout( null ); // �������� ���̾ƿ��� ������.
		
		//GUI ������Ʈ�� ������

		JButton button1 = new JButton ( "Add" );
		JButton button2 = new JButton ( "Delete" );
		JButton button3 = new JButton ( "View" );
		JButton button4 = new JButton ( "NLL1" );
		JButton button5 = new JButton ( "NLL2" );
		
		// ttextArea1 �� weightx�� weighty�� ����Ʈ ������ 0�� ����
		// ��� ������Ʈ�� anchor�� CENTER�� �����Ѵ�.
		
		int width = getWidth();
		int height = getHeight();
		System.out.printf("Width = %d , Height  = %d \n" , width, height);
		
		int setX = 1300;
		button1.setBounds(setX - 70*5,700,70,20);
		button2.setBounds(setX - 70*4,700,70,20);
		button3.setBounds(setX - 70*3,700,70,20);
		button4.setBounds(setX - 70*2,700,70,20);
		button5.setBounds(setX - 70*1,700,70,20);
		// size�� �޾ƿ;��Ѵ�.
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		System.out.printf("Width = %d , Height  = %d \n" , width, height);

		
	} // GridBagFrame�� ������ ����
	
	
	
	

//	private void addComponent( Component component, int row, int col, int width, int height)
//	{
//		constraints.gridx = col;
//		constraints.gridy = row;
//		constraints.gridwidth = width;
//		constraints.gridheight = height;
//		
//		layout.setConstraints( component , constraints);
//		add( component );
//		
//	}
	
	public static void main( String[] args )
	{
		GUI grid = new GUI();
		grid.setDefaultCloseOperation(EXIT_ON_CLOSE);
		grid.setSize( 1400, 800);
		grid.setVisible( true );
	}

}

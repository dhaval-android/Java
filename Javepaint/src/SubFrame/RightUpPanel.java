package SubFrame;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JPanel;
import java.util.EventListener;	//AWT의 event를 담고있는 헤더
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Panel;

public class RightUpPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	public RightUpPanel()
	{
		this.setBackground(Color.RED);

		this.setLocation(240,0);	//프레임 내에서 위쪽 패널위치의 시작점을 설정하는 메소드(X,Y값으로 설정)
		this.setSize(240,300); //패널 사이즈를 설정!
		this.setVisible(true);
		
		this.setLayout(new GridLayout(4,1));	//지금 Panel의 배치형태를 GirdLayout(1,4)형태로 설정한다.
		
		Panel p1 = new Panel();		//판넬 안에서 새로운 판넬 4개생성
		p1.setBackground(Color.BLACK);
		Panel p2 = new Panel();		//판넬의 매개변수는 지정된 레이아웃형태이다.
		p2.setBackground(Color.DARK_GRAY);
		Panel p3 = new Panel();
		p3.setBackground(Color.GREEN);
		Panel p4 = new Panel();
		p4.setBackground(Color.PINK);
		
		this.add(p1);		//판넬안에 4개의 판넬을 붙여 영역을 설정한다.
		this.add(p2);		//자연스럽게 가로1칸 세로4칸으로 나뉘어서 추가된다.
		this.add(p3);
		this.add(p4);
		
	}
}

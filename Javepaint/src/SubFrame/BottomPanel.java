package SubFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;	//flowLayout배치(한줄로 쭉배치하기위함)
import java.awt.BorderLayout;
import java.util.EventListener;	//AWT의 event를 담고있는 헤더
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Button;



public class BottomPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public BottomPanel()	//아래 패널 생성.
	{
		this.setBackground(Color.RED);
		this.setLocation(0,500);	//프레임 내에서 아래쪽 패널위치의 시작점을 설정하는 메소드(X,Y값으로 설정)
		this.setSize(240,300); //패널 사이즈를 설정!
		this.setVisible(true);
		
		this.setLayout(new GridLayout(1,4));	//지금 Panel의 배치형태를 GirdLayout(1,4)형태로 설정한다.
		
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

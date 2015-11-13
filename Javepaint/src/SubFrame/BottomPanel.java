package SubFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;	//flowLayout��ġ(���ٷ� �߹�ġ�ϱ�����)
import java.awt.BorderLayout;
import java.util.EventListener;	//AWT�� event�� ����ִ� ���
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Button;



public class BottomPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	public BottomPanel()	//�Ʒ� �г� ����.
	{
		this.setBackground(Color.RED);
		this.setLocation(0,500);	//������ ������ �Ʒ��� �г���ġ�� �������� �����ϴ� �޼ҵ�(X,Y������ ����)
		this.setSize(240,300); //�г� ����� ����!
		this.setVisible(true);
		
		this.setLayout(new GridLayout(1,4));	//���� Panel�� ��ġ���¸� GirdLayout(1,4)���·� �����Ѵ�.
		
		Panel p1 = new Panel();		//�ǳ� �ȿ��� ���ο� �ǳ� 4������
		p1.setBackground(Color.BLACK);
		Panel p2 = new Panel();		//�ǳ��� �Ű������� ������ ���̾ƿ������̴�.
		p2.setBackground(Color.DARK_GRAY);
		Panel p3 = new Panel();
		p3.setBackground(Color.GREEN);
		Panel p4 = new Panel();
		p4.setBackground(Color.PINK);
		
		this.add(p1);		//�ǳھȿ� 4���� �ǳ��� �ٿ� ������ �����Ѵ�.
		this.add(p2);		//�ڿ������� ����1ĭ ����4ĭ���� ����� �߰��ȴ�.
		this.add(p3);
		this.add(p4);
	}
	
}

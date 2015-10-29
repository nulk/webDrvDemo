package webDrvDemo;

import java.awt.*;
//import java.awt.event.*;
//import java.applet.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class myWin extends JFrame implements ListSelectionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final boolean dbg=true;
	public myWin(String name,JButton button,Color c,int w,int h){
		super();
		setTitle(name);
		setSize(w,h);
		Container con=getContentPane();
		con.add(button);
		con.setBackground(c);
	}
	/*
	if(!dbg){
		JList lst1,lst2;
		String news[]={"人民日报","新民晚报","浙江日报","文汇报"};
		String sports[]={"足球","排球","乒乓球","篮球"};
		JTextArea txtdemo;
		public myWin(String str){
			super(str);
			Container con=getContentPane();
			con.setVisible(false);
			con.setBackground(Color.blue);
		}
	@Override
		public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		}
	}
	*/
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class UserDefineComboBoxModel extends AbstractListModel implements ComboBoxModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String item=null;
	String[] str={"基线环境","兰州银行","青岛银行","天津银行","枣庄银行","汉口银行","绍兴银行"};
	public Object getElementAt(int index){
		return str[index++];
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return str.length;
	}
	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return item;
	}
	@Override
	public void setSelectedItem(Object anItem) {
		// TODO Auto-generated method stub
		item=(String)anItem;
	}

	
}

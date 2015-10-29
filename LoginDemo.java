package webDrvDemo;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.*;

public class LoginDemo{
	static final boolean dbg = true;
	public LoginDemo(){
		JFrame frm1=new JFrame("JComboBox");
		frm1.setSize(300, 200);
		frm1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evnt)
			{
				System.exit(0);
			}
		});
		GridLayout lyt=new GridLayout(3,1);
		frm1.setLayout(lyt);
		JPanel mstrPane=new JPanel();
		JPanel slvPane1=new JPanel();
		mstrPane.setLayout(new FlowLayout());
		slvPane1.setLayout(new BorderLayout());
		ComboBoxModel modl=new UserDefineComboBoxModel();
		JComboBox combo=new JComboBox(modl);
		JLabel lbl=new JLabel("欢迎使用自动登录！");
		slvPane1.add(lbl,"North");
		slvPane1.add(combo,"South");
		mstrPane.add(slvPane1);
		frm1.setContentPane(mstrPane);
		frm1.setVisible(dbg);
	}
	public static void main(String[] args) {    
		//如果火狐浏览器没有默认安装在C盘，需要制定其路径
		//System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla firefox/firefox.exe");
		if(!dbg){
			System.setProperty("webdriver.ie.driver", "D:/ProgramFiles/seleniumdriver/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("http://192.168.77.55:8090/bbsp");
			driver.manage().window().maximize();
			WebElement user = driver.findElement(By.name("userNo"));
			user.sendKeys("7902"); 
			user.submit();
		}
		new LoginDemo();
	}
}


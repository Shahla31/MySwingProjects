
package com.shahla.SwingsBankingAppCoding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class M1Login extends JFrame implements ActionListener{
    
    static JLabel us,pwd;
	static JPasswordField pw;
	static JButton bt1, bt2;
	static JTextField tx1,tx2;
        
	
	public static void main(String[] args)
	{             
		JFrame f=new JFrame("Login");
		tx1=new JTextField();
		tx1.setBounds(100, 30, 150, 30);
		
		pw=new JPasswordField();	
		pw.setBounds(100, 75, 150, 30);
		
		us=new JLabel("User");
		us.setBounds(20, 30, 80, 30);
		
		pwd=new JLabel("Password");
		pwd.setBounds(20, 75, 80, 30);
            		
		bt1=new JButton("login");
		bt1.setBounds(10, 120, 70, 40);
        bt1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       
                                                     
            if (tx1.getText().equals("test1@gmail.com")&&pw.getText().equals("test"))
            {
                NewPage page =new NewPage();
                page.setVisible(true);
                JLabel wel=new JLabel("Welcome : "+tx1.getText());
                page.getContentPane().add(wel);
                        
            }
            else
            {
                System.out.println("Username or Password is incorrect");
                
            }
                    }
                });
                
                
        bt2=new JButton("register");
		bt2.setBounds(180, 120, 70, 40);
        bt2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                         M2HomePage page1 = new M2HomePage();
                         page1.setVisible(true);
                        
                    }
                });
				
		f.add(pw);
		f.add(us);
		f.add(pwd);
		f.add(bt1);
        f.add(bt2);
		f.add(tx1);         
	
		f.setSize(300,250);
		f.setLayout(null);
		f.setVisible(true);
                                        
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

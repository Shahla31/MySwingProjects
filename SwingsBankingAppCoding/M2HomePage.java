
package com.shahla.SwingsBankingAppCoding;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class M2HomePage extends JFrame implements ActionListener
{
        JTextArea t;
	JFrame f;
	JMenuItem mi1,mi2,mi3;
    public M2HomePage() {
        
                f = new JFrame("Home");
		t = new JTextArea();
                
                JMenuBar mb = new JMenuBar();
		
                JMenu m1 = new JMenu("File");
                
                 mi1 = new JMenuItem("Open New Account");
                 mi2 = new JMenuItem("Print Customer Balance");
                 mi3 = new JMenuItem("Quit Bank System");
		
        mi1.addActionListener(this);
		
		mi2.addActionListener(this);
		
		mi3.addActionListener(this);
	
                JMenu m2 = new JMenu("Edit");
                
                JMenu m3 = new JMenu("View");
                
                JMenu m4 = new JMenu("Option");
                
                JMenu m5 = new JMenu("Window");
                
                JMenu m6 = new JMenu("Help");
                
                m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
                
                mb.add(m1);
		mb.add(m2);
                mb.add(m3);
                mb.add(m4);
		mb.add(m5);
                mb.add(m6);
                
                f.setJMenuBar(mb);
		f.add(t);
		f.setSize(500, 500);
		f.setLayout(null);
                f.setVisible(true);
    }
    public static void main(String[] args) {
        new M2HomePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()==mi1)
    	{	
    	CreateAccount ca = new CreateAccount();
    	ca.setVisible(true);
    	}
    	if(e.getSource()==mi2)
    	{
    	CusDetails cd = new CusDetails();
//    	cd.setVisible(true);
    	}
    	if(e.getSource()==mi3)
    	{
    		f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
      	}
    	
    }
        
}

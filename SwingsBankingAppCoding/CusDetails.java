
package com.shahla.SwingsBankingAppCoding;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;


public class CusDetails extends JFrame implements ActionListener
{
    
    	JFrame frame;
        JPanel jp;
	JButton jb;
	public CusDetails() {
		
		frame =new JFrame("View Customer Details");
                
                //jp = new JPanel();
               // jp.setBounds(300,10,200,100);
               // jp.setBackground(Color.LIGHT_GRAY);
               // frame.add(jp);
                
                
                jb= new JButton("VIEW CUSTOMER DETAILS");
                //jb.setBounds(300, 400, 200, 70);
                
		String []head= {"Account Number","Customer Name","Opening Date","Bank Balance"};
		String s1[][]= {{"1111","Arun","March/3/2003","10000"},
				{"2222","Neethu","April/4/2004","150000"},
				{"4444","Dhanya","May/5/2005","500000"},
				{"66666","Pradheesh","June/7/2007","600000"},
				{"88888","Mlayaras","July/4/2010","600000"},
                                {"9999","Rahul","June/6/2005","55555"},
                                {"101010","Anup","June/6/2005","750000"},
                                {"12222","Ammu","June/5/2020","500000"},
                                {"55555","Syam","June/8/2021","100000"}};
		

		JTable tbl=new JTable(s1, head);
 		tbl.setBounds(400, 300, 300, 200);
 		
 		JScrollPane js=new JScrollPane(tbl);
 	    
                //jp.add(jb, BorderLayout.NORTH);
               // jp.add(jb);
                frame.add(jb);
 		frame.add(js);
 		frame.setSize(800,400);
		frame.setVisible(true);

		
	}
	public static void main(String[] args) {
                CusDetails cusDetails = new CusDetails();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

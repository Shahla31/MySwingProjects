
package com.shahla.SwingsBankingAppCoding;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.JToolBar;

public class CreateAccount extends JFrame implements ActionListener
{
        JFrame jf;
        JLabel lblTitle,lblAccNo,lblPName,lblDepAmt,lblDepDate;
	JTextField txtAccNo,txtPName,txtDepAmt;
	//JToolBar tl1,tl2,t3;
	JButton btnSave, btnCancel;

    public CreateAccount() 
    {
                jf=new JFrame();
                
                lblTitle=new JLabel("Create Account");  
		lblTitle.setBounds(350,40,300,50);
		lblTitle.setForeground(Color.red);
                
                lblAccNo=new JLabel("Account Number : ");  
		lblAccNo.setBounds(250,100,150,30);
		lblAccNo.setForeground(Color.red);
                
                txtAccNo=new JTextField();
		txtAccNo.setBounds(400,100,200,30);
                
                lblPName=new JLabel("Person Name : ");  
		lblPName.setBounds(250,150,150,30);
		lblPName.setForeground(Color.red);
		
		txtPName=new JTextField();
		txtPName.setBounds(400,150,200,30);
				
		lblDepAmt=new JLabel("Deposit Amount:"); 
		lblDepAmt.setBounds(250,200,150,30);
		lblDepAmt.setForeground(Color.red);
		
		txtDepAmt=new JTextField();
		txtDepAmt.setBounds(400,200,200,30);
		
		lblDepDate=new JLabel("Deposit Date :");  
		lblDepDate.setBounds(250,250,150,30);
		lblDepDate.setForeground(Color.red);
		
 
		String []Months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		JComboBox<String> jb1=new JComboBox<String>(Months);
		jb1.setBounds(400,250,90,30);
                
                String []Dates= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		JComboBox<String> jb2=new JComboBox<String>(Dates);
		jb2.setBounds(500,250,40,30);
                
                String []Years= {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
                                 "2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
		JComboBox<String> jb3=new JComboBox<String>(Years);
                jb3.setBounds(550,250,70,30);
		
                btnSave=new JButton("Save");
		btnSave.setBounds(300,300,80,30);
		btnSave.setForeground(Color.RED);
                
                btnCancel=new JButton("Cancel");
		btnCancel.setBounds(430,300,80,30);
		btnCancel.setForeground(Color.RED);

		
		jf.add(lblTitle);
		jf.add(lblAccNo); 
		jf.add(lblPName);
		jf.add(lblDepAmt);
		jf.add(lblDepDate);
		jf.add(txtAccNo);
		jf.add(txtPName);
		jf.add(txtDepAmt);
		jf.add(jb1);	 
		jf.add(jb2);
		jf.add(jb3);
		jf.add(btnSave);
		jf.add(btnCancel);
                
                jf.setSize(800,600);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setBackground(Color.GRAY);
 
 
		this.addWindowListener(new WindowAdapter() {
                        @Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
 public static void main(String[] args) {
            new CreateAccount();
    }
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}                    
    }
        
        


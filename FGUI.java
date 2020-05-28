package MyJava;

import javax.swing.*;  
import java.awt.event.*;
import java.awt.Color;

public class FGUI extends WindowAdapter
{  
	JFrame f; 

	FGUI()
		{  
		f = new JFrame();   
		f.addWindowListener(this);  
		f.setSize(800, 534);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
		f.getContentPane().setLayout(null);
    
		JLabel Thanks = new JLabel("Thank you for using AGRODEC!");
		Thanks.setForeground(Color.WHITE);
		Thanks.setHorizontalAlignment(SwingConstants.CENTER);
		Thanks.setBounds(272, 223, 242, 88);
		f.getContentPane().add(Thanks);
    
		JLabel Final_img = new JLabel("");
		Final_img.setForeground(Color.BLACK);
		Final_img.setIcon(new ImageIcon("/Users/admin/Desktop/field.jpg"));
		Final_img.setBounds(0, 0, 800, 512);
		f.getContentPane().add(Final_img);
		f.setVisible(true);  

		}  
	
		public void windowClosing(WindowEvent e) 
		{  
			int a = JOptionPane.showConfirmDialog(f,"Are you sure?");  
			if(a == JOptionPane.YES_OPTION)
			{  
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			}  
		}  

		public static void main(String[] args) 
	
		{  
			new  FGUI();  
		}

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

	
    
}  


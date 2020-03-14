package com.example.chintu;
import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;

/*public class BackgroundImageJFrame extends JFrame

{ 

    BackgroundImageJFrame()
    {  

    	setTitle("Background Color for JFrame");
        setSize(800,534);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("/Users/admin/Desktop/field.jpg")));
        setLayout(new FlowLayout());
    }
*/
public class Test implements ActionListener
    {
    	JTextField tf1,tf2,tf3,tf4; 
        JLabel l1,l2,l3,l4;
        JButton b1,b2; 
        Test()
        {  
    	
    	l1 = new JLabel("Rainfall");  
        l1.setBounds(550,150, 100,30);  
        l2 = new JLabel("pH");  
        l2.setBounds(550,200, 100,30); 
        l3 = new JLabel("Type of soil");
        l3.setBounds(550,250,100,30);
        l4 = new JLabel("Result");
        l4.setBounds(550,300,100,30);
        
        JFrame f = new JFrame();  
        
        tf1 = new JTextField();  
        tf1.setBounds(650,150,150,20);  
        tf2 = new JTextField();  
        tf2.setBounds(650,200,150,20);  
        tf3 = new JTextField();  
        tf3.setBounds(650,250,150,20);    
        tf4 = new JTextField();  
        tf4.setBounds(650,300,150,20);
        tf4.setEditable(false);   

        
        b1 = new JButton("Generate");  
        b1.setBounds(600,350,75,75);  
        b2 = new JButton("-");  
        b2.setBounds(670,350,75,75);  
        b1.addActionListener(this);  
        b2.addActionListener(this);
        
        
        f.add(l1); f.add(l2); f.add(l3); f.add(l4);   
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);
        f.add(tf1); f.add(tf2); f.add(tf3); f.add(tf4); f.add(b1); f.add(b2);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    } 
    
    public void actionPerformed(ActionEvent e) 
    {  
        String s1 = tf1.getText();  
        String s2 = tf2.getText(); 
        String s3 = tf3.getText(); 

        int a = Integer.parseInt(s1);  
        int b = Integer.parseInt(s2);
        String c = s3;
        String d = "Loam soil";
        //tf4.setText(c);
        
        if(e.getSource() == b1)
        {  
           if(a <= 80 && b <= 7)
           {
        	  if (c.equals(d))
        	   {
        	   tf4.setText("Wheat");
        	   }
           }
           else
           {
        	   tf4.setText("Invalid");            
           }
        /*}else if(e.getSource() == b2){  
            //c = a-b;  */
        } 
    }   
    
    
public static void main(String[] args) {  
	/*new BackgroundImageJFrame();*/
	new Test();
	new Test();
    
} }  

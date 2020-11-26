package MyJava;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ApurvGUI extends JFrame {

	JFrame frame;
	private JTextField Rainfall;
	private JTextField ph;
	private JTextField Soil_type;
	private JTextField Result;
	private JFrame f; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApurvGUI window = new ApurvGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApurvGUI() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Buttons
		
		JButton Check = new JButton("Check");
		Check.setBounds(335, 370, 117, 29);
		frame.getContentPane().add(Check);
		Check.setOpaque(true);
		Check.setBackground(Color.WHITE);
		
		JButton Clear = new JButton("Clear");
		Clear.setBounds(206, 370, 117, 29);
		frame.getContentPane().add(Clear);
		Clear.setOpaque(true);
		Clear.setBackground(Color.WHITE);
		
		JButton Next = new JButton("Next");
		Next.setBounds(466, 370, 117, 29);
		frame.getContentPane().add(Next);
		Next.setOpaque(true);
		Next.setBackground(Color.WHITE);
		
		//Textfields
		
		Rainfall = new JTextField("Enter Rainfall");
		Rainfall.setBounds(388, 212, 130, 30);
		frame.getContentPane().add(Rainfall);
		Rainfall.setColumns(10);
		
		ph = new JTextField();
		ph.setBounds(388, 250, 130, 30);
		frame.getContentPane().add(ph);
		ph.setColumns(10);
		
		Soil_type = new JTextField();
		Soil_type.setBounds(388, 283, 130, 30);
		frame.getContentPane().add(Soil_type);
		Soil_type.setColumns(10);
		
		Result = new JTextField();
		Result.setBounds(388, 320, 130, 30);
		frame.getContentPane().add(Result);
		Result.setColumns(10);
		Result.setEditable(false);
		
		//Labels
		
		JLabel label_rain = new JLabel("Rainfall");
		label_rain.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_rain.setForeground(Color.BLACK);
		label_rain.setHorizontalAlignment(SwingConstants.CENTER);
		label_rain.setBounds(267, 212, 85, 25);
		frame.getContentPane().add(label_rain);
		label_rain.setOpaque(true);
		label_rain.setBackground(Color.WHITE);
		
		JLabel label_ph = new JLabel("Ph");
		label_ph.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_ph.setForeground(Color.BLACK);
		label_ph.setHorizontalAlignment(SwingConstants.CENTER);
		label_ph.setBounds(267, 250, 85, 25);
		frame.getContentPane().add(label_ph);
		label_ph.setOpaque(true);
		label_ph.setBackground(Color.WHITE);
		
		JLabel label_soil = new JLabel("Soil Type");
		label_soil.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_soil.setForeground(Color.BLACK);
		label_soil.setHorizontalAlignment(SwingConstants.CENTER);
		label_soil.setBounds(267, 288, 85, 25);
		frame.getContentPane().add(label_soil);
		label_soil.setOpaque(true);
		label_soil.setBackground(Color.WHITE);
		
		JLabel label_result = new JLabel("Result");
		label_result.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_result.setForeground(Color.BLACK);
		label_result.setHorizontalAlignment(SwingConstants.CENTER);
		label_result.setBounds(267, 326, 85, 25);
		frame.getContentPane().add(label_result);
		label_result.setOpaque(true);
		label_result.setBackground(Color.WHITE);
		
		JLabel label_info_text_1 = new JLabel("Please Enter All Crop Related Information");
		label_info_text_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_info_text_1.setBounds(206, 128, 377, 38);
		frame.getContentPane().add(label_info_text_1);
		label_info_text_1.setOpaque(true);
		label_info_text_1.setBackground(Color.WHITE);
		
		JLabel label_info_text_2 = new JLabel("Press Clear if a mistake is made while entering the data");
		label_info_text_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_info_text_2.setBounds(206, 165, 377, 29);
		frame.getContentPane().add(label_info_text_2);
		label_info_text_2.setOpaque(true);
		label_info_text_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("/Users/admin/Desktop/field.jpg"));
		lblNewLabel.setBounds(0, 0, 800, 506);
		frame.getContentPane().add(lblNewLabel);
		
		//Functions of the respective buttons
		
		// 1. Clear
		
		Clear.addActionListener(new ActionListener()
		
		{  
		
			public void actionPerformed(ActionEvent e)
			
			{
			
				Soil_type.setText("");
				ph.setText("");
				Rainfall.setText("");
				Result.setText("");
				JOptionPane.showMessageDialog(frame, "You have cleared all the data");
				
		    } 
			
		});
		
		// 2. Check
		
		Check.addActionListener(new ActionListener()
		
		{  
		
			public void actionPerformed(ActionEvent e)
			
			{  
			
				String s1 = Rainfall.getText();  
				String s2 = ph.getText(); 
				String s3 = Soil_type.getText();
				String Crop = null;
				
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agrodec","<Username>","<password>");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from CropInfo where Rainfall = '"+ s1 + "' and ph = '"+ s2 +"'and SoilType = '"+ s3 +"' ");
					
						if(rs.next())
						{
						Crop = rs.getString(4);
						
						JOptionPane.showMessageDialog(frame, Crop);
						Result.setText(Crop);
						con.close();
						}
						else {
							JOptionPane.showMessageDialog(frame, "Error");
						}
					}
				
				catch(Exception r)
				
				{	
				
					JOptionPane.showMessageDialog(frame, "Error");

				
				}
				
		     } 
		});
		
		//3. Next
		
		Next.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				int a = JOptionPane.showConfirmDialog(f,"Are you sure you want to go to the next page?"); 
				if(a == JOptionPane.YES_OPTION)
				{  
					FGUI test = new FGUI();
					test.setVisible(true); 
				}
			}  
		});
		
		
    }

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}






package MyJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

	private JFrame frame;
	private JTextField Rainfall;
	private JTextField ph;
	private JTextField Soil_type;
	private JTextField Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Buttons
		
		JButton Check = new JButton("Check");
		Check.setBounds(170, 216, 117, 29);
		frame.getContentPane().add(Check);
		
		JButton Clear = new JButton("Clear");
		Clear.setBounds(50, 216, 117, 29);
		frame.getContentPane().add(Clear);
		
		JButton Next = new JButton("Next");
		Next.setBounds(290, 216, 117, 29);
		frame.getContentPane().add(Next);
		
		//Textfields
		
		Rainfall = new JTextField("Enter Rainfall");
		Rainfall.setBounds(195, 53, 130, 26);
		frame.getContentPane().add(Rainfall);
		Rainfall.setColumns(10);
		
		ph = new JTextField();
		ph.setBounds(195, 91, 130, 26);
		frame.getContentPane().add(ph);
		ph.setColumns(10);
		
		Soil_type = new JTextField();
		Soil_type.setBounds(195, 129, 130, 26);
		frame.getContentPane().add(Soil_type);
		Soil_type.setColumns(10);
		
		Result = new JTextField();
		Result.setBounds(195, 167, 130, 26);
		frame.getContentPane().add(Result);
		Result.setColumns(10);
		Result.setEditable(false);
		
		//Labels
		
		JLabel label_rain = new JLabel("Rainfall");
		label_rain.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_rain.setForeground(Color.WHITE);
		label_rain.setHorizontalAlignment(SwingConstants.CENTER);
		label_rain.setBounds(98, 58, 61, 16);
		frame.getContentPane().add(label_rain);
		
		JLabel label_ph = new JLabel("Ph");
		label_ph.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_ph.setForeground(Color.WHITE);
		label_ph.setHorizontalAlignment(SwingConstants.CENTER);
		label_ph.setBounds(98, 96, 61, 16);
		frame.getContentPane().add(label_ph);
		
		JLabel label_soil = new JLabel("Soil Type");
		label_soil.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_soil.setForeground(Color.WHITE);
		label_soil.setHorizontalAlignment(SwingConstants.CENTER);
		label_soil.setBounds(98, 134, 61, 16);
		frame.getContentPane().add(label_soil);
		
		JLabel label_result = new JLabel("Result");
		label_result.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		label_result.setForeground(Color.WHITE);
		label_result.setHorizontalAlignment(SwingConstants.CENTER);
		label_result.setBounds(98, 172, 61, 16);
		frame.getContentPane().add(label_result);
		
		JLabel label_Image = new JLabel("");
		label_Image.setIcon(new ImageIcon("/Users/admin/Desktop/field.jpg"));
		label_Image.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(label_Image);
		
		
		//Functions of the respective buttons
		
		// 1. Clear
		
		Clear.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				Soil_type.setText("");
				ph.setText("");
				Rainfall.setText("");
		        }  
		});
		
		// 2. Check
		
		Check.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				String s1 = Rainfall.getText();  
				String s2 = ph.getText(); 
				String s3 = Soil_type.getText();
				
				
				//Storing the varibales for easy transfer
				
				int Rainfall = Integer.parseInt(s1);  
				int Ph = Integer.parseInt(s2);
				String Soil_type = s3;
			//	String d = "Loam soil";
				
				
				//Functionality
				if(Rainfall < 120)
					{
						if(Ph == 7)
						{
							if(Soil_type == "Red")
							{
								Result.setText("Achivement complete");
							}	
						}
					}
				
				else {
					Result.setText("Error");
				}
				
				// Printing of the value
				
		        }  
		});
		

		Next.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
				// Link to the next window
				
		        }  
		});
}
}
	




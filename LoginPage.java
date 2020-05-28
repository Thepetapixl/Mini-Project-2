package MyJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;


public class LoginPage extends JFrame {
 private JFrame frame;
 private JPanel contentPane;
 private JTextField textField;
 private JPasswordField passwordField;
 private JFrame f;
 
 
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     LoginPage frame = new LoginPage();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }
 
 
 /**
  * Create the frame.
  */
 public LoginPage() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 895, 803);
  contentPane = new JPanel();
  contentPane.setBackground(SystemColor.textHighlight);
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  
  JPanel panel_1 = new JPanel();
  panel_1.setForeground(Color.WHITE);
  panel_1.setBounds(513, 0, 372, 764);
  panel_1.setBackground(Color.WHITE);
  contentPane.add(panel_1);
  panel_1.setLayout(null);
  
  JButton btnSignUp = new JButton("SIGN IN");
  
  btnSignUp.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    String url = "jdbc:mysql://127.0.0.1:3306/login";
    
    
    try {
    	
     Connection conn = DriverManager.getConnection(url,"root","Apurv@12345");
     Statement statement = conn.createStatement();
     String sql = "Select * from login where Username = '"+ textField.getText() + "' and password ='" + passwordField.getText().toString() +"'";
     ResultSet rs = statement.executeQuery(sql);
     
     if(rs.next())
     {
    	JOptionPane.showMessageDialog(frame, "YOU HAVE SUCCESSFULLY LOGGED IN");
    	ApurvGUI window = new ApurvGUI();
		window.frame.setVisible(true);	
     }
     
     else
     {
      JOptionPane.showConfirmDialog(frame, "YOU ARE not logged in");
     }
      
     
    } catch (SQLException e1) {
     
     e1.printStackTrace();
    }
   }
  });
  
  
  
  btnSignUp.setForeground(new Color(0, 0, 128));
  btnSignUp.setHorizontalAlignment(SwingConstants.LEADING);
  btnSignUp.setBackground(SystemColor.textHighlight);
  btnSignUp.setFont(new Font("Arial", Font.BOLD, 21));
  btnSignUp.setBounds(116, 445, 119, 41);
  panel_1.add(btnSignUp);
  
  JLabel lblUsername = new JLabel("USERNAME:");
  lblUsername.setForeground(Color.BLACK);
  lblUsername.setFont(new Font("Cambria", Font.BOLD, 20));
  lblUsername.setBounds(67, 133, 134, 41);
  panel_1.add(lblUsername);
  
  JLabel lblPassword = new JLabel("PASSWORD:");
  lblPassword.setForeground(Color.BLACK);
  lblPassword.setFont(new Font("Cambria", Font.BOLD, 20));
  lblPassword.setBounds(73, 286, 112, 41);
  panel_1.add(lblPassword);
  
  textField = new JTextField();
  textField.setBounds(67, 192, 233, 34);
  panel_1.add(textField);
  textField.setColumns(10);
  
  passwordField = new JPasswordField();
  passwordField.setBounds(67, 351, 233, 34);
  panel_1.add(passwordField);
  
  JLabel lblIfNewUser = new JLabel("IF NEW USER REGISTER HERE");
  lblIfNewUser.setForeground(SystemColor.textHighlight);
  lblIfNewUser.setFont(new Font("Arial", Font.ITALIC, 13));
  lblIfNewUser.setBackground(new Color(176, 224, 230));
  lblIfNewUser.setBounds(77, 636, 223, 16);
  panel_1.add(lblIfNewUser);
  
  
  
  JButton btnRegister = new JButton("REGISTER");
  btnRegister.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    
     RegistrationPage reg = new  RegistrationPage();
     reg.setVisible(true);
    
   }
  });
  
  
  
  btnRegister.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
  btnRegister.setForeground(new Color(0, 0, 128));
  btnRegister.setBackground(SystemColor.textHighlight);
  btnRegister.setBounds(119, 666, 134, 34);
  panel_1.add(btnRegister);
  
  JLayeredPane layeredPane = new JLayeredPane();
  layeredPane.setBounds(67, 227, 233, 1);
  panel_1.add(layeredPane);
  
  JLayeredPane layeredPane_1 = new JLayeredPane();
  layeredPane_1.setBounds(67, 387, 233, 1);
  panel_1.add(layeredPane_1);
  
  JLayeredPane layeredPane_2 = new JLayeredPane();
  layeredPane_2.setBounds(67, 178, 1, 1);
  panel_1.add(layeredPane_2);
  
  JLayeredPane layeredPane_3 = new JLayeredPane();
  layeredPane_3.setBounds(67, 164, 112, 1);
  panel_1.add(layeredPane_3);
  
  JLayeredPane layeredPane_4 = new JLayeredPane();
  layeredPane_4.setBounds(72, 315, 119, 1);
  panel_1.add(layeredPane_4);
  
  JLabel lblLogij = new JLabel("Login");
  lblLogij.setForeground(new Color(0, 120, 215));
  lblLogij.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 25));
  lblLogij.setBounds(67, 38, 223, 41);
  panel_1.add(lblLogij);
  
  JSeparator separator = new JSeparator();
  separator.setForeground(SystemColor.textHighlight);
  separator.setBounds(67, 93, 239, 1);
  panel_1.add(separator);
  
  JLayeredPane layeredPane_6 = new JLayeredPane();
  layeredPane_6.setBounds(27, 777, 755, 1);
  layeredPane_6.setBackground(Color.BLACK);
  contentPane.add(layeredPane_6);
  
  JLabel lblAgrodecElcomesYou = new JLabel("AGRODEC WELCOMES YOU");
  lblAgrodecElcomesYou.setForeground(SystemColor.text);
  lblAgrodecElcomesYou.setFont(new Font("Segoe UI Semibold", Font.BOLD, 31));
  lblAgrodecElcomesYou.setBounds(27, 47, 474, 59);
  contentPane.add(lblAgrodecElcomesYou);
  
  JLabel lblNewLabel = new JLabel("");
  lblNewLabel.setIcon(new ImageIcon("/Users/admin/Desktop/Login11.png"));
  lblNewLabel.setBounds(6, 176, 509, 538);
  contentPane.add(lblNewLabel);
 }
}


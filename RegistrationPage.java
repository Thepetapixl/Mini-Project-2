package MyJava;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;

public class RegistrationPage extends JFrame {
 private JFrame frame;
 private JPanel contentPane;
 private JTextField textField_1;
 private JPasswordField passwordField_1;
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     RegistrationPage frame = new RegistrationPage();
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
 public RegistrationPage() {
  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 659, 600);
  contentPane = new JPanel();
  contentPane.setForeground(Color.WHITE);
  contentPane.setBackground(Color.WHITE);
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(188, 334, 2, -226);
  contentPane.add(separator);
  
  JSeparator separator_1 = new JSeparator();
  separator_1.setForeground(Color.BLACK);
  separator_1.setBounds(202, 104, -12, 212);
  contentPane.add(separator_1);
  
  JButton btnRegister = new JButton("SIGN UP");
  btnRegister.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
  btnRegister.setBounds(311, 432, 318, 43);
  
  contentPane.add(btnRegister);
  btnRegister.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
  btnRegister.setBackground( new Color(241,57,83));
  
  textField_1 = new JTextField();
  textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
  textField_1.setColumns(10);
  textField_1.setBounds(311, 159, 318, 51);
  contentPane.add(textField_1);
  
  JSeparator separator_2 = new JSeparator();
  separator_2.setBounds(311, 208, 318, 2);
  contentPane.add(separator_2);
  
  JLabel label = new JLabel("USERNAME :");
  label.setFont(new Font("Dialog", Font.PLAIN, 17));
  label.setBounds(311, 114, 123, 43);
  contentPane.add(label);
  
  JSeparator separator_4 = new JSeparator();
  separator_4.setBounds(311, 365, 318, 2);
  contentPane.add(separator_4);
  
  passwordField_1 = new JPasswordField();
  passwordField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
  passwordField_1.setBounds(311, 316, 318, 51);
  contentPane.add(passwordField_1);
  
  JLabel label_1 = new JLabel("PASSWORD:");
  label_1.setFont(new Font("Dialog", Font.PLAIN, 17));
  label_1.setBounds(311, 260, 140, 43);
  contentPane.add(label_1);
  
  JPanel panel = new JPanel();
  panel.setBackground(Color.DARK_GRAY);
  panel.setBounds(12, 13, 277, 527);
  contentPane.add(panel);
  panel.setLayout(null);
  
  JLabel lblNewLabel = new JLabel("");
  lblNewLabel.setIcon(new ImageIcon("/Users/admin/Desktop/signup.png"));
  lblNewLabel.setBounds(24, 141, 228, 245);
  panel.add(lblNewLabel);
  
  JLabel label_2 = new JLabel("SIGNUP");
  label_2.setForeground(Color.WHITE);
  label_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 40));
  label_2.setBounds(63, 42, 173, 34);
  panel.add(label_2);
  
  JSeparator separator_3 = new JSeparator();
  separator_3.setBounds(28, 89, 224, 2);
  panel.add(separator_3);
  btnRegister.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    String userName1 = textField_1.getText();
    String password1 = passwordField_1.getText();
    String url ="jdbc:mysql://127.0.0.1:3306/login";   
    try {
     Connection conn=DriverManager.getConnection(url,"root","Apurv@12345");
     Statement statement = conn.createStatement();
      PreparedStatement pst = conn.prepareStatement("insert into login(username,password) values(?,?)");
     
       pst.setString(1,userName1);
           pst.setString(2, password1);
           int i = pst.executeUpdate();
           if(i!=0){
            JOptionPane.showConfirmDialog(frame, "REGISTRATION SUCCESSFUL");
             LoginPage fa = new LoginPage();
             fa.setVisible(true);
             }
             else{
              JOptionPane.showConfirmDialog(frame, "REGISTERED FAIL");
             }
          
     
    } catch (SQLException e) {
     
     e.printStackTrace();
    }
   }
  });
 } 
}


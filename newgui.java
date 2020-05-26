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
import javax.swing.UIManager;
public class newgui extends JFrame {
 private JPanel contentPane;
 private JTextField textField;
 private JPasswordField passwordField;
 JLabel lblNewLabel ;
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     newgui frame = new newgui();
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
 public newgui() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 1169, 958);
  contentPane = new JPanel();
  contentPane.setBackground(UIManager.getColor("CheckBox.light"));
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JPanel panel = new JPanel();
  panel.setBackground(Color.BLACK);
  panel.setBounds(10, 59, 507, 693);
  contentPane.add(panel);
  
  /*lblNewLabel = new JLabel("");
  lblNewLabel.setBounds(93, 137, 278, 321);
  lblNewLabel.setBackground(Color.LIGHT_GRAY);
  Image image= new ImageIcon(this.getClass().getResource("rutika..jpg")).getImage();
  panel.setLayout(null);
  lblNewLabel.setIcon(new ImageIcon(image));
  panel.add(lblNewLabel);*/
  
  JPanel panel_1 = new JPanel();
  panel_1.setBackground(new Color(51, 51, 102));
  panel_1.setBounds(533, 62, 351, 690);
  contentPane.add(panel_1);
  panel_1.setLayout(null);
  
  JButton btnSignUp = new JButton("SIGN UP");
  btnSignUp.setForeground(new Color(0, 0, 128));
  btnSignUp.setHorizontalAlignment(SwingConstants.LEADING);
  btnSignUp.setBackground(Color.ORANGE);
  btnSignUp.setFont(new Font("Arial", Font.BOLD, 21));
  btnSignUp.setBounds(116, 380, 119, 41);
  panel_1.add(btnSignUp);
  
  JLabel lblUsername = new JLabel("USERNAME:");
  lblUsername.setForeground(Color.WHITE);
  lblUsername.setFont(new Font("Cambria", Font.BOLD, 20));
  lblUsername.setBounds(67, 71, 134, 41);
  panel_1.add(lblUsername);
  
  JLabel lblPassword = new JLabel("PASSWORD:");
  lblPassword.setForeground(new Color(255, 255, 255));
  lblPassword.setFont(new Font("Cambria", Font.BOLD, 20));
  lblPassword.setBounds(73, 224, 112, 41);
  panel_1.add(lblPassword);
  
  textField = new JTextField();
  textField.setBounds(67, 130, 233, 34);
  panel_1.add(textField);
  textField.setColumns(10);
  
  passwordField = new JPasswordField();
  passwordField.setBounds(67, 289, 233, 34);
  panel_1.add(passwordField);
  
  JLabel lblIfNewUser = new JLabel("IF NEW USER REGISTER HERE");
  lblIfNewUser.setForeground(Color.WHITE);
  lblIfNewUser.setFont(new Font("Arial", Font.ITALIC, 13));
  lblIfNewUser.setBackground(new Color(176, 224, 230));
  lblIfNewUser.setBounds(77, 485, 223, 16);
  panel_1.add(lblIfNewUser);
  
  JButton btnRegister = new JButton("REGISTER");
  btnRegister.setForeground(new Color(0, 0, 128));
  btnRegister.setBackground(Color.ORANGE);
  btnRegister.setBounds(111, 514, 112, 34);
  panel_1.add(btnRegister);
  
  JLayeredPane layeredPane = new JLayeredPane();
  layeredPane.setBounds(67, 165, 233, 1);
  panel_1.add(layeredPane);
  
  JLayeredPane layeredPane_1 = new JLayeredPane();
  layeredPane_1.setBounds(67, 325, 233, 1);
  panel_1.add(layeredPane_1);
  
  JLayeredPane layeredPane_2 = new JLayeredPane();
  layeredPane_2.setBounds(67, 116, 1, 1);
  panel_1.add(layeredPane_2);
  
  JLayeredPane layeredPane_3 = new JLayeredPane();
  layeredPane_3.setBounds(67, 102, 112, 1);
  panel_1.add(layeredPane_3);
  
  JLayeredPane layeredPane_4 = new JLayeredPane();
  layeredPane_4.setBounds(72, 253, 119, 1);
  panel_1.add(layeredPane_4);
  
  JPanel panel_3 = new JPanel();
  panel_3.setBounds(0, 0, 351, 49);
  panel_1.add(panel_3);
  panel_3.setBackground(Color.ORANGE);
  panel_3.setLayout(null);
  
  JLabel lblLogin = new JLabel("LOGIN");
  lblLogin.setBounds(133, 0, 136, 49);
  lblLogin.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 30));
  panel_3.add(lblLogin);
  
  JLabel label = new JLabel("WELCOME TO AGRODEC ");
  label.setBackground(Color.BLACK);
  label.setForeground(Color.BLACK);
  label.setFont(new Font("Vineta BT", Font.ITALIC, 26));
  label.setBounds(354, 13, 501, 36);
  contentPane.add(label);
  
  JLayeredPane layeredPane_5 = new JLayeredPane();
  layeredPane_5.setBackground(Color.BLACK);
  layeredPane_5.setBounds(0, 48, 755, 1);
  contentPane.add(layeredPane_5);
  
  JLayeredPane layeredPane_6 = new JLayeredPane();
  layeredPane_6.setBackground(Color.BLACK);
  layeredPane_6.setBounds(27, 777, 755, 1);
  contentPane.add(layeredPane_6);
 }
}
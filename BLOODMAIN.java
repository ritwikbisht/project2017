import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButtonMenuItem;
public class BLOODMAIN extends JFrame {
 private JPanel contentPane;
 private JTextField NAME;
 private JTextField ADDRESS;
 private JTextField PHONE;
 private JTextField REFERENCE;
 private JTextField textField;
 private JTable searchtable;
 private JTextField textField_1;
 private JTextField textField_2;
 private JTextField textField_3;
 private JTextField textField_4;
 private JTextField textField_7;
 private JTextField textField_8;
 private JTable table;
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     BLOODMAIN frame = new BLOODMAIN();
   frame.setBounds(10, 20, 1366, 768);
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
 
 
 
 
 
 public BLOODMAIN() {
  setBackground(new Color(255, 255, 255));
  
  
  
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(0, 0, 1050, 700);
  contentPane = new JPanel();
  contentPane.setBackground(new Color(224, 255, 255));
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JMenuBar menuBar = new JMenuBar();
  menuBar.setBounds(0, 0, 1366, 21);
  contentPane.add(menuBar);
  
  JMenu mnFile = new JMenu("FILE");
  menuBar.add(mnFile);
  
  JMenuItem mntmNew = new JMenuItem("new");
  mnFile.add(mntmNew);
  
  JMenuItem mntmDelete = new JMenuItem("delete");
  mnFile.add(mntmDelete);
  
  JMenuItem mntmExit = new JMenuItem("exit");
  mnFile.add(mntmExit);
  
  JLabel lblBloodDonation = new JLabel("BLOOD DONATION");
  lblBloodDonation.setBackground(new Color(152, 251, 152));
  lblBloodDonation.setForeground(Color.RED);
  lblBloodDonation.setHorizontalAlignment(SwingConstants.CENTER);
  lblBloodDonation.setFont(new Font("Eras Bold ITC", Font.BOLD, 45));
  lblBloodDonation.setBounds(10, 32, 1014, 78);
  contentPane.add(lblBloodDonation);
  
  JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
  tabbedPane.setBackground(new Color(240, 248, 255));
  tabbedPane.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
  tabbedPane.setBounds(20, 121, 1300, 580);
  contentPane.add(tabbedPane);
  
  JPanel panel = new JPanel();
  panel.setBackground(new Color(255, 228, 196));
  tabbedPane.addTab("ADD DONOR", null, panel, null);
  
  panel.setLayout(null);
  
  JLabel lblAddDonationPerson = new JLabel("DONOR   INFORMATION");
  lblAddDonationPerson.setBackground(new Color(255, 235, 205));
  lblAddDonationPerson.setForeground(Color.BLUE);
  lblAddDonationPerson.setHorizontalAlignment(SwingConstants.CENTER);
  lblAddDonationPerson.setFont(new Font("Papyrus", Font.BOLD, 25));
  lblAddDonationPerson.setBounds(0, 0, 1001, 76);
  panel.add(lblAddDonationPerson);
  
  JLabel lblNewLabel = new JLabel("NAME");
  lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  lblNewLabel.setBounds(20, 81, 180, 38);
  panel.add(lblNewLabel);
  
  NAME = new JTextField();
  NAME.setBounds(267, 81, 266, 38);
  panel.add(NAME);
  NAME.setColumns(10);
  
  JLabel lblBloodGroup = new JLabel("  BLOOD GROUP");
  lblBloodGroup.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  lblBloodGroup.setBounds(10, 137, 180, 38);
  panel.add(lblBloodGroup);
  
  JLabel lblAddress = new JLabel("  ADDRESS");
  lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  lblAddress.setBounds(10, 245, 180, 38);
  panel.add(lblAddress);
  
  ADDRESS = new JTextField();
  ADDRESS.setColumns(10);
  ADDRESS.setBounds(267, 245, 266, 38);
  panel.add(ADDRESS);
  
  JLabel lblPhone = new JLabel("  PHONE ");
  lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  lblPhone.setBounds(10, 310, 180, 38);
  panel.add(lblPhone);
  
  PHONE = new JTextField();
  PHONE.setColumns(10);
  PHONE.setBounds(267, 313, 266, 38);
  panel.add(PHONE);
  
  JLabel lblReference = new JLabel("  REFERENCE");
  lblReference.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  lblReference.setBounds(10, 379, 180, 38);
  panel.add(lblReference);
  
  REFERENCE = new JTextField();
  REFERENCE.setColumns(10);
  REFERENCE.setBounds(267, 382, 266, 38);
  panel.add(REFERENCE);
  
  String [] options={ "AB+","AB-","O+","O-","A+","A-","B+","B-"};
  JComboBox Bloodgrp = new JComboBox(options);
  Bloodgrp.setBounds(267, 143, 266, 32);
  
//       comboBox=new JComboBox(options);
       Bloodgrp.setBackground(Color.white);
       panel.add(Bloodgrp);
      
       JLabel lblGender = new JLabel("  GENDER");
       lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
       lblGender.setBounds(10, 202, 137, 14);
       panel.add(lblGender);
      
       ButtonGroup bg = new ButtonGroup();
       JRadioButtonMenuItem bm = new JRadioButtonMenuItem("Male");
       bm.setFont(new Font("Segoe UI", Font.PLAIN, 14));
       bm.setBackground(new Color(255, 228, 196));
       bm.setBounds(267, 202, 125, 22);
       panel.add(bm);
      
       JRadioButtonMenuItem bf = new JRadioButtonMenuItem("Female");
       bf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
       bf.setBackground(new Color(255, 228, 196));
       bf.setBounds(402, 202, 125, 22);
       panel.add(bf);
      
      
       bg.add(bm);
       bg.add(bf);
      
       JButton btnAddDonor = new JButton("ADD DONOR");
       btnAddDonor.addActionListener((ActionEvent e) -> {
           String name1 = NAME.getText();
           String address = ADDRESS.getText();
           int phone = Integer.parseInt(PHONE.getText());
           String reference = REFERENCE.getText();
           String bgstr= null;
           int bd = Bloodgrp.getSelectedIndex();
           switch(bd)
           {
               case 0: bgstr = "AB+";
               break;
               case 1: bgstr = "AB-";
               break;
               case 2:bgstr = "O+";
               break;
               case 3: bgstr = "O-";
               break;
               case 4: bgstr = "A+";
               break;
               case 5: bgstr = "A-";
               break;
               case 6: bgstr = "B+";
               break;
               case 7:bgstr = "B-";
               break;
               
           }
           System.out.println(name1);
           System.out.println(address);
           System.out.println(phone);
           System.out.println(reference);
           System.out.println(bgstr);
           String gender;
           if(bm.isSelected())
           {
               System.out.println("Male");
               gender = "Male";
           }
           else
           {
               System.out.println("Female");
               gender = "Female";
           }
           PreparedStatement ps;
           String insertquery = "INSERT INTO `bloodbank`(`Name`, `Blood Group`, `Gender`, `Address`, `Phone no`, `Reference`) VALUES (?,?,?,?,?,?)";
      try {
          ps=MyConnection.getConnection().prepareStatement(insertquery);
          ps.setString(1, name1);
          ps.setString(4, address);
          ps.setString(3, gender);
          ps.setString(6, reference);
          ps.setLong(5, phone);
          ps.setString(2, bgstr);
          if(ps.executeUpdate() > 0)
          {
              JOptionPane.showMessageDialog(null, "New user added");
          }
      }catch(SQLException ex)
      {
          
      }
  });
 
        //Define and Execute Query.
        //ps: writing the query
        //rs: executing the query and storing all output rows in resultset. Then you keep on printing rows from rs.
        //PreparedStatement ps = null;
        
      // );
        
       btnAddDonor.setForeground(Color.WHITE);
       btnAddDonor.setFont(new Font("Times New Roman", Font.BOLD, 15));
       btnAddDonor.setBackground(Color.BLUE);
       btnAddDonor.setBounds(761, 312, 137, 38);
       panel.add(btnAddDonor);
      
       JLabel label_4 = new JLabel("");
       label_4.setIcon(new ImageIcon("C:\\Users\\artik\\Desktop\\logo.jpg"));
       label_4.setBounds(698, 92, 285, 213);
       panel.add(label_4);
      
       
 
  JPanel panel_1 = new JPanel();
  panel_1.setBackground(new Color(255, 239, 213));
  tabbedPane.addTab("SEARCH", null, panel_1, null);
  panel_1.setLayout(null);
  
  JLabel label = new JLabel("BLOOD GROUP");
  label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label.setBounds(29, 37, 180, 38);
  panel_1.add(label);
  
  textField = new JTextField();
  textField.setColumns(10);
  textField.setBounds(286, 37, 266, 38);
  panel_1.add(textField);
  
  JButton btnNewButton = new JButton("SEARCH");
  btnNewButton.setBackground(new Color(0, 0, 255));
  btnNewButton.setForeground(new Color(248, 248, 255));
  btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
  btnNewButton.addActionListener((ActionEvent e) -> {
  });
  btnNewButton.setBounds(627, 37, 127, 38);
  panel_1.add(btnNewButton);
  
  JScrollPane scrollPane = new JScrollPane();
  scrollPane.setBounds(29, 131, 830, 384);
  panel_1.add(scrollPane);
  
  searchtable = new JTable();
  scrollPane.setViewportView(searchtable);
  
  JPanel panel_2 = new JPanel();
  panel_2.setBackground(new Color(255, 235, 205));
  tabbedPane.addTab("UPDATE", null, panel_2, null);
  panel_2.setLayout(null);
  
  JLabel label_1 = new JLabel("NAME");
  label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label_1.setBounds(10, 11, 180, 38);
  panel_2.add(label_1);
  
  textField_1 = new JTextField();
  textField_1.setColumns(10);
  textField_1.setBounds(169, 11, 274, 38);
  panel_2.add(textField_1);
  
  JLabel label_2 = new JLabel("BLOOD GROUP");
  label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label_2.setBounds(10, 81, 180, 38);
  panel_2.add(label_2);
  
  textField_2 = new JTextField();
  textField_2.setColumns(10);
  textField_2.setBounds(169, 81, 274, 38);
  panel_2.add(textField_2);
  
  JLabel label_3 = new JLabel("ADDRESS");
  label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label_3.setBounds(10, 150, 180, 38);
  panel_2.add(label_3);
  
  textField_3 = new JTextField();
  textField_3.setColumns(10);
  textField_3.setBounds(169, 150, 274, 38);
  panel_2.add(textField_3);
  
  textField_4 = new JTextField();
  textField_4.setColumns(10);
  textField_4.setBounds(595, 11, 264, 38);
  panel_2.add(textField_4);
  
  textField_7 = new JTextField();
  textField_7.setColumns(10);
  textField_7.setBounds(595, 81, 264, 38);
  panel_2.add(textField_7);
  
  textField_8 = new JTextField();
  textField_8.setColumns(10);
  textField_8.setBounds(595, 150, 264, 38);
  panel_2.add(textField_8);
  
  JLabel label_7 = new JLabel("PHONE ");
  label_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label_7.setBounds(505, 11, 70, 38);
  panel_2.add(label_7);
  
  JLabel label_8 = new JLabel("REFERENCE");
  label_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label_8.setBounds(463, 81, 112, 38);
  panel_2.add(label_8);
  
  JLabel label_9 = new JLabel("WILLING");
  label_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
  label_9.setBounds(495, 150, 80, 38);
  panel_2.add(label_9);
  
  JButton btnUpdate = new JButton("UPDATE");
  btnUpdate.setForeground(Color.WHITE);
  btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
  btnUpdate.setBackground(Color.BLUE);
  btnUpdate.setBounds(417, 218, 137, 38);
  panel_2.add(btnUpdate);
  
  JButton btnShow = new JButton("SHOW");
  btnShow.setForeground(Color.WHITE);
  btnShow.setFont(new Font("Times New Roman", Font.BOLD, 15));
  btnShow.setBackground(Color.BLUE);
  btnShow.setBounds(417, 276, 137, 38);
  panel_2.add(btnShow);
  
  JScrollPane scrollPane_1 = new JScrollPane();
  scrollPane_1.setBounds(10, 347, 849, 168);
  panel_2.add(scrollPane_1);
  
  table = new JTable();
  scrollPane_1.setViewportView(table);
  
  JLabel label_5 = new JLabel("");
  label_5.setIcon(new ImageIcon("C:\\Users\\artik\\Desktop\\title 3.jpg"));
  label_5.setBounds(859, 32, 129, 130);
  contentPane.add(label_5);
 }
}
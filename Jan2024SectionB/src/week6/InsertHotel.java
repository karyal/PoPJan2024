package week6;

import javax.swing.JFrame;//library to create a window
import javax.swing.JLabel; //library to create a label
import javax.swing.JTextField;//library to create a text box
import javax.swing.JButton; //library to create a button

import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InsertHotel implements ActionListener {
	JFrame frame;//declare an object
	JLabel lblHid;
	JLabel lblName;
	JLabel lblAddress;
	JLabel lblPhone;
	JLabel lblEmail;
	
	JTextField txtHid;
	JTextField txtName;
	JTextField txtAddress;
	JTextField txtEmail;
	JTextField txtPhone;
	
	JButton btnSave;
	JButton btnClose;
	
	
	public InsertHotel() { //default constructor
		frame=new JFrame(); //initialize an object
		frame.setSize(350, 250); //width and height
		frame.setTitle("Insert Hotel"); //set title
		frame.setLayout(new FlowLayout()); //set layout
		
		lblHid=new JLabel(); //initialize
		lblHid.setText("Enter HID : "); //set
		
		lblName=new JLabel(); //initialize
		lblName.setText("Enter Name : "); //set
		
		lblAddress=new JLabel(); //initialize
		lblAddress.setText("Enter Address : "); //set
		
		lblPhone=new JLabel(); //initialize
		lblPhone.setText("Enter Phone : "); //set
		
		lblEmail=new JLabel(); //initialize
		lblEmail.setText("Enter Email : "); //set
		
		txtHid = new JTextField(); //initialize
		txtHid.setColumns(20); //set
		
		txtName = new JTextField();
		txtName.setColumns(20);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(20);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(20);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(20);
		
		btnSave = new JButton(); //initialize
		btnSave.setText("SAVE"); //set
		
		btnClose = new JButton();
		btnClose.setText("CLOSE");
		btnClose.addActionListener(this);		
		
		frame.add(lblHid); //add control on frame/window
		frame.add(txtHid);
		
		frame.add(lblName);
		frame.add(txtName);
		
		frame.add(lblAddress);
		frame.add(txtAddress);
		
		frame.add(lblPhone);
		frame.add(txtPhone);
		
		frame.add(lblEmail);
		frame.add(txtEmail);
		
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.setVisible(true); //display window
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			frame.dispose();//Close the window
		}
	}
	
}
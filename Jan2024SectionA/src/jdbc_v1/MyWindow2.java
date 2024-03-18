package jdbc_v1;

//1. Import library
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

//Event Handle
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow2 implements ActionListener {
	//2. declare an object
	JFrame frame;
	JLabel lblID;
	JLabel lblName;
	JLabel lblAddress;
	JLabel lblEmail;
	
	JTextField txtID;
	JTextField txtName;
	JTextField txtAddress;
	JTextField txtEmail;
	
	JButton btnClose;	
	JButton btnSave;
	
	public MyWindow2() {//Default Constructor
		frame=new JFrame(); //Initialize
		frame.setTitle("MyWindow2");
		frame.setSize(250, 375);
		frame.setLayout(new FlowLayout());
		
		lblID = new JLabel(); //Initialize
		lblID.setText("Enter ID :");
		
		lblName = new JLabel(); //Initialize
		lblName.setText("Enter Name :");
		
		lblAddress = new JLabel(); //Initialize
		lblAddress.setText("Enter Address :");
		
		lblEmail = new JLabel(); //Initialize
		lblEmail.setText("Enter Email :");
		
		txtID = new JTextField(); //initialize
		txtID.setColumns(20); //set width
		
		txtName = new JTextField(); //initialize
		txtName.setColumns(20); //set width
		
		txtAddress= new JTextField(); //initialize
		txtAddress.setColumns(20); //set width
		
		txtEmail= new JTextField(); //initialize
		txtEmail.setColumns(20); //set width
		
		btnSave= new JButton(); //initialize
		btnSave.setText("Save");
		
		btnClose = new JButton(); //initialize
		btnClose.setText("Close");
		btnClose.addActionListener(this);
		
		
		frame.add(lblID);
		frame.add(txtID);
		frame.add(lblName);
		frame.add(txtName);
		frame.add(lblAddress);
		frame.add(txtAddress);
		frame.add(lblEmail);
		frame.add(txtEmail);
		
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnClose) {
			frame.dispose();//Close the window
		}
	}
}
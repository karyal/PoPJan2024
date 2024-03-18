package jdbc_v1;

//1. Library import
import javax.swing.JFrame;
import java.awt.FlowLayout;


public class MyWindow {
	JFrame frame;//2. Object declare
	public MyWindow() {
		frame=new JFrame(); //3. Initialize
		frame.setTitle("MyWindow");//Title of Window
		frame.setSize(250, 250); //Width, Height - Size
		frame.setLayout(new FlowLayout()); //Set Layout
		frame.setVisible(true); //4. Show
	}
}
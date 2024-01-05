package revision;
import java.awt.*;
import javax.swing.*;

public class LinePyramid extends JFrame{

	public static void main(String[] args) {
		new LinePyramid();

	}
	
	public LinePyramid()			//Constructor method
	{
		setTitle("Line Pyramid");	//Sets title
		setSize(220,200);			//Sets size of the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Exit the application
		setVisible(true);			//Makes window visible
	}
	
	public void paint(Graphics g) 	//defines the paint method
	{
		g.setColor(Color.red);
		g.drawLine(40,  140,  170,  140); 	//Draws base line
		
		for(int i =0; i<14; i++)
			g.drawLine(40+5*i,  140-5*i, 170-5*i, 140-5*i);
		g.setColor(Color.black);
		g.drawString("Line Pyramid", 70, 160);
	}
}

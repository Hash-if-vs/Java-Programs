package sub_programs;
import java.awt.*;
import java.awt.event.*;

public class MouseInput extends Frame implements MouseListener,MouseMotionListener {
	String txt="";
	public MouseInput() {
	addMouseListener(this);
	addMouseMotionListener(this);
	setSize(600,600);
	setVisible(true);
	addWindowListener (new WindowAdapter(){
	public void windowClosing(WindowEvent we) {
	System.exit(0);
	}
	});
	}
	public void mousePressed(MouseEvent e) {
	setBackground(Color.red);
	System.out.println("Mouse is pressed");
	}
	public void mouseRaleased(MouseEvent e) {
	setBackground(Color.blue);
	System.out.println("Mouse is Released");
	}
	public void mouseClicked(MouseEvent e) {
	setBackground(Color.green);
	System.out.println("Mouse is Clicked");
	}
	public void mouseEntered(MouseEvent e) {
	setBackground(Color.cyan);
	System.out.println("Mouse is Entered");

	}
	public void mouseExited(MouseEvent e) {
	setBackground(Color.black);
	System.out.println("Mouse is Exited");
	setTitle("mouse Exited");

	}
	public void mouseMoved(MouseEvent me)
	{
	txt="mouse is moving";
	setForeground(Color.white);
	Graphics g=getGraphics();
	g.setColor(Color.magenta);
	g.drawString(txt,me.getX(),me.getY());
	System.out.println("Mouse Moved");
	setTitle("Mouse Moved");
	}
	public void MouseDragged(MouseEvent me) {
	System.out.println("Mouse is dragged");
	Graphics g=getGraphics();
	g.fillOval(me.getX(),me.getY(),20,20);
	}

	public static void main(String[] args) {
		new MouseInput();

	}

}

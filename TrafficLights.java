package sub_programs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLights extends JFrame implements ActionListener {
JFrame frame = new JFrame();
JLabel tra;
JRadioButton re,gre,yel;
JTextField txt;
Container c;
    ButtonGroup bg;
TrafficLights()
{
    setLayout(new FlowLayout());
    c=getContentPane();
re=new JRadioButton("RED");
re.setBounds(50,100,95,30);
gre=new JRadioButton("GREEN");
gre.setBounds(50,100,95,30);
yel=new JRadioButton("YELLOW");
yel.setBounds(50,100,95,30);
bg=new ButtonGroup();
txt=new JTextField(32);
tra=new JLabel("TRAFFIC LIGHT");
c=this.getContentPane();
c.setLayout(new FlowLayout());
re.addActionListener(this);
gre.addActionListener(this);
yel.addActionListener(this);
c.add(tra);
c.add(re);
c.add(gre);
c.add(yel);
c.add(txt);
bg.add(re);
bg.add(gre);
bg.add(yel);
this.setVisible(true);
this.setSize(500,500);
this.setTitle("Traffic");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c.setBackground(Color.white);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==re)
{
txt.setText("RED:TURNED ON");
c.setBackground(Color.red);
}
if(ae.getSource()==gre)
{
txt.setText("GREEN:TURNED ON");
c.setBackground(Color.green);
}
if(ae.getSource()==yel)
{
txt.setText("YELLOW:TURNED ON");
c.setBackground(Color.yellow);
}
}



public static void main(String[] args) {

new TrafficLights();       

}

}


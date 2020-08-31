import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Hosteldisp extends JFrame {
	private JLabel Jreg,Jname,Jroom;
	private JTextField TFreg,TFname,TFroom;
	private JButton btncomplain;
	
	private List<Room> lst = null;
	 private Room foundroom;
		 public Hosteldisp(Room r) {
			 this();
			 foundroom=r;
			 TFreg.setText( String.valueOf(r.getRegno())); 
			 TFname.setText(r.getName());
			 TFroom.setText(String.valueOf(r.getRoom()));
		 }
		 
		
	
	public Hosteldisp() {
		super("Room Allocated Student Data");
		
		 Box mainbox=Box.createVerticalBox();
		 
		    Jreg=new JLabel("REG NO.");
		    TFreg=new JTextField(10);
	        Box b1=Box.createHorizontalBox();
	        b1.add(Box.createRigidArea(new Dimension(10,0)));
	        b1.add(Jreg);
	        b1.add(Box.createRigidArea(new Dimension(10,0)));
	        b1.add(TFreg);
	        TFreg.setEditable(false);
	        b1.add(Box.createRigidArea(new Dimension(6,0)));
	        
	        
	        Jname=new JLabel("NAME");
	        TFname=new JTextField(10);
	        Box b2=Box.createHorizontalBox();
	        b2.add(Box.createRigidArea(new Dimension(10,0)));
	        b2.add(Jname);
	        b2.add(Box.createRigidArea(new Dimension(6,0)));
	        b2.add(TFname);
	        TFname.setEditable(false);
	        b2.add(Box.createRigidArea(new Dimension(10,0)));
	        
	     
	        Box b3=Box.createHorizontalBox();
	        Jroom=new JLabel("ROOM NO.");
	        TFroom=new JTextField(10);
	        b3.add(Box.createRigidArea(new Dimension(10,0)));
	        b3.add(Jroom);
	        b3.add(Box.createRigidArea(new Dimension(6,0)));
	        b3.add(TFroom);
	        TFroom.setEditable(false);
	        b3.add(Box.createRigidArea(new Dimension(10,0)));
	        
	        Box b4=Box.createHorizontalBox();
	        btncomplain=new JButton("ADD COMPLAIN");
	        b4.add(btncomplain);
	        
	       
	        
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b1);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b2);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b3);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b4);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        
	        add(mainbox);
	        
	        btncomplain.addActionListener(e->{
	        	try {
					new complain(foundroom);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	
	        	
	        });
	        
	     
	        
	        setSize(600,600);
	        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hosteldisp hd=new Hosteldisp();
	}

}


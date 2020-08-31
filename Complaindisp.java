import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Complaindisp extends JFrame {
	
	private JLabel Jcom,Jreg,Jname,Jroom;
	private JTextField TFcom,TFreg,TFname,TFroom,TFcompno;
	
	private List<Complainbase> lstcom = null;
	 private Complainbase foundcom;
		 public Complaindisp(Complainbase cb) {
			 this();
			 foundcom=cb;
			 TFcom.setText(cb.getComplain());
			 TFreg.setText( String.valueOf(cb.getRegno())); 
			 TFname.setText(cb.getName());
			 TFroom.setText(String.valueOf(cb.getRoom()));
			 TFcompno.setText(String.valueOf(cb.getcompno()));
		 }
	
	public Complaindisp() {
		super("Student complain Data");
		
		 Box mainbox=Box.createVerticalBox();
		 
		    Jcom=new JLabel("COMPLAIN");
		    TFcom=new JTextField(10);
	        Box b1=Box.createHorizontalBox();
	        b1.add(Box.createRigidArea(new Dimension(10,0)));
	        b1.add(Jcom);
	        b1.add(Box.createRigidArea(new Dimension(10,0)));
	        b1.add(TFcom);
	        TFcom.setEditable(false);
	        b1.add(Box.createRigidArea(new Dimension(6,0)));
		 
		    Jreg=new JLabel("REG NO.");
		    TFreg=new JTextField(10);
	        Box b2=Box.createHorizontalBox();
	        b2.add(Box.createRigidArea(new Dimension(10,0)));
	        b2.add(Jreg);
	        b2.add(Box.createRigidArea(new Dimension(10,0)));
	        b2.add(TFreg);
	        TFreg.setEditable(false);
	        b2.add(Box.createRigidArea(new Dimension(6,0)));
	        
	        
	        Jname=new JLabel("NAME");
	        TFname=new JTextField(10);
	        Box b3=Box.createHorizontalBox();
	        b3.add(Box.createRigidArea(new Dimension(10,0)));
	        b3.add(Jname);
	        b3.add(Box.createRigidArea(new Dimension(6,0)));
	        b3.add(TFname);
	        TFname.setEditable(false);
	        b3.add(Box.createRigidArea(new Dimension(10,0)));
	        
	     
	        Box b4=Box.createHorizontalBox();
	        Jroom=new JLabel("ROOM NO.");
	        TFroom=new JTextField(10);
	        b4.add(Box.createRigidArea(new Dimension(10,0)));
	        b4.add(Jroom);
	        b4.add(Box.createRigidArea(new Dimension(6,0)));
	        b4.add(TFroom);
	        TFroom.setEditable(false);
	        b4.add(Box.createRigidArea(new Dimension(10,0)));
	        
	        //code here
	        Box b5=Box.createHorizontalBox();
	        Jcom=new JLabel("Complaint NO.");
	        TFcompno=new JTextField(10);
	        b5.add(Box.createRigidArea(new Dimension(10,0)));
	        b5.add(Jcom);
	        b5.add(Box.createRigidArea(new Dimension(6,0)));
	        b5.add(TFcompno);
	       TFcompno.setEditable(false);
	        b5.add(Box.createRigidArea(new Dimension(10,0)));
	        
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b1);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b2);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b3);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b4);
	        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
	        mainbox.add(b5);
	        
	        add(mainbox);
	        
	        setSize(600,600);
	        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		//Date dateobj = new Date();
		//System.out.println(df.format(dateobj));
		
           new Complaindisp();
	}

}

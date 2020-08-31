

	import java.awt.Dimension;
	import java.io.Serializable;
	import java.util.List;

	import javax.swing.Box;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;


	public class Roomnodisp extends JFrame {
		
		private JLabel lname,lreg,lroom;
		private JTextField tname,treg,troom;
		
		
		  private List<Student> list=null;
			 public Roomnodisp(Student c, Room r) {
			 this();
			 treg.setText( String.valueOf(c.getRegno())); 
		     tname.setText(c.getName());
		     troom.setText( String.valueOf(r.getRoom()));
			 }
		


		public Roomnodisp() {
			super("View room number");
			
			 Box mainbox=Box.createVerticalBox();
		        
		        lreg=new JLabel("REG NO.");
		        treg=new JTextField(10);
		        Box b1=Box.createHorizontalBox();
		        b1.add(Box.createRigidArea(new Dimension(10,0)));
		        b1.add(lreg);
		        b1.add(Box.createRigidArea(new Dimension(10,0)));
		        b1.add(treg);
		        treg.setEditable(false);
		        b1.add(Box.createRigidArea(new Dimension(6,0)));
		        
		        
		        lname=new JLabel("NAME");
		        tname=new JTextField(10);
		        Box b2=Box.createHorizontalBox();
		        b2.add(Box.createRigidArea(new Dimension(10,0)));
		        b2.add(lname);
		        b2.add(Box.createRigidArea(new Dimension(10,0)));
		        b2.add(tname);
		        tname.setEditable(false);
		        b1.add(Box.createRigidArea(new Dimension(10,0)));
		        
		        Box b3=Box.createHorizontalBox();
		        lroom=new JLabel("ROOM NUMBER");
		        troom=new JTextField(10);
		        b3.add(Box.createRigidArea(new Dimension(10,0)));
		        b3.add(lroom);
		        b3.add(Box.createRigidArea(new Dimension(10,0)));
		        b3.add(troom);
		        troom.setEditable(false);
		        b3.add(Box.createRigidArea(new Dimension(10,0)));
		        
		        
		        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
		        mainbox.add(b1);
		        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
		        mainbox.add(b2);
		        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
		        mainbox.add(b3);
		        mainbox.add(Box.createRigidArea(new Dimension(0,30)));
		        
		        add(mainbox);
		        
		        setSize(600,600);
		        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		        setLocationRelativeTo(null);
		        setVisible(true);
		        
		        
		}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Roomnodisp rd=new Roomnodisp();
		}

	}



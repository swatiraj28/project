import java.awt.Color;
import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class complain  extends JFrame {
	
	private JLabel title,nameLabel,regnoLabel,roomLabel2,f_nameLabel,compLabel;
	private JTextField  nameField, regnoField,roomField1,f_nameField,compField;
	private JButton saveButton;
	
	   private List<Complainbase> lstcom=null; 
	  private List<Room> lst=null;
	  private Room foundroom;
		 public complain(Room r) throws ClassNotFoundException {
		 this();
		 foundroom=r;
		 regnoField.setText(String.valueOf(r.getRegno())); 
		 nameField.setText(r.getName());
		 f_nameField.setText(String.valueOf(r.getRoom()));
		 compField.setText(String.valueOf(r.getRoom()));
		 }
	  
	    public complain() throws ClassNotFoundException
	    {
	    
	      setBounds(0, 0, 1000, 660);
	      
	      setName("mainFrame");
	      
	      setTitle("complain section");
	     
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      
	      
	      
	     JPanel Save = new JPanel();
	     
	      add(Save);
	      
	     Save.setLayout(null);
	     
	     
	      title = new JLabel();
	    title .setBounds(330, 0, 500, 50);
	     title .setText("Student complain Form");
	      title.setFont(title.getFont().deriveFont(25f));
	      title.setForeground(Color.black);
	      Save.add(title);
	     
	     
	      nameLabel = new JLabel();
	     nameLabel.setBounds(200, 50, 200, 100);
	     nameLabel.setFont(nameLabel.getFont().deriveFont(15f));
	     nameLabel.setText("Name");
	      nameField = new JTextField();
	     nameField.setEditable(false);
	      nameField.setBounds(400, 85, 200, 30);
	      
	      
	      
	       roomLabel2 = new JLabel();
		     roomLabel2.setBounds(200, 100, 200, 100);
		     roomLabel2.setFont(roomLabel2.getFont().deriveFont(15f));
		     roomLabel2.setText("Room No.");
		      roomField1 = new JTextField();
		      roomField1.setBounds(400, 235, 500, 30);
		      
		       regnoLabel = new JLabel();
			    regnoLabel.setText("Reg. No.");
			    regnoLabel .setFont(regnoLabel .getFont().deriveFont(15f));
			    regnoLabel.setBounds(200, 150, 100, 100);
			    regnoField = new JTextField();
			    regnoField.setEditable(false);
			    regnoField.setBounds(400, 185, 200, 30);
			      

  
	      
	      
	      f_nameLabel = new JLabel();
	     f_nameLabel.setText("Enter your complain");
	    f_nameLabel.setFont(f_nameLabel.getFont().deriveFont(15f));
	     f_nameLabel.setBounds(200, 200, 200, 100);
	      f_nameField= new JTextField();
	     f_nameField.setEditable(false);
	     f_nameField.setBounds(400, 135, 200, 30);
	     
	     //code here
	     compLabel = new JLabel();
	     compLabel.setText("complain ID");
	     compLabel.setFont(compLabel.getFont().deriveFont(15f));
	     compLabel.setBounds(200, 250, 200, 100);
	      compField= new JTextField();
	      compField.setEditable(true);
	      compField.setBounds(400, 285, 200, 30);
	     
	     
	
		 
	
		 
	  
	     saveButton = new JButton("Register");
	     saveButton.setBounds(350, 480, 130, 30);
	     saveButton.setFont(saveButton.getFont().deriveFont(16f));
	   
	     
	     
	     
	     
	    Save.add(saveButton);
	      
	     
	     Save.add(nameField);
	     
	     Save.add(nameLabel);
	     
          Save.add(roomField1);
	     
	     Save.add(roomLabel2);
	   
	     
         Save.add(regnoLabel);
	     
	     Save.add(regnoField);

	     
	     
	     Save.add(f_nameLabel);
	     
	     Save.add(f_nameField);
	    
	     
	    Save.add(compField);
	    Save.add(compLabel);
	    
	    
	     this.setVisible(true);
	     setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);  
	     
	     saveButton.addActionListener(e->{
	    	 
	    	 String cstr=roomField1.getText().trim();
	    	 String regstr=regnoField.getText().trim();
	    	 String namestr= nameField.getText().trim();
	    	 String roomstr= f_nameField.getText().trim();
	    	 String comno=compField.getText().trim();
	    	 
	    	  int rg=Integer.parseInt(regstr);
	    	  int rm=Integer.parseInt(roomstr);
	    	 Complainbase cb=new Complainbase(cstr,rg,namestr,rm,comno);
	            lstcom.add(cb);
	    	 
	    	 if (lstcom != null && lstcom.size() != 0) {
	                try {
						DBmanager_com.saveComplainbaseData(lstcom);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                JOptionPane.showMessageDialog(complain.this, "complain successfully registered....");
	            }
	    	
	     });
	     
	        
	     lstcom=DBmanager_com.loadComplainbaseData();
	        if (lstcom == null)
	            lstcom=new ArrayList<>();   
	       
	          
	            
	    }
	 
       
         public static void main(String args[]) throws ClassNotFoundException {
	    	complain v=new complain();
	    	
	}
}



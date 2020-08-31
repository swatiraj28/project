import java.awt.FlowLayout;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Searchhostel extends JFrame {
	private JButton btnsearch;
	private JTextField txtsearch;
	private JLabel lblreg;
	
	 
	

		public Searchhostel() {
			 super("OUR SEARCH WINDOW");
			 lblreg=new JLabel("Enter Registration Number");
			 
			 add(lblreg); 
			 
			 txtsearch=new JTextField(10);
			
			 add(txtsearch);
				
			btnsearch=new JButton("SEARCH");
			
			add(btnsearch);
			
			setLayout(new FlowLayout());
			
			setSize(800,400);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setVisible(true);
			
		   btnsearch.addActionListener(e->{
			  String regstr= txtsearch.getText().trim();
			  int i=Integer.parseInt(regstr);
			  
			  try {
	                byte[] bytes=Files.readAllBytes(Paths.get("rm.dat"));
	                List<Room> lst=DBmanager_room.loadRoomData();
	                
	                Room foundroom=null;
	                boolean found=false;
	                for(Room r:lst) {
	                    if (String.valueOf(r.getRegno()).equalsIgnoreCase(regstr)) {
	                        found=true;
	                        foundroom=r;
	                        System.out.println("####GOT #####");
	                        break;
	                    }
	                }
	                if (found) {
	                    JOptionPane.showMessageDialog(Searchhostel.this, "room number exists....");
	                    new Hosteldisp(foundroom);
	                    
	                    
	                }else {
	                    JOptionPane.showMessageDialog(Searchhostel.this, "room has not been allocated for this registration number or invalid registration number....");
	                }
		      }
	               
	             catch (IOException e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            } catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
		      
		      
			   
			   
			   
		   });
			
			
		}	
			
      
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Searchhostel sh=new Searchhostel();
		}

}
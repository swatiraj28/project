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

public class Searchcomplain extends JFrame {
	private JButton btnsearch;
	private JTextField txtsearch;
	private JLabel lblreg;
	
	public Searchcomplain() {
		 super("OUR SEARCH WINDOW");
		 lblreg=new JLabel("Enter Room Number");
		 
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
			 String roomstr= txtsearch.getText().trim();
			  int i=Integer.parseInt(roomstr);
			  
			  try {
	                byte[] bytes=Files.readAllBytes(Paths.get("comp.dat"));
	                List<Complainbase> lstcom=DBmanager_com.loadComplainbaseData();
	                
	                Complainbase foundcom=null;
	                boolean found=false;
	                for(Complainbase cb:lstcom) {
	                    if (String.valueOf(cb.getRoom()).equalsIgnoreCase(roomstr)) {
	                        found=true;
	                        foundcom=cb;
	                        System.out.println("####GOT #####");
	                        break;
	                    }
	                }
	                if (found) {
	                    JOptionPane.showMessageDialog(Searchcomplain.this, "complain exists....");
	                    new Complaindisp(foundcom);
	                    
	                    
	                }else {
	                    JOptionPane.showMessageDialog(Searchcomplain.this, "no complain from this room no. or invalid room number....");
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
		Searchcomplain sc=new Searchcomplain();
	}
}

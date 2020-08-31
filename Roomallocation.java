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





	public class Roomallocation extends JFrame {
		
		private JLabel lblregno,lblname,lblroom;
		private JTextField txtregno,txtname,txtroom;
		private JButton btnsave;
		
		  private List<Room> lst=null;
		  private Student foundStudent;
		 public Roomallocation(Student c) {
		 this();
		 foundStudent=c;
		 txtregno.setText( String.valueOf(c.getRegno())); 
	     txtname.setText(c.getName());
	     
		 }
		
		public Roomallocation() {
			super("Allocate Room");
			
			lblregno=new JLabel("Registration number");
			add(lblregno);
			txtregno=new JTextField(10);
			add(txtregno);
			txtregno.setEditable(false);
			lblname=new JLabel("Name");
			add(lblname);
			txtname=new JTextField(20);
			add(txtname);
			txtname.setEditable(false);
			lblroom=new JLabel("Enter Room Number");
			add(lblroom);
			txtroom=new JTextField(10);
			add(txtroom);
			
			btnsave=new JButton("SAVE");
			add(btnsave);
			
			btnsave.addActionListener(e->{
				
				String roomstr=txtroom.getText().trim();
				int rno=Integer.parseInt(roomstr);
				String nmstr=txtname.getText().trim();
				String rstr=txtregno.getText().trim();
				int reg=Integer.parseInt(rstr);
				  try {
		                byte[] bytes=Files.readAllBytes(Paths.get("rm.dat"));
		                List<Room> lst=DBmanager_room.loadRoomData();
		                Room foundRoom=null;
		                boolean roomstatus=false;
		                boolean found=false;
		                for(Room r:lst) {
		                	if(r.getName().equalsIgnoreCase(nmstr)) {
		                	 if(String.valueOf(r.getRegno()).equalsIgnoreCase(rstr));
		                		break;
		                	    
		                	}else {
		                    if(r.getRoom()==rno){
		                    	if(!r.isStatus()) {
		                    		
		                    	    found=true;
		 	                        roomstatus=true;
		 	                       
		 	                        foundRoom=r;
		 	                        System.out.println("####GOT #####");
		 	                        break;
		                    		
		                    	}
		                    }
		                       
		                    }
		                }
		              
		                
		                if (found) {
		                    JOptionPane.showMessageDialog(Roomallocation.this, "room number exists....");
		                    new Roomnodisp(foundStudent,foundRoom);
		                    foundRoom.setStatus(true);
		                	foundRoom.setName(nmstr);
		                    foundRoom.setRegno(reg);
		                }else {
		                    JOptionPane.showMessageDialog(Roomallocation.this, "invalid room number or room already allocated....");
		                }
		                DBmanager_room.saveRoomData(lst);
		                
			      }
		               
		             catch (IOException e1) {
		                // TODO Auto-generated catch block
		                e1.printStackTrace();
		            } catch (ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
			      	            
		            
			});
			
			
			
			
			
			setLayout(new FlowLayout());
			setSize(800,400);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setVisible(true);

			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Roomallocation rl=new Roomallocation();
		}

	}

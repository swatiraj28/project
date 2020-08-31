

	import java.awt.Component;
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



	public class Searchframe extends JFrame  {
			
		private JButton btnsearch;
		private JTextField txtsearch;
		private JLabel lblregno;

			public Searchframe() {
				 super("OUR SEARCH WINDOW");
				 lblregno=new JLabel("Enter Registration Number");
				 
				 add(lblregno); 
				 
				 txtsearch=new JTextField(10);
				
				 add(txtsearch);
					
				btnsearch=new JButton("SEARCH");
				
				add(btnsearch);
				
				
				
				btnsearch.addActionListener(e->{
					String rstr=txtsearch.getText().trim();
				      int i=Integer.parseInt(rstr);
				      try {
			                byte[] bytes=Files.readAllBytes(Paths.get("stdnt.dat"));
			                //
			                List<Student> list=DBmanager_sc.loadStudentData();
			                Student foundStudent=null;
			                boolean found=false;
			                for(Student c:list) {
			                    if (String.valueOf(c.getRegno()).equalsIgnoreCase(rstr)) {
			                        found=true;
			                        foundStudent=c;
			                        System.out.println("####GOT #####");
			                        break;
			                    }
			                }
			                if (found) {
			                    JOptionPane.showMessageDialog(Searchframe.this, "registration number exists....");
			                    try {
									new Searchdisp(foundStudent);
									
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
			                    
			                    
			                }else {
			                    JOptionPane.showMessageDialog(Searchframe.this, "invalid registration number....");
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

				      
				     

					
					
					
					
				
					
					
					
				
				
				setLayout(new FlowLayout());
				
				setSize(800,400);
				setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				setVisible(true);
				
				
					
					
					
			}	
					

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Searchframe sf=new Searchframe();
		}

	}
		
		



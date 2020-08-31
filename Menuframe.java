

	import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;



	public class Menuframe extends JFrame{
		private JLabel lbl1;
		private JMenu mnuFile,mnuList;
		private JMenuItem msearch,mslist,mrlist,mclist;
		private JMenuBar bar;
	
		
		public Menuframe() {
			super("OUR HOME WINDOW");
			
			bar=new JMenuBar();
			mnuFile=new JMenu("File");
			mnuList=new JMenu("Table");
			mslist=new JMenuItem("Student list");
			mrlist=new JMenuItem("Room list");
			mclist=new JMenuItem("Complain list");
					
			msearch=new JMenuItem("Search");
			mnuFile.add(msearch);
			mnuList.add(mslist);
			mnuList.add(mrlist);
			mnuList.add(mclist);
			bar.add(mnuFile);
			bar.add(mnuList);
			setJMenuBar(bar);
			
			lbl1=new JLabel("IMPERIAL INSTITUTE OF TECHNOLOLY (HOSTEL->1)");
			add(lbl1);
			Font f1=new Font("abc",Font.BOLD,30);
			lbl1.setFont(f1);
			
			setLayout(new FlowLayout());
			setSize(800,400);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setVisible(true);
			
			msearch.addActionListener(e->{
				Twobutton tb=new Twobutton();
				tb.getContentPane().setBackground(Color.pink);
			});
			mslist.addActionListener(e->{
				try {
					new Listframe();
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			});
			mrlist.addActionListener(e->{
				try {
					new ListRoom();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			});
			mclist.addActionListener(e->{
				 try {
					new Listcom();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Menuframe mf=new Menuframe();
			mf.getContentPane().setBackground(Color.pink);
			
		
			
		}

	}





	import java.awt.Color;
import java.awt.FlowLayout;

	import javax.swing.JButton;
	import javax.swing.JFrame;

	public class Twobutton extends JFrame{
		private JButton btnall,btnhostel,btncom;
		
		public Twobutton() {
			super();
			btnall=new JButton("ALL STUDENT DATA");
			add(btnall);
			btnhostel=new JButton("HOSTEL STUDENT DATA");
			add(btnhostel);
			btncom=new JButton("HOSTEL COMPLAIN DATA");
			add(btncom);
			
			
			btnall.addActionListener(e->{
				Searchframe sf=new Searchframe();
				sf.getContentPane().setBackground(Color.pink);
				
				
			});
			btnhostel.addActionListener(e->{
				
				Searchhostel sh=new Searchhostel();
				sh.getContentPane().setBackground(Color.pink);
				
			});
			btncom.addActionListener(e->{
				Searchcomplain sc=new Searchcomplain();
				sc.getContentPane().setBackground(Color.pink);
			});
			
			setLayout(new FlowLayout());
			setSize(400,400);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setVisible(true);
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Twobutton tb=new Twobutton();
			
		}

	}



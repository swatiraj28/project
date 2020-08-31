

	import java.awt.Dimension;
	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.Box;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Paths;



	public class Searchdisp extends JFrame  {
		
		private JLabel lblregno, lblname, lblemail, lblphnno, lbldept, lblDOB, lblhometown;
		private JTextField txtregno, txtname, txtemail, txtphnno, txtdept, txtDOB, txthometown;
		private JButton btn;

		private List<Student> list = null;
		private Student foundStudent;

		public Searchdisp(Student c) throws ClassNotFoundException {
			this();
			foundStudent = c;
			txtregno.setText(String.valueOf(c.getRegno()));
			txtname.setText(c.getName());
			txtemail.setText(c.getEmail());
			txtphnno.setText(c.getPhnno());
			txtdept.setText(c.getDept());
			txtDOB.setText(c.getDOB());
			txthometown.setText(c.getHometown());

		}

		public Searchdisp() throws ClassNotFoundException {
			super("Search Result");

			Box mainbox = Box.createVerticalBox();

			lblregno = new JLabel("REG NO.");
			txtregno = new JTextField(10);
			Box b1 = Box.createHorizontalBox();
			b1.add(Box.createRigidArea(new Dimension(10, 0)));
			b1.add(lblregno);
			b1.add(Box.createRigidArea(new Dimension(10, 0)));
			b1.add(txtregno);
			txtregno.setEditable(false);
			b1.add(Box.createRigidArea(new Dimension(6, 0)));

			lblname = new JLabel("NAME");
			txtname = new JTextField(10);
			Box b2 = Box.createHorizontalBox();
			b2.add(Box.createRigidArea(new Dimension(10, 0)));
			b2.add(lblname);
			b2.add(Box.createRigidArea(new Dimension(10, 0)));
			b2.add(txtname);
			txtname.setEditable(false);
			b1.add(Box.createRigidArea(new Dimension(10, 0)));

			Box b3 = Box.createHorizontalBox();
			lblemail = new JLabel("Email");
			txtemail = new JTextField(10);
			b3.add(Box.createRigidArea(new Dimension(10, 0)));
			b3.add(lblemail);
			b3.add(Box.createRigidArea(new Dimension(10, 0)));
			b3.add(txtemail);
			txtemail.setEditable(false);
			b3.add(Box.createRigidArea(new Dimension(10, 0)));

			Box b4 = Box.createHorizontalBox();
			lblphnno = new JLabel("PHONE NO.");
			txtphnno = new JTextField(10);
			b4.add(Box.createRigidArea(new Dimension(10, 0)));
			b4.add(lblphnno);
			b4.add(Box.createRigidArea(new Dimension(6, 0)));
			b4.add(txtphnno);
			txtphnno.setEditable(false);
			b4.add(Box.createRigidArea(new Dimension(10, 0)));

			Box b5 = Box.createHorizontalBox();
			lbldept = new JLabel("DEPARTMENT");
			txtdept = new JTextField(5);
			b5.add(Box.createRigidArea(new Dimension(10, 0)));
			b5.add(lbldept);
			b5.add(Box.createRigidArea(new Dimension(6, 0)));
			b5.add(txtdept);
			txtdept.setEditable(false);
			b5.add(Box.createRigidArea(new Dimension(10, 0)));

			Box b6 = Box.createHorizontalBox();
			lblDOB = new JLabel("DATE OF BIRTH");
			txtDOB = new JTextField(5);
			b6.add(Box.createRigidArea(new Dimension(5, 0)));
			b6.add(lblDOB);
			b6.add(Box.createRigidArea(new Dimension(3, 0)));
			b6.add(txtDOB);
			txtDOB.setEditable(false);
			b6.add(Box.createRigidArea(new Dimension(5, 0)));

			Box b7 = Box.createHorizontalBox();
			lblhometown = new JLabel("HOME TOWN");
			txthometown = new JTextField(10);
			b7.add(Box.createRigidArea(new Dimension(10, 0)));
			b7.add(lblhometown);
			b7.add(Box.createRigidArea(new Dimension(6, 0)));
			b7.add(txthometown);
			txthometown.setEditable(false);
			b7.add(Box.createRigidArea(new Dimension(10, 0)));

			Box b8 = Box.createHorizontalBox();
			btn = new JButton("ALLOCATE ROOM");

			b8.add(btn);

			mainbox.add(Box.createRigidArea(new Dimension(0, 30)));
			mainbox.add(b1);
			mainbox.add(Box.createRigidArea(new Dimension(0, 30)));
			mainbox.add(b2);
			mainbox.add(Box.createRigidArea(new Dimension(0, 30)));
			mainbox.add(b3);
			mainbox.add(Box.createRigidArea(new Dimension(0, 20)));
			mainbox.add(b4);
			mainbox.add(Box.createRigidArea(new Dimension(0, 20)));
			mainbox.add(b5);
			mainbox.add(Box.createRigidArea(new Dimension(0, 30)));
			mainbox.add(b6);
			mainbox.add(Box.createRigidArea(new Dimension(0, 30)));
			mainbox.add(b7);
			mainbox.add(Box.createRigidArea(new Dimension(0, 30)));
			mainbox.add(b8);

			add(mainbox);

			btn.addActionListener(e -> {
				boolean flag = false;
				try {
					byte[] bytes = Files.readAllBytes(Paths.get("rm.dat"));
					List<Room> lst;
					lst=DBmanager_room.loadRoomData();
					for (Room r : lst)
						if (r.getName().equalsIgnoreCase(txtname.getText().trim())) {
							flag = true;
						}
					if (flag) {
						JOptionPane.showMessageDialog(Searchdisp.this, "room has already been allocated for this student");
					} else {
						new Roomallocation(foundStudent);
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			});

			setSize(600, 600);
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);

		}

		public static void main(String[] args) throws ClassNotFoundException {
			// TODO Auto-generated method stub
			Searchdisp sd = new Searchdisp();
		}

	}

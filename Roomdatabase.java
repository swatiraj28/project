

	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.JFrame;

	public class Roomdatabase extends JFrame {
		
		

		public static void main(String[] args) throws FileNotFoundException, IOException {
			// TODO Auto-generated method stub
			List<Room> lst=new ArrayList<>();
			 lst.add(new Room (1,"",false,0));
			 lst.add(new Room (2,"",false,0));
			 lst.add(new Room (3,"",false,0));
			 lst.add(new Room (4,"",false,0));
			 lst.add(new Room (5,"",false,0));
			 lst.add(new Room (6,"",false,0));
			 lst.add(new Room (7,"",false,0));
			 lst.add(new Room (8,"",false,0));
			 lst.add(new Room (9,"",false,0));
			 lst.add(new Room (10,"",false,0));
			 lst.add(new Room (11,"",false,0));
			 lst.add(new Room (12,"",false,0));
			 lst.add(new Room (13,"",false,0));
			 lst.add(new Room (14,"",false,0));
			 lst.add(new Room (15,"",false,0));
			 lst.add(new Room (16,"",false,0));
			 lst.add(new Room (17,"",false,0));
			 lst.add(new Room (18,"",false,0));
			 lst.add(new Room (19,"",false,0));
			 lst.add(new Room (20,"",false,0));
			 lst.add(new Room (21,"",false,0));
			 lst.add(new Room (22,"",false,0));
			 lst.add(new Room (23,"",false,0));
			 lst.add(new Room (24,"",false,0));
			 lst.add(new Room (25,"",false,0));
			 
			  ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("rm.dat"));
		        os1.writeObject(lst);
		        os1.close();

		}

	}

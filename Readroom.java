

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.util.List;

	import javax.swing.JFrame;

	public class Readroom extends JFrame{
		public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
			   ObjectInputStream os1=new ObjectInputStream(new FileInputStream("rm.dat"));
		       List<Room> lst=(List<Room>) os1.readObject();
		      
		       os1.close();

		}


	}





	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.util.List;

	import javax.swing.JFrame;





	public class Read extends JFrame {

		public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
			   ObjectInputStream os=new ObjectInputStream(new FileInputStream("stdnt.dat"));
		       List<Student> list=(List<Student>) os.readObject();
		      
		       os.close();

		}

	}



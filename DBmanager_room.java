

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.nio.file.Path;
	import java.util.List;

	import javax.swing.JFrame;

	public class DBmanager_room extends JFrame{
		 public static List<Room> loadRoomData() throws ClassNotFoundException{
		        List<Room> lst=null;
		        FileInputStream fs1=null;
		        ObjectInputStream os1=null;
		        try {
		            fs1=new FileInputStream("rm.dat");
		            os1=new ObjectInputStream(fs1);
		            lst=(List<Room>) os1.readObject();
		            
		        } catch (FileNotFoundException e) {
		            
		        } catch (IOException e) {
		            
		        }finally {
		            try {
		                if (os1 != null)
		                    os1.close();
		                if (fs1 != null)
		                    fs1.close();
		            } catch (IOException e) {
		                
		            }
		            
		        }//finally
		        return lst;
		    }
		    public static void saveRoomData(List<Room> lst) throws ClassNotFoundException {
		        ObjectOutputStream os1=null;
		        try {
		            os1=new ObjectOutputStream(new FileOutputStream("rm.dat"));
		            if (lst !=null && lst.size() != 0 )
		                os1.writeObject(lst);
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }finally {
		            try {
		                os1.close();
		            } catch (IOException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }
		        

		}
			public static byte[] readAllBytes(Path path) {
				// TODO Auto-generated method stub
				return null;
			}
			
	}



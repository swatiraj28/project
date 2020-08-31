

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.nio.file.Path;
	import java.util.List;

	import javax.swing.JFrame;



	public class DBmanager_sc extends JFrame{

		
			  public static List<Student> loadStudentData() throws ClassNotFoundException{
			        List<Student> list=null;
			        FileInputStream fs=null;
			        ObjectInputStream os=null;
			        try {
			            fs=new FileInputStream("stdnt.dat");
			            os=new ObjectInputStream(fs);
			            list=(List<Student>) os.readObject();
			            
			        } catch (FileNotFoundException e) {
			            
			        } catch (IOException e) {
			            
			        }finally {
			            try {
			                if (os != null)
			                    os.close();
			                if (fs != null)
			                    fs.close();
			            } catch (IOException e) {
			                
			            }
			            
			        }//finally
			        return list;
			    }
			    public static void saveStudentData(List<Student> list) throws ClassNotFoundException {
			        ObjectOutputStream os=null;
			        try {
			            os=new ObjectOutputStream(new FileOutputStream("stdnt.dat"));
			            if (list !=null && list.size() != 0 )
			                os.writeObject(list);
			        } catch (IOException e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }finally {
			            try {
			                os.close();
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





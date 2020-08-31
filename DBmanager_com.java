import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JFrame;

public class DBmanager_com extends JFrame {
	 public static List<Complainbase> loadComplainbaseData() throws ClassNotFoundException{
	        List<Complainbase> lstcom=null;
	        FileInputStream fs1=null;
	        ObjectInputStream os1=null;
	        try {
	            fs1=new FileInputStream("comp.dat");
	            os1=new ObjectInputStream(fs1);
	            lstcom=(List<Complainbase>) os1.readObject();
	            
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
	        return lstcom;
	    }
	    public static void saveComplainbaseData(List<Complainbase> lstcom) throws ClassNotFoundException {
	        ObjectOutputStream os1=null;
	        try {
	            os1=new ObjectOutputStream(new FileOutputStream("comp.dat"));
	            if (lstcom !=null && lstcom.size() != 0 )
	                os1.writeObject(lstcom);
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

}

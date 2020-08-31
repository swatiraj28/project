
import java.util.List;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Listcom extends JFrame{
	private JTable tblcom;
    private String datacom[][];
    private String[] colnamescom= {"COMPLAIN","REG NO","NAME","ROOM NO.","COMPLAINTNO."};
    private List<Complainbase> lstcom=null;
   
    
    public Listcom( ) throws ClassNotFoundException{
        super("Complain Data Table");
        lstcom=DBmanager_com.loadComplainbaseData();
       
        // creating 2d data array from list
       
        String datacom[][]=new String[lstcom.size()][5];
        int row=0;
        for(Complainbase cb:lstcom) {
        	
     
            datacom[row][0]=cb.getComplain();
            datacom[row][1]=String.valueOf(cb.getRegno());
            datacom[row][2]=cb.getName();
            datacom[row][3]=String.valueOf(cb.getRoom());
            //code here
            datacom[row][4]=String.valueOf(cb.getcompno());
           
           
            row++;
        }
        tblcom=new JTable(datacom, colnamescom);
        add(new JScrollPane(tblcom));
        
     
        setSize(1200,500);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

  
public static void main(String[] args) throws ClassNotFoundException {
	// TODO Auto-generated method stub
	Listcom lc=new Listcom();
}

}

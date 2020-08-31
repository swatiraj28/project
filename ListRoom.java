

	import java.util.List;

	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;

	public class ListRoom extends JFrame{
		private JTable tbl;
	    private String data[][];
	    private String[] colnames= {"ROOM NO.","STATUS","NAME","REG NO."};
	    private List<Room> lst=null;
	   
	     
	    
	    public ListRoom( ) throws ClassNotFoundException{
	        super("Room Data Table");
	        lst=DBmanager_room.loadRoomData();
	       
	        // creating 2d data array from list
	       
	        String data[][]=new String[lst.size()][4];
	        int row=0;
	        for(Room r:lst) {
	        	
	     
	            data[row][0]=String.valueOf(r.getRoom());
	            data[row][1]=String.valueOf(r.isStatus());
	            data[row][2]=r.getName();
	            data[row][3]=String.valueOf(r.getRegno());
	           
	            row++;
	        }
	        tbl=new JTable(data, colnames);
	        add(new JScrollPane(tbl));

	        
	     
	        setSize(900,500);
	        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	        
	    }

	  
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		ListRoom lr=new ListRoom();
	}

}

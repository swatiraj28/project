

	import java.awt.Color;
import java.awt.FlowLayout;
	import java.util.List;

	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;





	public class Listframe extends JFrame{
		 private JTable tblStudentsList;
		    private String data[][];
		    private String[] colnames= {"REG NO","NAME","EMAIL","PHONE NO.","DEPARTMENT","DATE OF BIRTH","HOMETOWN"};
		    private List<Student> list=null;
		   
		     
		    
		    public Listframe( ) throws ClassNotFoundException{
		        super("Hosteler Data Table");
		        list=DBmanager_sc.loadStudentData();
		       
		        // creating 2d data array from list
		       
		        String data[][]=new String[list.size()][50];
		        int row=0;
		        for(Student s:list) {
		        	
		     
		            data[row][0]=String.valueOf(s.getRegno());
		           
		            data[row][1]=s.getName();
		            data[row][2]=s.getEmail();
		            data[row][3]=String.valueOf(s.getPhnno());
		            data[row][4]=s.getDept();
		            data[row][5]=s.getDOB();
		            data[row][6]=s.getHometown();
		         
		            row++;
		        }
		        tblStudentsList=new JTable(data, colnames);
		        add(new JScrollPane(tblStudentsList));

		        
		     
		        setSize(1300,600);
		        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		        setLocationRelativeTo(null);
		        setVisible(true);
		        
		    }

		    public static void main(String[] args) throws ClassNotFoundException {
		        // TODO Auto-generated method stub
		    
		    				Listframe lf=new Listframe();
		    				
		    	

		    }

	}



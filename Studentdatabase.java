

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.JFrame;





	public class Studentdatabase extends JFrame{
		
		public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
			 List<Student> list=new ArrayList<>();
		      
		        list.add(new Student(1000,"Rahul Roy","roy@gmail.com","9007811833","ECE","25th July 1999","Kolkata"));
		        list.add(new Student(1001,"Rohit Dey","dey@gmail.com","9845612374","CSE","19th December 1998","Mumbai"));
		        list.add(new Student(1002,"Suman Chandra","chandra@gmail.com","7854659825","ECE","5th May 1999","Chennai"));
		        list.add(new Student(1003,"Sayan Das","das@gmail.com","9432588185","EE","9th June 1998","Burdwan"));
		        list.add(new Student(1004,"Soumik Uzumaki","soumik@gmail.com","7008541232","IT","2nd January 1999","Siliguri"));
		        list.add(new Student(1005,"Swastik Saha","saha@gmail.com","9123803670","ME","1st March 1998","Delhi"));
		        list.add(new Student(1006,"Swagata Halder","swagata@gmail.com","8583017188","ECE","14th July 1999","Kolkata"));
		        list.add(new Student(1007,"Subham Pathak","subham@gmail.com","9051435697","CE","16th August 1998","Malda"));
		        list.add(new Student(1008,"Swati Raj","raj@gmail.com","8756469582","IT","6th October 1999","Durgapur"));
		        list.add(new Student(1009,"Souvik Sen","souvik@gmail.com","7569425635","CSE","11th November 1998","Lucknow"));
		        list.add(new Student(1010,"Shivam Kumar","kumar@gmail.com","9654785212","ECE","23th April 1999","Patna"));
		        list.add(new Student(1011,"Amit Shaw","amit@gmail.com","9005847213","EE","15th December 1998","Mumbai"));
		        list.add(new Student(1012,"Sonu Sood","sood@gmail.com","8659423123","IT","5th January 1999","Kolkata"));
		        list.add(new Student(1013,"Salman Khan","sallu@gmail.com","9163171421","ME","8th February 1998","Bangalore"));
		        list.add(new Student(1014,"Karan Johar","johar@gmail.com","7256941482","ECE","7th June 1999","Noida"));
		        list.add(new Student(1015,"Modon Mitro","live@gmail.com","9748622687","CE","4th March 1998","Agra"));
		        list.add(new Student(1016,"Taimur ali","ali@gmail.com","9798547486","ECE","9th March 2000","Chandigarh"));
		        list.add(new Student(1017,"Hindustani Bhau","bhau@gmail.com","8748622687","CSE","1st January 1998","Kolhapur"));
		        list.add(new Student(1018,"Donald Trumph","trumph@gmail.com","9748622687","ME","30th December 1998","Boston"));
		        list.add(new Student(1019,"Sushant Singh","singh@gmail.com","9007434005","CE","2nd May 1998","Dholakpur"));
		        list.add(new Student(1020,"Mohan Pandey","pandey@gmail.com","9831222850","IT","6th April 1998","Pune"));
		        list.add(new Student(1021,"Shreya pal","pal@gmail.com","9831222510","ECE","10th June 1998","Goa"));
		        list.add(new Student(1022,"Arijit Biswas","biswas@gmail.com","8543431353","CSE","15th August 1998","Ranchi"));
		        list.add(new Student(1023,"Kiara Advani","advani@gmail.com","7935344366","EE","27th September 1998","Patna"));
		        list.add(new Student(1024,"Narendra Modi","modi@gmail.com","8974532256","IT","25th December 1998","Surat"));
		        list.add(new Student(1025,"Hritwik Roshan","roshan@gmail.com","7412012543","ECE","11th March 1998","Mumbai"));
		    
		        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("stdnt.dat"));
		        os.writeObject(list);
		        os.close();

		    }
		}





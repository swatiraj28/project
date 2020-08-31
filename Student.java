

	import java.io.Serializable;

	public class Student implements Serializable{
	int regno;
	String name;
	String email;
	String phnno;
	String dept;
	String DOB;
	String Hometown;
	public Student(int regno, String name, String email, String phnno, String dept, String dOB, String hometown) {
		super();
		this.regno = regno;
		this.name = name;
		this.email = email;
		this.phnno = phnno;
		this.dept = dept;
		DOB = dOB;
		Hometown = hometown;
	}
	public Student() {
		super();
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getHometown() {
		return Hometown;
	}
	public void setHometown(String hometown) {
		Hometown = hometown;
	}


	}



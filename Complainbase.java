import java.io.Serializable;

public class Complainbase implements Serializable{
String complain;
int regno;
String name;
int room;
// code here
String compno;
public Complainbase(String complain, int regno, String name, int room, String comno) {
	super();
	this.complain = complain;
	this.regno = regno;
	this.name = name;
	this.room = room;
	//code here
	this.compno=comno;
}
public Complainbase() {
	super();
}
public String getComplain() {
	return complain;
}
public void setComplain(String complain) {
	this.complain = complain;
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
public int getRoom() {
	return room;
}
public void setRoom(int room) {
	this.room = room;
}

//code here
public String getcompno() {
	return compno;
}
public void setcompno(String compno) {
	this.compno = compno;
}



}

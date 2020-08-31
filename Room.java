

	import java.io.Serializable;

	public class Room implements Serializable{
		 int room;
		 String name;
		 boolean status;
	     int regno;
		public Room(int room, String name, boolean status, int regno) {
			super();
			this.room = room;
			this.name = name;
			this.status = status;
			this.regno = regno;
		}
		public Room() {
			super();
		}
		public int getRoom() {
			return room;
		}
		public void setRoom(int room) {
			this.room = room;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public int getRegno() {
			return regno;
		}
		public void setRegno(int regno) {
			this.regno = regno;
		}
	    
		


		}


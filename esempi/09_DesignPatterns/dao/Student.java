
public class Student {
	private int rollNo;
	   private String name;
	   
	   Student(String name, int rollNo){
		      this.name = name;
		      this.rollNo = rollNo;
		   }
	   
	   public int getRollNo() {
	      return rollNo;
	   }
	   
	   public void setRollNo(int rollNo) {
	      this.rollNo = rollNo;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
}

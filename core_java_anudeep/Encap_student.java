//encapsulation variable verification or give condition on variable with help of private access modifier.
package core_java_anudeep;

public class Encap_student {
	private int roll_no;
	private String stu_name;
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		if(roll_no<=0 || roll_no>100) {
			throw new IllegalArgumentException("Invalid Roll number");
		}
		this.roll_no = roll_no;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public void student_detail() {
		System.out.println("Student name is = "+stu_name);
		System.out.println("Student Roll number is = "+roll_no);
	}

}

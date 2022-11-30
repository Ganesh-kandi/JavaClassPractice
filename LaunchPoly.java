package secondproject;
class Branch{
	private String bid;
	private String bname;
	private String bloc;
	public Branch(String bid, String bname, String bloc) {
		
		this.bid = bid;
		this.bname = bname;
		this.bloc = bloc;
	}
//	public Branch(Branch b) {
//		this.bid = b.getBid();
//		this.bname = b.getBname();
//		this.bloc = b.getBloc();
//	}
	 protected String ganesh() {
		System.out.println("in proctected");
		return "in proctected";
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBloc() {
		return bloc;
	}
	public void setBloc(String bloc) {
		this.bloc = bloc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getBid()+" "+getBname();
	}
	
}
class Student extends Branch{
	private String sName;
	private String sRollNo;
	private int sAge;
	private Branch branch;
	private String bName;
	public Student(String sName, String sRollNo, int sAge,String bid, String bname, String bloc) {
		super(bid, bname, bloc);
		this.sName = sName;
		this.sRollNo = sRollNo;
		this.sAge = sAge;
		this.branch = branch;
	}
	
	public  void detailsOfStudent() {
		System.out.println("student name: "+ sName);
		System.out.println("student age: "+ sAge);
		System.out.println("student RollNumber: "+ sRollNo);
		System.out.println("student branch: "+ getBid() );
		System.out.println("student bname: "+ getBname());
	}
}




public class LaunchPoly {

	public static void main(String[] args) {
		//Branch branch =new Branch("12hy32", "MECH", "sklm");
		Student student= new Student("ganesh", "17a51a0321", 22,"12hy32", "MECH", "sklm");
		Student student1=new Student("navakanth", "16a51a258", 23, "khjsgdkh", "CSE", "pklnda");
		student.detailsOfStudent();
		System.out.println("");
		student1.detailsOfStudent();
	}

}

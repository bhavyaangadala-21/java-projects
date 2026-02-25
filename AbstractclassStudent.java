package Mypackage;
abstract class evalution{
	protected String studentName;
	protected double totalMarks;
	public evalution (String studentName, double totalMarks ) {
		this.studentName = studentName;
		this.totalMarks = totalMarks;
		
	}
	public abstract String computeGrade();
}
class UGstudent extends evalution{
	public UGstudent (String studentName, double totalMarks ) {
		super(studentName, totalMarks);
	}
		public String computeGrade() {
			double percentage=(totalMarks/100)*100;
			if (totalMarks>=90)
				return "A";
			else if (totalMarks>=65)
				return "B";
			else if (totalMarks>=50)
				return "C";
			else
				return "D";
		}
		
	}
	
class PGstudent extends evalution{
	public PGstudent (String studentName, double totalMarks) {
		super(studentName, totalMarks);
	}
	public String computeGrade() {
		double percentage = (totalMarks/100)*100;
		if (totalMarks>=90)
			return "A";
		else if (totalMarks>=65)
			return "B";
		else if (totalMarks>=50)
			return "C";
		else
			return "fail";
	}
}

public class AbstractclassStudent{

	public static void main(String[] args) {
		evalution UG = new UGstudent("lathika",90);
		System.out.println("UG Student: " + UG.studentName + " | Grade: " + UG.computeGrade());
		evalution PG = new PGstudent("arnavi",80);
		System.out.println("UG Student: " + PG.studentName + " | Grade: " + PG.computeGrade());

	}

} 

public class Enrollment {
	
	public String getEnrollmentInfo(String platform , String course , String student){
				return "Platform : " + platform + "\nCourse : " + course + "\nStudent : " + student ;

	}
	
	public static void main(String [] args){
		
		Enrollment enrollment = new Enrollment();
		
		String info1 =enrollment. getEnrollmentInfo("Udemy" , "Java Programming" , "Alice");
			System.out.println(info1);

		System.out.println("-----------------");		
		String info2 = enrollment.getEnrollmentInfo("Udemy" , "Web Development" , "Bob");
			System.out.println(info2);
                System.out.println("-----------------");
		


	}

}
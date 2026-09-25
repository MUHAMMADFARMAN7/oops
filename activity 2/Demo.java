public class Demo{

	public static void main(String args[]){
	Student s1 = new Student();
	Student s2 = new Student();

	s1.id = 24;
	s1.name = "Rafay";
	s1.completedCredits = 4;

	s2.id = 36;
	s2.name = "Bazif";
	s2.completedCredits =4;

	s1.print_Summary();
	s2.print_Summary();

	s1.name = "Ahmar";
	s1.completedCredits = 6;


	s2.addCredits(3);
	s1.print_Summary();
	s2.print_Summary();

	
	}

}
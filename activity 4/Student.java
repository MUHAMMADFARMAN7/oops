public class Student{

		int id;
		int completedCredits;
		String name;


		public void print_Summary(){
			System.out.println("ID:"+ id + " Name:" + name + " Completed Credits:" + completedCredits);
		}
		
		public void addCredits(int credits){
			completedCredits += credits; }
}
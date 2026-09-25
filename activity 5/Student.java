public class Student{

		int id;
		int completedCredits;
		String name;


		public void print_Summary(){
			System.out.println("ID:"+ id + " Name:" + name + " Completed Credits:" + completedCredits);
		}
		

		void rename(String name) {
		    this.name = name;
	}

		void addCredits(int amount) {
 		   this.completedCredits += amount;
	}

}
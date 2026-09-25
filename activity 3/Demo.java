public class Demo{

	public static void main(){
	Student a = new Student();
	a.name = "Ali";
	Student b = new Student();
	b.name = "Sara";
	Student c = new Student();
	c.name = a.name;

	System.out.println("A:" + a.name + " B:" + b.name + " C:" + c.name);

	}


}
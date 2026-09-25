public class Demo{
	public static void main(String args[]){
		
	Cart c =new Cart();
	double notebook = 120;
	double pen =50;
	c.addItem( notebook , 1);
	c.addItem(pen , 3);
	System.out.println(c.getTotal());
		

	}}	
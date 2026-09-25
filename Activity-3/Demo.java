public class Demo {
    public static void main(String[] args) {
        StudentProfile student = new StudentProfile();

        System.out.println("registerId('SP26-BCS-047'): " + student.registerId("SP26-BCS-047"));
        System.out.println("registerId('NEW-ID'): " + student.registerId("NEW-ID"));

        System.out.println("setGpa(3.40): " + student.setGpa(3.40));
        System.out.println("setGpa(4.50): " + student.setGpa(4.50));

        System.out.println("addCredits(15): " + student.addCredits(15));
        System.out.println("addCredits(-2): " + student.addCredits(-2));

        System.out.println("addCredits(3): " + student.addCredits(3));

        System.out.print("Final Summary: ");
        student.summary();
    }
}
public class StudentProfile {
    private String studentId;
    private double gpa;
    private int completedCredits;

    public boolean registerId(String id) {
        if (this.studentId == null && id != null && !id.trim().isEmpty()) {
            this.studentId = id;
            return true;
        }
        return false;
    }

    public boolean setGpa(double value) {
        if (value >= 0.0 && value <= 4.0) {
            this.gpa = value;
            return true;
        }
        return false;
    }

    public boolean addCredits(int amount) {
        if (amount > 0) {
            this.completedCredits += amount;
            return true;
        }
        return false;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    public void summary() {
        System.out.println("ID: " + studentId + " | GPA: " + gpa + " | Credits: " + completedCredits);
    }
}
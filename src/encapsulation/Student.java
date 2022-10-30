package encapsulation;

/*
 * Encapsulation = the bundling of related fields and methods inside a single class
 */
public class Student {

    /*
     * Private fields - not accessible outside of the class
     */
    private int studentNumber;
    private int finalGrade;

    /*
     * Pulbic set and get methods - to modify and view the variables
     */
    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setFinalGrade(int newFinalGrade) {
        finalGrade = newFinalGrade;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

}

/*
 * Class to run the program and test encapsulation
 */
class RunStudent {
    public static void main(String[] args) {

        Student student = new Student();

        student.setStudentNumber(123456);
        student.setFinalGrade(73);

        System.out.println(
                "Student number: " + student.getStudentNumber() + " | Final grade: " + student.getFinalGrade());

    }
}

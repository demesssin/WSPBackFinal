package WSPBackFinal;
import java.util.Vector;

public class Teacher extends Employee {
    private String courseName;
    private TeacherLevel level;
    private Vector<Student> students;
    private int currentWeek = 1;

    public Teacher(String courseName, TeacherLevel level, String name, String lastname){
        super(name, lastname);
        this.courseName = courseName;
        this.level = level;
        this.students = new Vector<>();
    }

    public void putMark(Student student, double mark){
        if (currentWeek > 15){
            System.out.println("Semester is over");
            return;
        }
        student.addMark(mark, currentWeek);
        System.out.println("Mark " + mark + " assigned to " + student.getName() + " " + student.getLastname() + ". Week: " + currentWeek);
        if (currentWeek == 7){
            System.out.println("End of the first attestation!");
        } else if (currentWeek == 15) {
            System.out.println("End of the second attestation!");
            if (student.getMarksRecord().isRetake()){
                System.out.println(student.getName() + " " + student.getLastname() + " has failed subject. Total marks : " + student.getMarksRecord().totalMarksForAttestation());
            }
        }
        currentWeek++;
    }

    public void putFinalExam(Student student, double mark) {
        Marks marksRecord = student.getMarksRecord();
        marksRecord.setFinalExam(mark);
        System.out.println("Final exam mark " + mark + " assigned to " + student.getName() + " " + student.getLastname());
    }

    public void putUrgencyLevel(Student student, Report report){
        student.setUrgencyLevel(report);
        if (report == Report.HIGH){
            System.out.println(student.getName() + " " + student.getLastname() + " because of bad discipline u will went dean's office");
        } else {
            System.out.println(student.getName() + " " + student.getLastname() + " has a " + report + " level of urgency");
        }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void viewStudents(){
        System.out.println("Students of course: " + courseName + ", Teacher is " + getName() + " " + getLastname());
        for (Student student : students){
            System.out.println(students);
        }
    }
}

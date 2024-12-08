
import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private int id;
    private String name;
    private String lastname;
    private double gpa;
    private int course;
    private Major major;
    private int credits;
    private List<Double> marks;
    private Report urgencyLevel;
    private Marks marksRecord;

    public Student(String name, String lastname, double gpa, int course, Major major, String email, String password, Report urgencyLevel) {
        super(email, password);
        this.name = name;
        this.lastname = lastname;
        this.gpa = gpa;
        this.course = course;
        this.major = major;
        this.marks = new ArrayList<>();
        this.urgencyLevel = null;
        this.marksRecord = new Marks();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCourse() {
        return course;
    }

    public Major getMajor() {
        return major;
    }

    public Marks getMarksRecord() {
        return marksRecord;
    }

    @Override
    public String toString() {
        return "Student = [ " + name + " " + lastname + ", gpa: " + gpa + ", course: " + course + ", major: " + major + " ]";
    }

    public void addMark(double mark, int week) {
        marks.add(mark);
        marksRecord.addMark(mark, week);
    }

    public void addMark(double mark){
        marks.add(mark);
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void viewMarks() {
        if (marks.isEmpty()) {
            System.out.println("Student doesn't have any marks.");
        } else {
            System.out.println(name + "'s marks: " + marks);
        }
    }

    public void setUrgencyLevel(Report report) {
        this.urgencyLevel = report;
    }

    public void viewTranscript() {
        Marks record = this.getMarksRecord();
        System.out.println("Transcript for " + name + " " + lastname + ":");
        System.out.println("- First Attestation: " + record.getFirstAttestation());
        System.out.println("- Second Attestation: " + record.getSecondAttestation());
        System.out.println("- Final Exam: " + record.getFinalExam());
        System.out.println("- Total Score: " + record.totalMarksForAll());
    }
}

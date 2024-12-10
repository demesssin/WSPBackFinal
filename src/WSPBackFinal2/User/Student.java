package WSPBackFinal.User;
import WSPBackFinal.Course;
import WSPBackFinal.Enums.Major;
import WSPBackFinal.Enums.Report;
import WSPBackFinal.Marks;

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
    private List<Course> registeredCourses;

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
        this.registeredCourses = new ArrayList<>();
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

    public List<Course> getRegisteredCourses(){return registeredCourses;}

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
        System.out.println("||| First Attestation: " + record.getFirstAttestation());
        System.out.println("||| Second Attestation: " + record.getSecondAttestation());
        System.out.println("||| Final Exam: " + record.getFinalExam());
        System.out.println("||| Total Points: " + record.totalMarksForAll());
    }

    public void registerForCourse(Course[] availableCourses, String courseCipher){
        boolean courseFound = false;
        Course choosenCourse = null;
        for (Course course : availableCourses){
            if (course.getCourseCipher().equals(courseCipher)){
                choosenCourse = course;
                courseFound = true;
                break;
            }
        }
        if (!courseFound){
            System.out.println("We dont have courses with this cipher: " + courseCipher);
            return;
        }
        if (registeredCourses.contains(choosenCourse)){
            System.out.println("You already choosed this course");
        } else{
            registeredCourses.add(choosenCourse);
            System.out.println("You successfully chosen this course");
        }
    }

    public void viewRegisteredCourses(){
        if (registeredCourses.isEmpty()){
            System.out.println("You don't choose any courses");
        } else {
            System.out.println("Registered courses of " + name + " " + lastname + ":");
            for (Course course : registeredCourses){
                System.out.println("| " + course);
            }
        }
    }
}

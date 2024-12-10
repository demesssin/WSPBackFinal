package WSPBackFinal;
public class Course {
    public String courseName;
    public String courseCipher;
    public int courseCredits;

    public Course(String courseName, int courseCredits, String courseCipher){
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.courseCipher = courseCipher;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCourseCredits() {
        return courseCredits;
    }
    public String getCourseCipher(){return courseCipher;}

    @Override
    public String toString() {
        return courseName + " {" + courseCredits + " ECTS " + ", " + courseCipher + "}";
    }
}

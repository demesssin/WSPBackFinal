public class Course {
    public String courseName;
    public int courseCredits;

    public Course(String courseName, int courseCredits){
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getCourseCredits() {
        return courseCredits;
    }
}

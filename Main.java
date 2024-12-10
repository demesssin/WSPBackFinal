package WSPBackFinal;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Daryn", "Kenes", 3.00, 2, Major.Bachelor, "daryn@kbtu.kz", "daryn14", null);

        System.out.println(s1.toString());

        Vector<Student> students = new Vector<>();


        Teacher t1 = new Teacher("OOP", TeacherLevel.TUTOR, "Nadira", "Zhumadir");
        t1.addStudent(s1);

        News n1 = new News("Aldamuratov's lectures cancelled",new Vector<>());
        n1.addComment("When is the makeup lectures?");

        System.out.println(n1.toString());

        Authorization a1 = new Authorization();
        a1.register(s1);
        a1.login("daryn@kbtu.kz", "daryn14");
        a1.login("daryn@kbtu.kz", "daryn13");


        t1.putMark(s1, 1.0);
        t1.putMark(s1, 1.0);
        t1.putFinalExam(s1, 20.0);
        s1.viewTranscript();

        Course[] availableCourses = {
                new Course("OOP", 4, "CSCI2104"),
                new Course("ADS", 3, "CSCI2105"),
                new Course("Data Bases", 5, "CSCI2106"),
                new Course("PE", 10, "PHE101")
        };

        s1.registerForCourse(availableCourses, "CSCI2105");
        s1.registerForCourse(availableCourses, "PHE10");
        s1.viewRegisteredCourses();
    }
}

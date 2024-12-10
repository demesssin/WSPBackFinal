package WSPBackFinal;

import java.util.Vector;

public class Course {
    private Vector<Lesson> lessons;
    private String ID;
    private Faculty faculty;
    private String name;
    private Integer ects;

    public Vector<Lesson> getLessons() {
        return lessons;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Integer getEcts() {
        return ects;
    }
}

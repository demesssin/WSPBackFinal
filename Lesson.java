package WSPBackFinal;

import java.util.HashMap;

public class Lesson {
    private LessonType LessonType;
    private Teacher instructor;
    private HashMap<Student, Marks> gradeBook;

    public Lesson(LessonType LessonType, Teacher instructor, String name, Integer ects, String ID, Faculty faculty) {
        this.LessonType = LessonType;
        this.instructor = instructor;
    }
   
    public LessonType getType() {
        return LessonType;
    }

}

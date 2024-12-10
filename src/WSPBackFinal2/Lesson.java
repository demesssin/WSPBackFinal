package WSPBackFinal;

import WSPBackFinal.Enums.*;
import WSPBackFinal.User.*;
import WSPBackFinal.Post.*;

public class Lesson {
    private WSPBackFinal.Enums.LessonType LessonType;
    private Teacher instructor;
    private String name;
    private Integer ects;
    private String ID;
    private Faculty faculty;

    public Lesson(LessonType LessonType, Teacher instructor, String name, Integer ects, String ID, Faculty faculty) {
        this.LessonType = LessonType;
        this.instructor = instructor;
        this.name = name;
        this.ects = ects;
        this.ID = ID;
        this.faculty = faculty;
    }

    public LessonType getType() {
        return LessonType;
    }

}

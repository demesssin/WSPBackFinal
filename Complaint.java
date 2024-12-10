package WSPBackFinal;

class Complaint extends Post {
    private LevelUrgency level;
    private Student student;

    public Complaint(Date date, String content, User author, LevelUrgency level, Student student) {
        super(date, content, author);
        this.level = level;
        this.student = student;
    }

    public LevelUrgency getLevel() {
        return level;
    }

    public void setLevel(LevelUrgency level) {
        this.level = level;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}



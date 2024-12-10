package WSPBackFinal;

import java.util.Vector;

public class News {
    public String newsTopic;
    public Vector<String> comment;

    public News(String newsTopic, Vector<String> comment){
        this.newsTopic = newsTopic;
        this.comment = new Vector<>();
    }
    public String getNewsTopic() {
        return newsTopic;
    }

    public void setNewsTopic(String newsTopic) {
        this.newsTopic = newsTopic;
    }

    public Vector<String> getComment() {
        return comment;
    }

    public void addComment(String comment) {
        this.comment.add(comment);
    }

    public String toString(){
        return "News topic: " + newsTopic + "\nComments: " + comment;
    }
}

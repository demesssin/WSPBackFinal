
package WSPBackFinal;

import java.util.Date;
import java.util.Vector;

class Post {
    private Date date;
    private String content;
    private User author;

    public Post(Date date, String content, User author) {
        this.date = date;
        this.content = content;
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}

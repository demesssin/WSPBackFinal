package WSPBackFinal.Researcher;

public class ResearchPaper {
    private String title;
    private String topic;
    public ResearchPaper(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
}

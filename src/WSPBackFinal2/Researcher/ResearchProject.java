package WSPBackFinal.Researcher;

import java.util.Vector;

public class ResearchProject {
    Researcher superVisor;
    Vector <Researcher> participants;
    Vector <ResearchPaper> topics;

    public ResearchProject(Researcher superVisor, Vector <Researcher> participants) {
        this.superVisor = superVisor;
        this.participants = participants;
    }
    public void joinProject(Researcher participant) {
        participants.add(participant);
    }
    public void addTopic(ResearchPaper topic){
        topics.add(topic);
    }
}

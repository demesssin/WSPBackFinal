package WSPBackFinal.User;

import WSPBackFinal.Enums.Faculty;
import WSPBackFinal.Post.*;

import java.util.Vector;

public class Dean {
    private Vector<Complaint> complaints;
    private Vector<Request> requests;
    public Dean() {
        complaints = new Vector<>();
        requests = new Vector<>();

    }
    private Faculty deanfaculty;
    public Vector<Request> viewRequests() {
        return requests;
    }
    public void signRequest(Request request) {
        requests.add(request);
    }
    public void rejectRequest(Request request) {
        requests.remove(request);
    }
    public void redirectRequest(Manager manager, Request request){
        System.out.println("YES or no");
    }
    public Vector<Complaint> viewComplaints() {
        return complaints;
    }

}

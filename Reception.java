import java.util.List;

public class Reception {
    List<Request> requests;
    Scheduler scheduler;
    Tracker requestTracking;

    public Reception(List<Request> requests, Scheduler scheduler, Tracker requestTracking) {
        this.requests = requests;
        this.scheduler = scheduler;
        this.requestTracking = requestTracking;
    }

    public void receiveRequest(Request request){

    }

    public void addRequest(Request request){

    }

    public void deleteRequest(Request request){

    }

    public void addTelephoneNumber(Request request){

    }

    public void addFeedback(Feedback feeedback){

    }


    public void changeResSchedule(Responder responder){

    }

    public void getLogger(Logger logger){

    }
}


import com.sun.demo.jvmti.hprof.Tracker;

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

    public void receiveRequest(Request){

    }

    public void addRequest(Request){

    }

    public void deleteRequest(Request){

    }

    public void addTelephoneNumber(Request){

    }

    public void addFeedback(Feedback){

    }


    public void changeResSchedule(Responder){

    }

    public void getLogger(Logger){

    }
}


import java.util.Date;

public class Request {
    Integer duration;
    Boolean urgent;
    Date deadline;
    String topic;

    public Request(Integer duration, Boolean urgent, Date deadline, String topic) {
        this.duration = duration;
        this.urgent = urgent;
        this.deadline = deadline;
        this.topic = topic;
    }
}



import java.util.Date;
import java.util.List;

public class Requester {
    String name;
    String address;
    Integer age;
    Schedule schedule;
    List<Feedback> feedbacks;


    //Constructors
    public Requester(String name, String address, Integer age, Schedule schedule, List<Feedback> feedback) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.schedule = schedule;
        this.feedbacks = feedback;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getaddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    //More Methods

    public Request createRequest(Integer duration, Boolean urgent, Date deadline, String topic) {
        Request createdRequest = new Request(duration, urgent, deadline, topic);
        return createdRequest;
    }

    public Feedback createFeedback(String report, String abuseReport, Boolean satisfied, Boolean disabled, String jobDifficulty, Boolean wouldRecommend) {
        Feedback feedbackGiven = new Feedback(report, abuseReport, satisfied, disabled, jobDifficulty, wouldRecommend);
        return feedbackGiven;
    }

    public void logIn(String userName, String pass) {
    }
    public void cancelRequest(Request request) {
    }

    public void manageRequest(Request request) {
    }
    public void logOut() {

    }

    public void sendRequest() {

    }

    public Logger getLoggers() {
        Logger l = new Logger();
        return l;
    }


}

import java.util.Date;
import java.util.List;

public class Requester {
    String name;
    String adress;
    Integer age;
    Schedule schedule;
    List<Feedback> feedback;


    //Constructors
    public Requester(String name, String adress, Integer age, Schedule schedule, List<Feedback> feedback) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.schedule = schedule;
        this.feedback = feedback;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setFeedback(List<Feedback> feedback) {
        this.feedback = feedback;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public Integer getAge() {
        return age;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public List<Feedback> getFeedback() {
        return feedback;
    }

    //More Methods

    public Request createRequest(Integer duration, Boolean urgent, Date deadline, String topic) {
        Request createdRequest = new Request(duration, urgent, deadline, topic);
        return createdRequest;
    }

    public Feedback createFeedback(String report, String abuseReport, Boolean satisfied, Boolean disabled, String jobDifficulty, Boolean wouldRecommend) {
        Feedback feedbackGiven = new Feedback(String report, String abuseReport, Boolean satisfied, Boolean disabled, String jobDifficulty, Boolean wouldRecommend)
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

    }


}

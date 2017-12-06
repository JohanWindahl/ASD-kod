import java.util.List;

public class Responder {
    String name;
    String adress;
    Integer age;
    Schedule schedule;
    List<Request> requests;
    List<Feedback> feedback;

    public Responder(String name, String adress, Integer age, Schedule schedule, List<Request> requests, List<Feedback> feedback) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.schedule = schedule;
        this.requests = requests;
        this.feedback = feedback;
    }

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

    public List<Request> getRequests() {
        return requests;
    }

    public List<Feedback> getFeedback() {
        return feedback;
    }

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

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void setFeedback(List<Feedback> feedback) {
        this.feedback = feedback;
    }

    public void logIn(String userName, String pass) {
    }

    public void logOut() {
    }

    public void manageAccount() {
    }

    public void getLoggers() {
    }
}
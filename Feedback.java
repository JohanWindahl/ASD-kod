public class Feedback {
    String Report;
    String abuseReport;
    Boolean satisfied;
    Boolean disabled;
    String jobDifficulty;
    Boolean wouldRecommend;

    public Feedback(String report, String abuseReport, Boolean satisfied, Boolean disabled, String jobDifficulty, Boolean wouldRecommend) {
        Report = report;
        this.abuseReport = abuseReport;
        this.satisfied = satisfied;
        this.disabled = disabled;
        this.jobDifficulty = jobDifficulty;
        this.wouldRecommend = wouldRecommend;
    }
}

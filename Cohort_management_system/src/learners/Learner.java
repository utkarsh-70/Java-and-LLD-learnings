package learners;

public abstract class Learner {
    private long learnerId;
    private String learnerName;
    private String learnerEmail;
    public Learner(long learnerId, String learnerName, String learnerEmail) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerEmail = learnerEmail;
    }
    public long getLearnerId() {
        return learnerId;
    }
    public void setLearnerId(long learnerId) {
        this.learnerId = learnerId;
    }
    public String getLearnerName() {
        return learnerName;
    }
    public void setLearnerName(String learnerName) {
        this.learnerName = learnerName;
    }
    public String getLearnerEmail() {
        return learnerEmail;
    }
    public void setLearnerEmail(String learnerEmail) {
        this.learnerEmail = learnerEmail;
    }
    public abstract void displayLearnerDetails();
}

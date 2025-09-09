package learners;

public class JavaLearner extends Learner{
    private boolean doesKnowMultithreading;

    public JavaLearner(long learnerId, String learnerName, String learnerEmail, boolean doesKnowMultithreading) {
        super(learnerId, learnerName, learnerEmail);
        this.doesKnowMultithreading = doesKnowMultithreading;
    }

    public boolean isDoesKnowMultithreading() {
        return doesKnowMultithreading;
    }

    public void setDoesKnowMultithreading(boolean doesKnowMultithreading) {
        this.doesKnowMultithreading = doesKnowMultithreading;
    }
    @Override
    public void displayLearnerDetails(){
        System.out.println("Learner Id: "+getLearnerId());
        System.out.println("Learner Name: "+getLearnerName());
        System.out.println("Learner Email: "+getLearnerEmail());
        System.out.println("Does the learner knows multithreading? : "+doesKnowMultithreading);
    }
}

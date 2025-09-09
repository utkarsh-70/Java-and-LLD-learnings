package learners;

public class NodeLearner extends Learner{
    private long numberOfNodeExperience;
    public NodeLearner(long numberOfNodeExperience,String eventLoop,long learnerId,String learnerName,String learnerEmail){
        
        super(learnerId,learnerName,learnerEmail);
        this.numberOfNodeExperience=numberOfNodeExperience;
    }
    
    @Override
    public void displayLearnerDetails(){
        System.out.println("Learner Id: "+getLearnerId());
        System.out.println("Learner Name: "+getLearnerName());
        System.out.println("Learner Email: "+getLearnerEmail());
        System.out.println("Number of years of node experience: "+numberOfNodeExperience);
    }

    public long getNumberOfNodeExperience() {
        return numberOfNodeExperience;
    }

    public void setNumberOfNodeExperience(long numberOfNodeExperience) {
        this.numberOfNodeExperience = numberOfNodeExperience;
    }
}

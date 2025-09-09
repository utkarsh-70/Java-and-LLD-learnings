package cohort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import instructors.Instructor;
import learners.Learner;

public class Cohort {
    private Long cohortId;
    private Date startDate;
    private Date endDate;
    private String cohortName;
    private String cohortDescription;
    private List<Learner> learners;
    private List<Instructor> instructors;
    public Cohort(Long cohortId, Date startDate, Date endDate, String cohortName, String cohortDescription) {
        this.cohortId = cohortId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cohortName = cohortName;
        this.cohortDescription = cohortDescription;
        this.learners = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }
    public Cohort(Long cohortId, Date startDate, Date endDate, String cohortName, String cohortDescription,
            List<Learner> learners, List<Instructor> instructors) {
        this(cohortId, startDate, endDate, cohortName, cohortDescription);
        this.instructors = instructors;
    }
    public Long getCohortId() {
        return cohortId;
    }
    public void setCohortId(Long cohortId) {
        this.cohortId = cohortId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getCohortName() {
        return cohortName;
    }
    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }
    public String getCohortDescription() {
        return cohortDescription;
    }
    public void setCohortDescription(String cohortDescription) {
        this.cohortDescription = cohortDescription;
    }
    public List<Learner> getLearners() {
        return learners;
    }
    public void setLearners(List<Learner> learners) {
        this.learners = learners;
    }
    public List<Instructor> getInstructors() {
        return instructors;
    }
    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }
    public void displayCohortDetails() {
       
        System.out.println(this.cohortName);
        System.out.println(this.cohortDescription);
        System.out.println("Cohort Id: "+this.cohortId);
        System.out.println(this.startDate);
        System.out.println(this.endDate);
        System.out.println("Number of learners: "+learners.size());
        System.out.println("Number of instructors: "+instructors.size());
        for(int i=0;i<learners.size();i++){
            learners.get(i).displayLearnerDetails();
        }
        for(int i=0;i<instructors.size();i++){
            instructors.get(i).displayInstructorDetails();
        }
    }
    public void addLearnersToCohort(Learner learner){
        this.learners.add(learner);
    }
    public void addInstructorsToCohort(Instructor instructor){
        this.instructors.add(instructor);
    }
    
}

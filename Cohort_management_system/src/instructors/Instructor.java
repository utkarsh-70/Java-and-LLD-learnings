package instructors;

public class Instructor {
    private String instructorName;
    private Long instructorId;
    private String instructorEmail;
    public Instructor(String instructorName, Long instructorId, String instructorEmail) {
        this.instructorName = instructorName;
        this.instructorId = instructorId;
        this.instructorEmail = instructorEmail;
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public Long getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }
    public String getInstructorEmail() {
        return instructorEmail;
    }
    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }
    public void displayInstructorDetails() {
        System.out.println("Instructor Name:"+this.instructorName);
        System.out.println("Instructor ID: "+this.instructorId);
        System.out.println("Instuctor Email: "+this.instructorEmail );
    }
    
}

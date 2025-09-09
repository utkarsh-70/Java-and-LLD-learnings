package courses;

import java.util.ArrayList;

import java.util.List;

import cohort.Cohort;
public abstract class Course {
    private Long courseid;
    private String courseName;
    private String courseDescription;
    private List<Cohort> cohorts;
    private CourseLanguage courseLanguage;
    public Course(Long courseid,
    String courseName,
    String courseDescription,CourseLanguage courseLanguage){
        this.courseid=courseid;
        this.courseName=courseName;
        this.courseDescription=courseDescription;
        this.courseLanguage=courseLanguage;
        this.cohorts=new ArrayList<>();
    }
    public Course(Long courseid,
    String courseName,
    String courseDescription,List<Cohort> cohorts,CourseLanguage courseLanguage){
        this.courseid=courseid;
        this.courseName=courseName;
        this.courseDescription=courseDescription;
        this.courseLanguage=courseLanguage;
        this.cohorts=cohorts;
    }
    public Long getCourseid() {
        return courseid;
    }
    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public List<Cohort> getCohorts() {
        return cohorts;
    }
    public void setCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }
    public CourseLanguage getCourseLanguage() {
        return courseLanguage;
    }
    public void setCourseLanguage(CourseLanguage courseLanguage) {
        this.courseLanguage = courseLanguage;
    }
    public void addCohortToCourse(Cohort cohort){
        this.cohorts.add(cohort);
    }
    public abstract void displayCourseDetails();
}

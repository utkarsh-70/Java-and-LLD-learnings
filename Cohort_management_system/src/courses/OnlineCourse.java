package courses;

import java.util.List;

import cohort.Cohort;

public class OnlineCourse extends Course{
    private String zoomUrl;

    public OnlineCourse(Long courseid, String courseName, String courseDescription, List<Cohort> cohorts,
            CourseLanguage courseLanguage, String zoomUrl) {
        super(courseid, courseName, courseDescription, cohorts, courseLanguage);
        this.zoomUrl = zoomUrl;
    }
    public OnlineCourse(Long courseid, String courseName, String courseDescription,
            CourseLanguage courseLanguage, String zoomUrl) {
        super(courseid, courseName, courseDescription, courseLanguage);
        this.zoomUrl = zoomUrl;
    }

    public String getZoomUrl() {
        return zoomUrl;
    }

    public void setZoomUrl(String zoomUrl) {
        this.zoomUrl = zoomUrl;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course Id: "+getCourseid());
        System.out.println("Course Name: "+getCourseName());
        System.out.println("Course Description: "+getCourseDescription());
        System.out.println("Course Language: "+getCourseLanguage().toString());
        System.out.println("Zoom URL: "+this.zoomUrl);
        for (Cohort cohort:getCohorts()){
            cohort.displayCohortDetails();
        }
    
    }
    
}

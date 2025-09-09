package courses;

import java.util.List;

import cohort.Cohort;

public class OfflineCourse extends Course {
    private String location;
    
    public OfflineCourse(Long courseid, String courseName, String courseDescription, List<Cohort> cohorts,
            CourseLanguage courseLanguage, String location) {
        super(courseid, courseName, courseDescription, cohorts, courseLanguage);
        this.location = location;
    }
    public OfflineCourse(Long courseid, String courseName, String courseDescription,
            CourseLanguage courseLanguage, String location) {
        super(courseid, courseName, courseDescription, courseLanguage);
        this.location = location;
    }


    @Override
    public void displayCourseDetails() {
        System.out.println("Course Id: "+getCourseid());
        System.out.println("Course Name: "+getCourseName());
        System.out.println("Course Description: "+getCourseDescription());
        System.out.println("Course Language: "+getCourseLanguage().toString());
        System.out.println("Location: "+this.location);
        for (Cohort cohort:getCohorts()){
            cohort.displayCohortDetails();
        }
    
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }
   
}

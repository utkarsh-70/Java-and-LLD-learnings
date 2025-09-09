import courses.OfflineCourse;
import courses.OnlineCourse;
import instructors.Instructor;
import learners.Learner;
import learners.NodeLearner;
import cohort.Cohort;
import courses.Course;
public class App {
    public static void main(String[] args){
        Course nodeOfflineCourse=new OfflineCourse(
            1L,
            "Node.js Offline Course",
            "Learn Node.js in offline course",
            courses.CourseLanguage.Node,
            "Bangalore"
        );
        Course nodeOnlineCourse=new OnlineCourse(2L, "Node.js Online Course", "Learn Node.js online", courses.CourseLanguage.Node, "https://zoom.us/123");
        Course javaOfflineCourse=new OfflineCourse(
            3L,
            "Java Offline Course",
            "Learn Java in an offline setting",
            courses.CourseLanguage.Java,
            "Bangalore"
        );
        Course javaOnlineCourse=new OnlineCourse(4L, "Java Online Course", "Learn Java Online", courses.CourseLanguage.Java, "https://zoom.us/123");
        Cohort c1=new Cohort(1L, new java.util.Date(), new java.util.Date(), "Cohort 1", "Cohort 1 Description");
        Cohort c2=new Cohort(2L, new java.util.Date(), new java.util.Date(), "Cohort 2", "Cohort 2 Description");
        Cohort c3=new Cohort(3L, new java.util.Date(), new java.util.Date(), "Cohort 3", "Cohort 3 Description");
        Cohort c4=new Cohort(4L, new java.util.Date(), new java.util.Date(), "Cohort 4", "Cohort 4 Description");

        nodeOfflineCourse.addCohortToCourse(c1);
        nodeOfflineCourse.addCohortToCourse(c2);
        nodeOfflineCourse.addCohortToCourse(c3);
        nodeOfflineCourse.addCohortToCourse(c4);
        Learner l1=new NodeLearner(1L,"Yes",1L,"Utkarsh","utkarshchaubey78@gmail.com");
        c1.addLearnersToCohort(l1);
        Instructor i1=new Instructor("Pawan",1L, "pawan@gmail.com");
        c1.addInstructorsToCohort(i1);
        nodeOfflineCourse.displayCourseDetails();
    }
    
}

package layeredarchitecture.business;

import java.util.List;

import layeredarchitecture.core.logging.Logger;
import layeredarchitecture.dataAccess.CourseDao;
import layeredarchitecture.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
    private Logger [] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger [] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("kurs fiyatý 0 dan küçük olamaz");

        }
        for (Course cours : courses) {
            if (cours.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs adý diðerleriyle ayný olamaz ! ");
            }
        }
        courseDao.add(course);
        courses.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }

    }
}

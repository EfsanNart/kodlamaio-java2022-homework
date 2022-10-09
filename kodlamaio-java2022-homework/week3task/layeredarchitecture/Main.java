package layeredarchitecture;

import java.util.ArrayList;
import java.util.List;

import layeredarchitecture.business.CategoryManager;
import layeredarchitecture.business.CourseManager;
import layeredarchitecture.business.EducatorManager;
import layeredarchitecture.core.logging.DatabaseLogger;
import layeredarchitecture.core.logging.FileLogger;
import layeredarchitecture.core.logging.Logger;
import layeredarchitecture.core.logging.MailLogger;
import layeredarchitecture.dataAccess.hibernate.HibernateCategoryDao;
import layeredarchitecture.dataAccess.hibernate.HibernateEducatorDao;
import layeredarchitecture.dataAccess.jdbc.JdbcCourseDao;
import layeredarchitecture.entities.Category;
import layeredarchitecture.entities.Course;
import layeredarchitecture.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		
		Category category=new Category(1,"Programming");
		
		
		List<Category> categoryDb = new ArrayList<>();
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers,categoryDb);
		categoryManager.add(category);
		
		
		System.out.println("/////////////////////////////////////////////////////////////////");
		
		Course course1 = new Course(1, "Java2022", 100);
		Course course2 = new Course(2, ".NET", 150);
		Course course3 = new Course(3, "JavaScript", 120);
		Course course4 = new Course(4, "Java+React", 200);
		Course course5 = new Course(5, "C#+ANGULAR", 250);
		
		List<Course> courseDb = new ArrayList<>();
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courseDb);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		
		System.out.println("/////////////////////////////////////////////////////////////////");
		
		Educator educator = new Educator(1, "Engin", "Demiroð");
		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.add(educator);
		
	}
}

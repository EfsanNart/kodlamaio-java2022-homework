package layeredarchitecture.dataAccess.hibernate;

import layeredarchitecture.dataAccess.CourseDao;
import layeredarchitecture.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi");
		
	}

}

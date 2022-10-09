package layeredarchitecture.dataAccess.jdbc;

import layeredarchitecture.dataAccess.CourseDao;
import layeredarchitecture.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanýna eklendi");
		
	}

}

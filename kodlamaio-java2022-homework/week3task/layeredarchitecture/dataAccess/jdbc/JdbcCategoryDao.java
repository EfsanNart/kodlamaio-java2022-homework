package layeredarchitecture.dataAccess.jdbc;

import layeredarchitecture.dataAccess.CategoryDao;
import layeredarchitecture.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanýna eklendi");
		
	}

}

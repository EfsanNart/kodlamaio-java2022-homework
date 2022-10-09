package layeredarchitecture.dataAccess.hibernate;

import layeredarchitecture.dataAccess.CategoryDao;
import layeredarchitecture.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanýna eklendi");
		
	}

}

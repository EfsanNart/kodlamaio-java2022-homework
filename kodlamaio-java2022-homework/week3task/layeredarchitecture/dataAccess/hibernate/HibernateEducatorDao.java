package layeredarchitecture.dataAccess.hibernate;

import layeredarchitecture.dataAccess.EducatorDao;
import layeredarchitecture.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile veritabanýna eklendi");
		
	}

}

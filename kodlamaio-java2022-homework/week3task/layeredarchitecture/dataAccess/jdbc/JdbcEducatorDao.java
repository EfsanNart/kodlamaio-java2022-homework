package layeredarchitecture.dataAccess.jdbc;

import layeredarchitecture.dataAccess.EducatorDao;
import layeredarchitecture.entities.Educator;

public class JdbcEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("JDBC ile veritabanýna eklendi");
		
	}

}

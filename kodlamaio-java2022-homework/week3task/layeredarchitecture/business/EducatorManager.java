package layeredarchitecture.business;



import layeredarchitecture.core.logging.Logger;
import layeredarchitecture.dataAccess.EducatorDao;
import layeredarchitecture.entities.Educator;

public class EducatorManager {

	private EducatorDao educatorDao;
    private Logger[] loggers;


    public EducatorManager(EducatorDao educatorDao, Logger [] loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
        
    }

    public void add(Educator educator) {
        educatorDao.add(educator);
        for (Logger logger : loggers) {
            logger.log(educator.getEducatorId() + " " + educator.getEducatorName() + " " + educator.getEducatorLastName() + "\n" );
        }
    }
}

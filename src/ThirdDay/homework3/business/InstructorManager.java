package ThirdDay.homework3.business;

import ThirdDay.homework3.core.logging.Logger;
import ThirdDay.homework3.dataAccess.InstructorDao;
import ThirdDay.homework3.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger logger:loggers){
            logger.log(instructor.getFirstName());
        }
    }
}

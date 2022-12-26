package business;

import core.logging.Logger;
import dataAccess.Dao;
import entities.Instructor;

import java.util.List;

public class InstructorManager extends Manager<Instructor> {
    private Dao<Instructor> dao;
    private List<Logger> loggers;

    public InstructorManager(Dao<Instructor> dao, List<Logger> loggers) {
        super(dao, loggers);
        this.dao = dao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        dao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getName() + " added to database");
        }
    }
}

package business;

import core.logging.Logger;
import dataAccess.Dao;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager<T> {
    private Dao<T> dao;
    private List<Logger> loggers;

    public Manager(Dao<T> dao, List<Logger> loggers) {
        this.dao = dao;
        this.loggers = loggers;
    }

    public ArrayList<T> getAll() {
        return dao.getAllDbData();
    }

    public T getElementById(int id) {
        return dao.getOneDbData(id - 1);
    }

    public abstract void add(T t) throws Exception;
}

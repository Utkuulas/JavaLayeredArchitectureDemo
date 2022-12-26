package dataAccess.instructor;

import dataAccess.Dao;
import entities.Instructor;

public abstract class InstructorDao extends Dao<Instructor> {
    public abstract void add(Instructor instructor);
}

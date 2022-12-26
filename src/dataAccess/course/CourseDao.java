package dataAccess.course;

import dataAccess.Dao;
import entities.Course;

public abstract class CourseDao extends Dao<Course> {
    public abstract void add(Course course);
}

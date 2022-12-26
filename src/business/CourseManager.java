package business;

import dataAccess.Dao;
import entities.Course;
import core.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CourseManager extends Manager<Course> {
    private Dao<Course> dao;
    private ArrayList<String> courseNames;
    private List<Logger> loggers;

    public CourseManager(Dao<Course> dao, List<Logger> loggers) {
        super(dao, loggers);
        this.dao = dao;
        this.loggers = loggers;
        this.courseNames = new ArrayList<>();
    }

    public ArrayList<String> getCourseNames() {
        for (Course course : dao.getAllDbData()) {
            courseNames.add(course.getName().toLowerCase());
        }
        return courseNames;
    }

    @Override
    public void add(Course course) throws Exception {
        if (isValidCourse(course) == 0) {
            dao.add(course);
            for (Logger logger : loggers) {
                logger.log(course.getName() + " added to database");
            }
        } else if (isValidCourse(course) == 1) {
            throw new Exception("There is another course with the same name in the database!");
        } else if (isValidCourse(course) == 2) {
            throw new Exception("The course price must be equals or greater than 0!");
        }
    }

    private int isValidCourse(Course course) {
        if (getCourseNames().contains(course.getName().toLowerCase())) {
            return 1;
        }
        if (course.getPrice() < 0) {
            return 2;
        }
        return 0;
    }
}

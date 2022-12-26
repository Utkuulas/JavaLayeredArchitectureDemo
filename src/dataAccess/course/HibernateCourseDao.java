package dataAccess.course;

import entities.Course;

public class HibernateCourseDao extends CourseDao {
    @Override
    public void add(Course course) {
        dbData.add(course);
        System.out.println(course.getName() + " added to database with Hibernate");
    }
}

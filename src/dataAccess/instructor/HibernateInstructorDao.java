package dataAccess.instructor;

import entities.Instructor;

public class HibernateInstructorDao extends InstructorDao {
    @Override
    public void add(Instructor instructor) {
        dbData.add(instructor);
        System.out.println(instructor.getName() + " added to database with Hibernate");
    }
}

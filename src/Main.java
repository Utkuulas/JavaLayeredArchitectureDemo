import business.CategoryManager;
import business.CourseManager;
import business.Manager;
import business.InstructorManager;
import dataAccess.category.JdbcCategoryDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.instructor.HibernateInstructorDao;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.MailLogger;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Manager<Category> categoryManager =
                new CategoryManager(
                        new JdbcCategoryDao(),
                        Arrays.asList(
                                new DatabaseLogger(),
                                new MailLogger()
                        )
                );

        try {
            System.out.println("------------------------------");
            categoryManager.add(new Category("Electronics"));
            System.out.println("------------------------------");
            categoryManager.add(new Category("Electronics"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Manager<Instructor> instructorManager =
                new InstructorManager(
                        new HibernateInstructorDao(),
                        Arrays.asList(
                                new DatabaseLogger(),
                                new FileLogger(),
                                new MailLogger()
                        )
                );

        try {
            System.out.println("------------------------------");
            instructorManager.add(new Instructor("Utku Ulaş Altın"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Manager<Course> courseManager =
                new CourseManager(
                        new JdbcCourseDao(),
                        Arrays.asList(
                                new DatabaseLogger(),
                                new FileLogger(),
                                new MailLogger()
                        )
                );

        try {
            System.out.println("------------------------------");
            courseManager.add(
                    new Course(
                            "PCB Designing",
                            0,
                            instructorManager.getElementById(1),
                            categoryManager.getElementById(1)
                    )
            );
            System.out.println("------------------------------");
            courseManager.add(
                    new Course(
                            "Power Electronics",
                            -1,
                            instructorManager.getElementById(1),
                            categoryManager.getElementById(1)
                    )
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
package ThirdDay.homework3;

import ThirdDay.homework3.business.CategoryManager;
import ThirdDay.homework3.business.CourseManager;
import ThirdDay.homework3.business.InstructorManager;
import ThirdDay.homework3.core.logging.DatabaseLogger;
import ThirdDay.homework3.core.logging.FileLogger;
import ThirdDay.homework3.core.logging.Logger;
import ThirdDay.homework3.core.logging.MailLogger;
import ThirdDay.homework3.dataAccess.HibernateInstructorDao;
import ThirdDay.homework3.dataAccess.JdbcCategoryDao;
import ThirdDay.homework3.dataAccess.JdbcCourseDao;
import ThirdDay.homework3.entities.Category;
import ThirdDay.homework3.entities.Course;
import ThirdDay.homework3.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new MailLogger()};

        Instructor instructor1 = new Instructor(1, " Engin", "DEMIROG");

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);

        System.out.println("EGITMEN\n");
        instructorManager.add(instructor1);

        Category category = new Category(1, " YAZILIM");

        List<Category> categories = new ArrayList<>();

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categories, loggers);

        System.out.println("KATEGORI\n");
        categoryManager.add(category);


        Course course = new Course(1, "Java", 10.000, instructor1, category, "Yazılım");

        List<Course> courses = new ArrayList<>();

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);

        Course course1 = new Course(2, "Java", -1, instructor1, category, "Yazılım");

        System.out.println("KURS\n");
        courseManager.add(course);
        courses.add(course);
        courseManager.add(course1);

    }
}

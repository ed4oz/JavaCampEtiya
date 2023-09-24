package ThirdDay.homework3.dataAccess;

import ThirdDay.homework3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Kategori JDBC ile veritabanına eklendi: "+  instructor.getFirstName()+ " " + instructor.getLastName());
    }
}

package ThirdDay.homework3.dataAccess;

import ThirdDay.homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen hibernate ile veritabanına eklendi: "+ instructor.getFirstName()+ " " + instructor.getLastName());
    }
}

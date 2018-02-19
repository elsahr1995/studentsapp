package dao;

import models.Student;

import java.util.List;

public interface StudentDao {

    List<Student> values ();
    Student find(Long id);
    Long add(Student student);
    void update (Student student);
    Integer delete (Long id);

}

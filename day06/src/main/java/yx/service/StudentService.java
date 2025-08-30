package yx.service;

import yx.entity.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    List<Student> listAll();
}

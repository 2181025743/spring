package yx.mapper;

import org.springframework.stereotype.Repository;
import yx.entity.Student;

import java.util.List;

@Repository
public interface StudentMapper {
    int saveStudent(Student student);  // 插入记录

    List<Student> findAll();           // 查询所有
}
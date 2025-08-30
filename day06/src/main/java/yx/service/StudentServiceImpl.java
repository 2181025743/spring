package yx.service;

import org.springframework.stereotype.Service;
import yx.entity.Student;
import yx.mapper.StudentMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public void save(Student student) {
        studentMapper.saveStudent(student);
    }

    @Override
    public List<Student> listAll() {
        return studentMapper.findAll();
    }
}

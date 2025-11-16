package com.example.studentapi.service;

import com.example.studentapi.dto.StudentDTO;
import com.example.studentapi.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Student createStudent(StudentDTO dto);
    Student updateStudent(Long id, StudentDTO dto);
    void deleteStudent(Long id);
    Student getStudentById(Long id);
    Page<Student> getAllStudents(Pageable pageable);
    Page<Student> searchByName(String name, Pageable pageable);
    Page<Student> searchByCourse(String course, Pageable pageable);
}

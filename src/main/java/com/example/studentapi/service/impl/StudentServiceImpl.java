package com.example.studentapi.service.impl;

import com.example.studentapi.dto.StudentDTO;
import com.example.studentapi.entity.Student;
import com.example.studentapi.exception.ResourceNotFoundException;
import com.example.studentapi.repository.StudentRepository;
import com.example.studentapi.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student createStudent(StudentDTO dto) {
        Student s = new Student();
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setCourse(dto.getCourse());
        s.setAge(dto.getAge());
        return repo.save(s);
    }

    @Override
    public Student updateStudent(Long id, StudentDTO dto) {
        Student existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        existing.setName(dto.getName());
        existing.setEmail(dto.getEmail());
        existing.setCourse(dto.getCourse());
        existing.setAge(dto.getAge());
        return repo.save(existing);
    }

    @Override
    public void deleteStudent(Long id) {
        Student existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        repo.delete(existing);
    }

    @Override
    public Student getStudentById(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    @Override
    public Page<Student> getAllStudents(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @Override
    public Page<Student> searchByName(String name, Pageable pageable) {
        return repo.findByNameContainingIgnoreCase(name, pageable);
    }

    @Override
    public Page<Student> searchByCourse(String course, Pageable pageable) {
        return repo.findByCourseContainingIgnoreCase(course, pageable);
    }
}

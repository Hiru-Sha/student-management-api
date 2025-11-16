package com.example.studentapi.repository;

import com.example.studentapi.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findByNameContainingIgnoreCase(String name, Pageable pageable);
    Page<Student> findByCourseContainingIgnoreCase(String course, Pageable pageable);
}

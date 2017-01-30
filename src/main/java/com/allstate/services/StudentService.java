package com.allstate.services;

import com.allstate.entities.Student;
import com.allstate.repositories.IStudentRepository;
import com.sun.javafx.tools.packager.bundlers.BundleParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository repository;

    public StudentService(IStudentRepository repository){
        this.repository = repository;
    }

    public Student create(Student s){
        return this.repository.save(s);
    }

    public Student findById(int id) {
        return this.repository.findOne(id);
    }

    public Student findByEmail(String email) {
        return this.repository.findByEmail(email);
    }
}

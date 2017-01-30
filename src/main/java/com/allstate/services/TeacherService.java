package com.allstate.services;

import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import com.allstate.repositories.ITeacherRepository;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeacherService {
    @Autowired
    private ITeacherRepository repository;

    public TeacherService(ITeacherRepository repository){
        this.repository = repository;
    }


    public Teacher create(Teacher t) {
        return this.repository.save(t);
    }

    public Teacher findById(int id) {
        return this.repository.findOne(id);
    }

    public ArrayList<Teacher> findByGender(Gender female) {
        return this.repository.findByGender(female);
    }

    public ArrayList<Teacher> findByAgeGreaterThan(int age) {
        return this.repository.findByAgeGreaterThan(age);
    }
}
